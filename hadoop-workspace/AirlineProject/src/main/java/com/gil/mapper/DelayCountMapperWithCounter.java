package com.gil.mapper;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import com.gil.common.AirlinePerformanceParser;
import com.gil.counter.DelayCounters;

// 당연히 extends로 Mapper 받아야함 
public class DelayCountMapperWithCounter extends Mapper<LongWritable, Text, Text, IntWritable>{
	private String workType;
	private final static IntWritable outputValue = new IntWritable(1);
	private Text outputKey = new Text();
	
	// 우클릭으로 소스 -> 오버라이드 추가 -> setup
	@Override
	protected void setup(Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// super.setup(context);  // 이거 삭제, 쓰면 안됨
		workType = context.getConfiguration().get("workType");
	}

	// 우클릭으로 소스 -> 오버라이드~~ -> map 추가
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//super.map(key, value, context);  //  <-  역시 삭제
		AirlinePerformanceParser parser = new AirlinePerformanceParser(value);
		if(workType.equals("departure")) {
			// counter를 쓸거라 여기부터 달라짐
			if(parser.isDepartureDelayAvailable()) {
				if(parser.getDepartureDelayTime() > 0) {  // 0보다 큰놈은 그냥 이렇게 함.
					outputKey.set(parser.getYear() + "," + parser.getMonth());
					context.write(outputKey, outputValue);
				}else if(parser.getDepartureDelayTime() == 0) { // 정시 출발했으면 -> counter만 증가시킬 것
					// 어떻게 counter만 증가시키느냐
					context.getCounter(DelayCounters.scheduled_departure).increment(1);
				}else if(parser.getDepartureDelayTime() < 0) { // 음수 = 일찍 출발한 놈
					context.getCounter(DelayCounters.early_departure).increment(1);
				}
			}else {  // 값이 없는 놈
				context.getCounter(DelayCounters.not_available_departure).increment(1);
			}
		}else if(workType.equals("arrive")) {  // 도착일 경우
			// 위 내용 보고 잘 따라쓰면 채울 수 있음
			if (parser.isArriveDelayAvailable()) {
				if (parser.getArriveDelayTime() > 0) {
					outputKey.set(parser.getYear() + "," + parser.getMonth());
					context.write(outputKey, outputValue);
				} else if (parser.getArriveDelayTime() == 0) {
					context.getCounter(DelayCounters.scheduled_arrival).increment(1);
				} else if (parser.getArriveDelayTime() < 0) {
					context.getCounter(DelayCounters.early_arrival).increment(1);
				}
			} else {
				context.getCounter(DelayCounters.not_available_arrival).increment(1);
			}
			
		}
	}
	
	
}


// 이거에 대한 dirver는 고칠게 없음
// 드라이버 새로 만들고 복붙,
// 드라이버에서 이름만 바꿔주면 됨
// (DelayCount 랑 내용이 같음)
//
// 드라이버 생성
// DelatCountWithCounters




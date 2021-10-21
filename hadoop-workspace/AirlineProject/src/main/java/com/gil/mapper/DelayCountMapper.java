package com.gil.mapper;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import com.gil.common.AirlinePerformanceParser;

public class DelayCountMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	private String workType;
	private final static IntWritable outputvalue = new IntWritable(1);
	private Text outputKey = new Text();
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//super.map(key, value, context); // 삭제
		AirlinePerformanceParser parser = new AirlinePerformanceParser(value);
		
		outputKey.set(parser.getYear() + "," + parser.getMonth());
		
		if(workType.equals("departure")) {
			if(parser.getDepartureDelayTime() > 0) {  // getDepartureDelayTime 가 양수일 경우
				context.write(outputKey, outputvalue);
			}
		}else if(workType.equals("arrive")) {
			// 바로 위의 if 그대로 복사해서 수정
			if(parser.getArriveDelayTime() > 0) {
				context.write(outputKey, outputvalue);
			}
		}
	}
	@Override
	protected void setup(Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//super.setup(context); //삭제
		workType = context.getConfiguration().get("workType");
				// 맵퍼 객체 생성할때, 1번만 함
	}
	
	// 오버라이드 2개 할것 map setup
	
}



// 다음에 DelayCount 라는 드라이버 생성

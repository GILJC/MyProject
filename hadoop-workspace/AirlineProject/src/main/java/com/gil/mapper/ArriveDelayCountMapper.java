package com.gil.mapper;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import com.gil.common.AirlinePerformanceParser;

// 이번엔 도착 지연.    extends 추가
public class ArriveDelayCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	// 출발 지연 멥퍼 에서 그대로 긁어옴
	private final static IntWritable outputValue = new IntWritable(1);
	private Text outputKey = new Text(); // 객체만 미리 만들어둠

	// 이상태에서 맵 함수 가져옴
	// 우클릭 -> 소스 -> 오버라이드 임플먼트 메소드 -> map
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// super.map(key, value, context); 이부분 삭제
		AirlinePerformanceParser parser = new AirlinePerformanceParser(value);

		outputKey.set(parser.getYear() + "," + parser.getMonth());

		// 지금은 워드 대신 지연이니까
		// 몇년 몇월에 몇건, -> 그래서 키를 저걸로 줌 -> (콤마)

		// 출발 딜레이시간이 아닌, 도착 지연시간이 0보다 큰걸로
		// 이것만 바꾸면 됨
		if (parser.getArriveDelayTime() > 0) {
			context.write(outputKey, outputValue);
		} // 1 , 1

		// 이러면 멥퍼 끝

	}
}

// 리듀서는 그대로 사용 가능.

// driver만 만들면 됨
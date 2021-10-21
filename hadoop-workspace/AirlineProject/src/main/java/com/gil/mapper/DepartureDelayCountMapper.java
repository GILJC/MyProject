package com.gil.mapper;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import com.gil.common.AirlinePerformanceParser;
// 출발 지연 맵퍼

// 얘는 당연히 mapper 를 상속 받아야 함 (extends Mapper)
// 이놈은 지네릭
public class DepartureDelayCountMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	private final static IntWritable outputValue = new IntWritable(1);
	private Text outputKey = new Text();  //  객체만 미리 만들어둠
	
	// 이상태에서 맵 함수 가져옴
	// 우클릭 -> 소스 -> 오버라이드 임플먼트 메소드 -> map
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// super.map(key, value, context);  이부분 삭제
		AirlinePerformanceParser parser = new AirlinePerformanceParser(value);
		
		outputKey.set(parser.getYear() + "," + parser.getMonth());
	
	// 지금은 워드 대신 지연이니까
	// 몇년 몇월에 몇건,  -> 그래서 키를 저걸로 줌 -> (콤마)
	
	if(parser.getDepartureDelayTime() > 0) {
		context.write(outputKey, outputValue);
	}					// 	1	,	1
	
	// 이러면 멥퍼 끝
	
	}

}






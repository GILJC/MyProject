package com.gil.reducer;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class DelayCountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{
	private IntWritable result = new IntWritable();

	// 우클릭 -> 소스 -> 오버리아드,임플,메소드 -> 리듀스 클릭
	@Override
	// protected void reduce(Text arg0, Iterable<IntWritable> arg1,  //  -> 변경
	protected void reduce(Text key, Iterable<IntWritable> values,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		// TODO Auto-generated method stub						// context로 변경  <- args였음
		//super.reduce(arg0, arg1, arg2);  -> 삭제
		int sum = 0;
		
		for(IntWritable value : values) {
			sum += value.get();
		}
		result.set(sum);
		context.write(key, result);
		
		
	}
	// 이제 driver 패키지 생성하러 가야함
	
}

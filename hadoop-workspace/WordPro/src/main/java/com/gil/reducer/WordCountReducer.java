package com.gil.reducer;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{
					// extends Reducer<Text, IntWritable, Text, IntWritable> 쓰고 import 자도 추가 (C+S+o)
	private IntWritable result = new IntWritable();

	@Override  // -> 우클릭 -> Source -> 오버라이드/임플먼트 메소드 -> 리듀서의 run 만 체크하고 ok하면 추가됨
	protected void reduce(Text key, Iterable<IntWritable> values,  // args1 -> values 변경
						//	arg -> key 로 변경
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		// TODO Auto-generated method stub						// context로 변경
		//super.reduce(arg0, arg1, arg2);  -> 이건 안씀
		int sum = 0;
		for(IntWritable value : values) {
			sum += value.get();
		}	//  sum은 동일한 단어에 대해서 갯수 구함
		result.set(sum);
		context.write(key, result);
	}				// hadoop이란놈에 대해서 전부 더한것 -> 이게 리듀서의 출력
	
	// MapReduce.pdf 파일의 그림 참고. 그래도 만드는중.  셔플을 알아서 해줌
}



package com.gil.mapper;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// 멥퍼로 들어오는건,  ->  2단계  -> 앞의 1단계 / 뒤의 2단계   <-   MapReduce.pdf  파일의 그림 참고
// 모든 값은 key:value 형태로 들어옴
// 문자열이 value, 해당 라인의 라인 번호가 key

								// extends <- 이부분 추가 후 import 추가(Ctrl+Shift+o)  -> 위에거 보고 맞는걸로 추가해야함
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
									//		key=입력,		키의 value, key값은 단어, value값은 숫자 1
						// int 가 아닌 이유(long) -> 대량의 데이터니까 int로 모자람
	private final static IntWritable one = new IntWritable(1);
	private Text word = new Text();
	
	@Override  // 우클릭 -> Source -> 오버라이드/임플~ 메소드 클릭 -> 멥퍼에서, run 부분만 체크 -> OK하면 소스 추가됨
	protected void map(LongWritable key, Text value,
			Mapper<LongWritable, Text, Text, IntWritable>.Context context)  //context -> data를 뭔가 주고 받을때 이용
			throws IOException, InterruptedException {
		
		StringTokenizer strToken = new StringTokenizer(value.toString());
		// 여기서 Ctrl + Shift + o ->   import java.util.StringTokenizer;
		// 위의 value값=한 라인의 내용 -> toString으로 string 타입으로 바꿔줌, 토크나이저로 단어별로 잘라줌
		while(strToken.hasMoreElements()) {
			word.set(strToken.nextToken());  // netxtToken 으로 단어 하나씩 word에 넣어주는것
			context.write(word, one); // context로 리듀스에 -> 단어, 1(일) 을 계속 넘겨주는 것
		}
	}
}


/*
 
 ) 하둡에서 기본적으로 제공하는 데이터 타입
● BooleanWritable
● ByteWritable
● DoubleWritable
● FloatWritable
● IntWritable
● LongWritable
● TextWrapper (UTF8 형태의 문자열)
● NullWritable (데이터 값이 필요 없을때)
 
 */


/*
 멥퍼로 들어오는건,  ->  2단계  -> 앞의 1단계 / 뒤의 2단계   <-   MapReduce.pdf  파일의 그림 참고

모든 값은 key:value 형태로 들어옴
문자열이 value
해당 라인의 라인 번호가 key

LongWritable, Text,
입력,  key 벨류

int 가 아닌 이유 -> 대량의 데이터니까 int로 모자람


key값은 단어, value값은 숫자 1
Text, IntWritable
*/




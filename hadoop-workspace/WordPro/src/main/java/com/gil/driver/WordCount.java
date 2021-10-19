package com.gil.driver;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import com.gil.mapper.WordCountMapper;
import com.gil.reducer.WordCountReducer;

public class WordCount {
	public static void main(String[] args) throws Exception{
		Configuration conf = new Configuration();
		// 이거 쓰고, import 추가 -> import org.apache.hadoop.conf.Configuration;
		if(args.length != 2) {  // 들어오는 값이 2개가 아닐 경우
			System.err.println("Usage: WordCount <input> <output>");  // 사용법 안내, input, output 넣어라
			System.exit(2);  // 프로그램 종료
		}
		// 틀에 맞춰서 코딩하면 됨			// 요거 이름 고쳐주고 (1)
		Job job = Job.getInstance(conf, "WordCount"); // 위에서 설정한 conf, job count(="WordCount")
		// 잡의 이름을 지정하는 부분
		// 익셉션 핸들링 해야 하는 부분인데 귀찮으니까 넘긴다 -> 상단에 throws Exception 추가
		
		//   이 3개 이름 고쳐주는것(2)  -> 할건 이 2개밖에 없음.  -> 나중에 특별한거 나올때만 다른거 손댐
		job.setJarByClass(WordCount.class);  // 드라이버 clas 이름.
		job.setMapperClass(WordCountMapper.class);  // 멥퍼 클래스 이름을 줌 -> WordCountMApper -> 앞의 파일에서 지정해둔것
		job.setReducerClass(WordCountReducer.class);  // reducer 클래스의 이름을 줌
		// 이 3개는 항상 이렇게 됨
		
		job.setInputFormatClass(TextInputFormat.class);  //C+S+o 로 import -> 중간에  lib 껴있는놈으로 import 해야 함  -> 이름 비슷한거 다른거 하면 안됨
		job.setOutputFormatClass(TextOutputFormat.class);
		// 이 2개는 특별한 일 없으면 항상 고정. 바꿀 것 없음
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		// WordCount니까 단어, 숫자 의 연속
		// 위처럼 할거면 얘도 손댈 것 없음
		
		FileInputFormat.addInputPath(job, new Path(args[0]));  // path 에 args[0]을 준것
		FileOutputFormat.setOutputPath(job, new Path(args[1]));  //  얘는 [1]
				
		job.waitForCompletion(true);
		// job이 끝날때까지 기다려라.  끝나면 종료하라 라는 뜻
	}
}

// sample wordcount돌릴때, 맨 마지막에, sample-input sample-output
// 프로그램이 인자를 2개 받았었음. -> 우리도 이렇게 만들 것
// args 인자가 2개가 아니면 에러 발생시킴  => if(args.length != 2) {



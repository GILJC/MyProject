package com.gil.driver;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import com.gil.mapper.DelayCountMapperWithCounter_JFK;
import com.gil.reducer.DelayCountReducer;

// 좀전에 한 DelayCount랑 달라진게 없음.
// 복붙하고, 이름만 바꿔서 바로 사용.

									// extends 이후 추가
public class DelayCountWithCounters_JFK extends Configured implements Tool{
	public static void main(String[] args) throws Exception { // throws exception 추가
		int res = ToolRunner.run(new Configuration(), new DelayCountWithCounters_JFK(), args);
		System.out.println("MR-Job Result:" + res);		// 이름 DelatCountWithCounters로 수정
	}													//		(DelatCount였음)
	public int run(String[] args) throws Exception {
		String[] otherArgs = new GenericOptionsParser(getConf(), args).getRemainingArgs();
		
		if(otherArgs.length !=2) {
			System.out.println("Usage: DelayCountWithCounters_JFK <input> <output>");
			System.exit(2);
		}						// 각 이름들  전부 DelatCount -> DelatCountWithCounters 로 고치면 됨
		
		Job job = Job.getInstance(getConf(), "DelayCountWithCounters_JFK");
					// 이름 수정 DelatCount -> DelatCountWithCounters
		job.setJarByClass(DelayCountWithCounters_JFK.class);  //  수정
		job.setMapperClass(DelayCountMapperWithCounter_JFK.class);		// 수정
		job.setReducerClass(DelayCountReducer.class);	// reducer는 그대로
		
		// 나머진 그대로
		// 그리고 import
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
				
		job.waitForCompletion(true);
		
		return 0;
		
	}
}

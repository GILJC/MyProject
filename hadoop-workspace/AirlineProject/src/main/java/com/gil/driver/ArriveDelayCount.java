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

import com.gil.mapper.ArriveDelayCountMapper;
import com.gil.reducer.DelayCountReducer;

public class ArriveDelayCount {
										// throws Exception 추가
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		
		if(args.length != 2) {
			System.out.println("Usage: ArriveDelayCount <input> <output>");
			System.exit(2);
		}
						// conf : 외부에서 프로그램 실행할때, 인자 얘가 받음
		Job job = Job.getInstance(conf, "ArriveDelayCount");
		
		job.setJarByClass(ArriveDelayCount.class);
		job.setMapperClass(ArriveDelayCountMapper.class);
		job.setReducerClass(DelayCountReducer.class);
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
				
		job.waitForCompletion(true);

	}
}


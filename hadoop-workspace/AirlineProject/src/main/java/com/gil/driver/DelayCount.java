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

import com.gil.mapper.DelayCountMapper;
import com.gil.reducer.DelayCountReducer;

public class DelayCount extends Configured implements Tool{
	public static void main(String[] args) throws Exception{
		int res = ToolRunner.run(new Configuration(), new DelayCount(), args);
		System.out.println("MR-Job Result:" + res);
	}
	
	// 아까는 맵, 리듀스등 다 이것저것 설정했는데,
	// 여기는 여디갔냐

	// Tool 이 있으면
	// 우클릭 -> 소스 -> 오버라이드 임플 메소드 -> Tool 보면 -> run 이 있음 -> ok로 불러옴

	@Override
	public int run(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//다음 추가
		String[] otherArgs = new GenericOptionsParser(getConf(), args).getRemainingArgs();
		// 하고 import 추가 (Ctrl + Shift + o)
		
		// bin/yarn jar /mnt/share/AirlineProject-0.1.jar com.adacho.driver.ArriveDelayCount air-input arr-delay-count
		// 라고 치는데
		// 위의 ,args) 가 뒤의 인자들을 가져오는데
		// getRemainingArgs() 가 추가로 가져오는 인자들을 가져옴
		
		// 예를들어 -D workType=departure 를 추가 한 경우
		// bin/yarn jar /mnt/share/AirlineProject-0.1.jar com.adacho.driver.ArriveDelayCount -D workType=departure air-input arr-delay-count
		//
		
		// 그냥 args에는 다 들어오는데
		// 추가를 뺴주는게 new GenericOptionsParser(getConf(), args).getRemainingArgs(); 이거
		// 라고ㅓ 하는데 시발 말 계속 바꿔대는데 뭐라는건지 알수가 있어야지 정리도 안해주내 시발
		// 그냥 따로 공부하라는거내 시발
		
		if(otherArgs.length !=2) { // 들어오는 인자가 2개가 아니면 다음을 출력 -> 2개 인자로 받아라
			System.out.println("Usage: DelayCount <input> <output>");
			System.exit(2);
		}
		
		// 전에 했던거 긁어오기
		
		// !(차이점)!
		
		// 아까는 이것들이 main에 들어있었는데
		// 지금은 run 안에 넣고 위처럼 처리함
		
		// Job job = Job.getInstance(conf, "DelayCount");  -> 변경
		Job job = Job.getInstance(getConf(), "DelayCount");
		
		job.setJarByClass(DelayCount.class);  //  수정
		job.setMapperClass(DelayCountMapper.class);		// 수정
		job.setReducerClass(DelayCountReducer.class);	// reducer는 그대로
		
		// 나머진 그대로
		// 그리고 import하면 됨
		
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


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

import com.gil.mapper.DepartureDelayCountMapper;
import com.gil.reducer.DelayCountReducer;

public class DepartureDelayCount {
	// 아래 main -> main만 쓰고 Ctrl+Space로 바로 쓸 수 있음
	public static void main(String[] args) throws Exception{
										// throws Exception 추가
		// Configuration 추가
		Configuration conf = new Configuration();
		
		if(args.length != 2) {
			System.out.println("Usage: DepatureDelayCount <input> <output>");
			System.exit(2);  // 솔직히 얘는 1주든 2주든 상관 없다고 함.
		}
		
		Job job = Job.getInstance(conf, "DepartureDelayCount");
		
		// 이제 WorPro의 drive에서 했던거 복사해서 가져옴
		// 그리고 각각의 이름만 변경 -> 지금은 출력이 똑같으니까 가능.
		// 형식 달라지면 이렇게 못씀 -> 또 달라짐
		job.setJarByClass(DepartureDelayCount.class);  // 드라이버 clas 이름.
		job.setMapperClass(DepartureDelayCountMapper.class);  // 멥퍼 클래스 이름을 줌 -> WordCountMApper -> 앞의 파일에서 지정해둔것
		job.setReducerClass(DelayCountReducer.class);  // reducer 클래스의 이름을 줌
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

// 완성하면 메이븐 업데이트 -> 인스톨  (프로젝트 우클릭 -> run as -> 메이븐 클린 -> 메이븐 인스톨)
// jar 나오면 공유폴더로 이동
// 그리고 하둡으로 돌리면 됨




// !! bug report !!
// 맵퍼랑 리듀서 정의 안되었다고 빨간줄 에러나는데,
// 그럴경우 각각의 파일들의 import를 전부 지웠다가 다시 import하고 저장하니 에러 없어짐.
// 그리고 다시 clean -> install

// 그리고 다시 maven clean 하니까  또 에러 발생함.
// 위 import 지우고 다시쓰는 작업 반복하고 clean 1번 했을때, 에러 안나면 바로 install 해야 할듯
// 이런식으로 성공함


// [해결법]
// 뭔가 꼬인것
// 상단 메뉴에서
// Project -> clean -> AirlineProject 체크하고 -> clean 누르면 에러 없어짐


// jar 생성 위치
// D:\GIL\programming\hadoop-workspace\AirlineProject\target\AirlineProject-0.1.jar

// 우분투 공유 폴더 위치
// [gil@sf_Linux-share]pwd
// /media/sf_Linux-share

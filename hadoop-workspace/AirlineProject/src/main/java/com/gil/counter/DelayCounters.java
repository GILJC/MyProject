package com.gil.counter;

public enum DelayCounters {
	// 다 직접 씀
	not_available_arrival, scheduled_arrival, early_arrival,
	not_available_departure, scheduled_departure, early_departure,
	// counter를 이놈으로 쓰겠다고 미리 설정해 줌.
	
	
	
	// 배민지 의 질문으로 생긴 추가 사항
	// 하나만 더 추가한다.
	departure_delay_jfk;
	// 존 에프 케네디 공항에서 출발 지연된 건수만
	// user count 에 추가해서
	// 카운트 하고 싶음.
	
	// common 의 parser에서
	// origin을 가져올 수 있게 string 선언해서  -> getter 함수 만들어야함
	
	// mapper with counter 에서
	// if(parser.getDepartureDelayTime() > 0) {  // 0보다 큰놈은 그냥 이렇게 함.
	// outputKey.set(parser.getYear() + "," + parser.getMonth());
	// context.write(outputKey, outputValue);
	// 여기서 한줄 추가해서
	// 존 에프 케네디일 경우
	// 카운터 추가해서
	// 늘림.
	
	// 여기까지의 내용을 파일 새로 만들어서 만들어보기.
}


// 맵퍼에서 클래스 추가
// DelayCounters


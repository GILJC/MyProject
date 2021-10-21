package com.gil.common;

import org.apache.hadoop.io.Text;

public class AirlinePerformanceParser {
//	"YEAR","MONTH","DAY_OF_MONTH","DAY_OF_WEEK","FL_DATE",
//	"UNIQUE_CARRIER","TAIL_NUM","FL_NUM","ORIGIN_AIRPORT_ID","ORIGIN",
//	"ORIGIN_STATE_ABR","DEST_AIRPORT_ID","DEST","DEST_STATE_ABR","CRS_DEP_TIME",
//	"DEP_TIME","DEP_DELAY","DEP_DELAY_NEW","DEP_DEL15","DEP_DELAY_GROUP",
//	"TAXI_OUT","WHEELS_OFF","WHEELS_ON","TAXI_IN","CRS_ARR_TIME",
//	"ARR_TIME","ARR_DELAY","ARR_DELAY_NEW","ARR_DEL15","ARR_DELAY_GROUP",
//	"CANCELLED","CANCELLATION_CODE","DIVERTED","CRS_ELAPSED_TIME","ACTUAL_ELAPSED_TIME",
//	"AIR_TIME","FLIGHTS","DISTANCE","DISTANCE_GROUP","CARRIER_DELAY",
//	"WEATHER_DELAY","NAS_DELAY","SECURITY_DELAY","LATE_AIRCRAFT_DELAY",
//	1988,1,1,5,1988-01-01,
//	"AA","","1",12478,"JFK",
//	"NY",12892,"LAX","CA","0900",
//	"0900",0.00,0.00,0.00,0,,
//	"","",,"1152",
//	"1227",35.00,35.00,1.00,2,
//	0.00,"",0.00,352.00,387.00,
//	,1.00,2475.00,10,,,
//	,,,
//	// 1줄씩으로 붙어있던거 5개씩 잘라서 줄 나눔.
//	// 위 글자위 아래 숫자가 짝이 딱 맞음, 다 5개씩 마지막은 4개 -> 이래야 column 새기 편함
	// Ctrl + /  -> 드래그한거 한번에 주석처리
	
	// 하나씩 필드로 선언
	private int year;
	private int month;
	private int day;
	
	private int arriveDelayTime = 0;		// 도착 지연 시간
	private int departureDelayTime = 0;		// 출발 지연 시간
	private int distance = 0;
	
	private boolean arriveDelayAvailable = true;
	private boolean departureDelayAvailable = true;
	private boolean distanceAvailable = true;
	
	private String uniqueCarrier;
	
	
	
	// 생성자 하나 만듦
	public AirlinePerformanceParser(Text text) {
		// text가 하나 들어온다고 가정
		
		// try, catch문 하나 생성
		try {
			String[] columns = text.toString().split(",");
			year = Integer.parseInt(columns[0]);  // 잘라낸거중에 첫번째 = year
			// int로 바꿔줘서 넣은것, 안바꾸면 문자열로 들어가므로
			month = Integer.parseInt(columns[1]);
			day = Integer.parseInt(columns[2]);  // 이놈은 위에서 보면 3번째이므로 [2]

			// uniqueCarrier는 colunms의 5번째
			uniqueCarrier = columns[5];
			// 이것들을 미리 해놓으면 나중에 맵리듀스 하기 편하기 때문.
			
			// 출발 지연 시간 = DEP_DELAY, DEP_DELAY_NEW -> 일찍 출발하면 마이너스값
			// 우린 DEP_DELAY를 쓸거임 -> 17번째 거 = [16]
			// 출발 시간 = DEP_TIME
			// 위의 지연시간[16]이 없을 수도 있으므로 if
			
			
			
			
			if(!columns[16].equals("")) {
				departureDelayTime = (int)Float.parseFloat(columns[16]);
				// 위의 2문단 짝을 맞춰보면 DEP_DELAY에 해당하는것은 0.00
			} else { // 만약 빈 값일 경우
				departureDelayAvailable = false;
			}
			// ARR_DELAY -> 도착 지연 = [26]
			if(!columns[26].equals("")) {
				arriveDelayTime = (int)Float.parseFloat(columns[26]);
			} else {
				arriveDelayAvailable = false;
			}
			
			// 그 다음 거리 = DISTANCE = 38번째 = [37]
			if(!columns[37].equals("")) {  // 아무것도 아닌게 아니면 = 있으면
				distance = (int)Float.parseFloat(columns[37]);
			} else {
				distanceAvailable = false;
			}
			// 문자열을 적으면 필요한 정보를 쫙 뽑아내겠다는것 -> 을 위해 위의 것들을 작성함
			
		} catch (Exception e) {
			
		}
	}
	// 이제 꺼내쓰는 getter만 만들면 됨
	// 위에 있는 소스들 자동으로 getter 만드는 방법
	// 빈공간 우클릭 -> 소스 -> 제너레이트 getter and settings
	// -> 오른쪽에 Select getters 만 클릭
	// generate 하면 아래 틀 생성됨

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getArriveDelayTime() {
		return arriveDelayTime;
	}

	public int getDepartureDelayTime() {
		return departureDelayTime;
	}

	public int getDistance() {
		return distance;
	}

	public boolean isArriveDelayAvailable() {
		return arriveDelayAvailable;
	}

	public boolean isDepartureDelayAvailable() {
		return departureDelayAvailable;
	}

	public boolean isDistanceAvailable() {
		return distanceAvailable;
	}

	public String getUniqueCarrier() {
		return uniqueCarrier;
	}
	
	// 파서는 마쳤고 다음에 맵퍼 만들 것.
	// 맵퍼는 패키지, 파일 새로 만듬 -> DepartureDelayCountMapper

}












package com.bitacademy.javaHomework1;

//제품 정보 수정 = 제품 판매(판매 날짜 입력)
public class P_update {
	public void P_update(int index) {
		System.out.println();
		System.out.println("상품 번호: " + CVSmanagementProgram.p_numList[index]);
		//CVSmanagementProgram.p_numList[index] = CVSmanagementProgram.sc.nextInt();
		System.out.println("상품 이름: " + CVSmanagementProgram.p_nameList[index]);
		//CVSmanagementProgram.p_nameList[index] = CVSmanagementProgram.sc.nextLine();
		System.out.println("상품 분류: " + CVSmanagementProgram.p_categoryList[index]);
		//CVSmanagementProgram.p_categoryList[index] = CVSmanagementProgram.sc.nextLine();
		System.out.println("상품 가격: " + CVSmanagementProgram.p_priceList[index]);
		//CVSmanagementProgram.p_priceList[index] = CVSmanagementProgram.sc.nextInt();
		System.out.println();
		System.out.println("판매 날짜: (판매된 날짜로 각각 변경하시오.)"
				+ CVSmanagementProgram.p_sell_yearList[index] + "년 "
				+ CVSmanagementProgram.p_sell_dateList[index] + "월 "
				+ CVSmanagementProgram.p_sell_weekList[index] + "주 "
				+ CVSmanagementProgram.p_sell_monthList[index] +"일");
		System.out.println("판매 날짜 수정: (년, 월, 주, 일 간격으로 각각 Enter로 입력), 미판매시 0으로 입력");
		System.out.print("년도: ");
		CVSmanagementProgram.p_sell_yearList[index] = CVSmanagementProgram.sc.nextInt();
		System.out.print("월: ");
		CVSmanagementProgram.p_sell_monthList[index] = CVSmanagementProgram.sc.nextInt();
		System.out.print("주: ");
		CVSmanagementProgram.p_sell_weekList[index] = CVSmanagementProgram.sc.nextInt();
		System.out.println("일: ");
		CVSmanagementProgram.p_sell_dateList[index] = CVSmanagementProgram.sc.nextInt();
		
	}
	
}
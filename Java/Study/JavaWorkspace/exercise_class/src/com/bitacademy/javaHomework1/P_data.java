package com.bitacademy.javaHomework1;

//제품 정보 출력
public class P_data {
	public void P_data(int index) {
		System.out.println("상품 index: " + index);
		System.out.println("상품 번호: " + CVSmanagementProgram.p_numList[index]);
		System.out.println("상품 이름: " + CVSmanagementProgram.p_nameList[index]);
		System.out.println("상품 분류: " + CVSmanagementProgram.p_categoryList[index]);
		System.out.println("상품 가격: " + CVSmanagementProgram.p_priceList[index]);
		System.out.println();
		System.out.println("판매 날짜: "
				+ CVSmanagementProgram.p_sell_yearList[index] + "년 "
				+ CVSmanagementProgram.p_sell_dateList[index] + "월 "
				+ CVSmanagementProgram.p_sell_weekList[index] + "주 "
				+ CVSmanagementProgram.p_sell_monthList[index] +"일");
	}
}
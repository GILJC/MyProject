package com.bitacademy.javaHomework1;

//일별 매출 집계
public class P_priceSum_date {
	public void P_priceSum() {
		System.out.println("찾는 년도: ");
		int year = CVSmanagementProgram.sc.nextInt();
		System.out.println("찾는 월: ");
		int month = CVSmanagementProgram.sc.nextInt();
		System.out.println("찾는 주: ");
		int week = CVSmanagementProgram.sc.nextInt();
		System.out.println("찾는 일: ");
		int date = CVSmanagementProgram.sc.nextInt();
		
		for (int i = 0; i < CVSmanagementProgram.count; i++) {
			if (year == CVSmanagementProgram.p_sell_yearList[i]) {
				if (month == CVSmanagementProgram.p_sell_monthList[i]) {
					if (week == CVSmanagementProgram.p_sell_weekList[i]) {
						if (date == CVSmanagementProgram.p_sell_dateList[i]) {
							CVSmanagementProgram.tmp += CVSmanagementProgram.p_priceList[i];
						}
					}
				}
			}
		}
		System.out.println("일별 매출 집계: " + CVSmanagementProgram.tmp);
		CVSmanagementProgram.priceSum_date = CVSmanagementProgram.tmp;
	}
}
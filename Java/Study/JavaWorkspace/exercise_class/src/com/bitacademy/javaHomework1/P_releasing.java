package com.bitacademy.javaHomework1;

//제품 삭제
public class P_releasing {
	public void P_releasing(int index) {
		/*
		CVSmanagementProgram.p_numList[index] = 0;
		CVSmanagementProgram.p_nameList[index] = "";
		CVSmanagementProgram.p_categoryList[index] = "";
		*/
		for (int i = index; i < CVSmanagementProgram.count; i++) {
			CVSmanagementProgram.p_numList[index] = CVSmanagementProgram.p_numList[index+1];
			CVSmanagementProgram.p_nameList[index] = CVSmanagementProgram.p_nameList[index+1];
			CVSmanagementProgram.p_categoryList[index] = CVSmanagementProgram.p_categoryList[index+1];
			CVSmanagementProgram.p_priceList[index] = CVSmanagementProgram.p_priceList[index+1];
			
			CVSmanagementProgram.p_sell_yearList[index] = CVSmanagementProgram.p_sell_yearList[index+1];
			CVSmanagementProgram.p_sell_monthList[index] = CVSmanagementProgram.p_sell_monthList[index+1];
			CVSmanagementProgram.p_sell_weekList[index] = CVSmanagementProgram.p_sell_weekList[index+1];
			CVSmanagementProgram.p_sell_dateList[index] = CVSmanagementProgram.p_sell_dateList[index+1];
		}
		
		CVSmanagementProgram.count--;
	}
}
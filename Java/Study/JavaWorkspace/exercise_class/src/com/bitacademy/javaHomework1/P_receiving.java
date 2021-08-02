package com.bitacademy.javaHomework1;

//제품 정보 입력
public class P_receiving {
	public void P_receiving() {
		System.out.println("상품 번호(숫자만 입력): ");
		int p_num = CVSmanagementProgram.sc.nextInt();
		
		System.out.println("상품 이름: (띄어쓰기없이 입력)");
		String p_name = CVSmanagementProgram.sc.next();
		
		System.out.println("상품 분류: (띄어쓰기없이 입력)");
		String p_category = CVSmanagementProgram.sc.next();	// nextLine()과의 차이 : 띄어쓰기 사용 불가. -> 띄어쓰기 전까지의 단어만 출력
		
		System.out.println("상품 가격: ");
		int p_price = CVSmanagementProgram.sc.nextInt();
		
		System.out.println("판매 날짜: (년, 월, 주, 일 간격으로 각각 Enter로 입력), 미판매시 0으로 입력");
		System.out.print("년도: ");
		int p_sell_year = CVSmanagementProgram.sc.nextInt();
		System.out.print("월: ");
		int p_sell_month = CVSmanagementProgram.sc.nextInt();
		System.out.print("주: ");
		int p_sell_week = CVSmanagementProgram.sc.nextInt();
		System.out.println("일: ");
		int p_sell_date = CVSmanagementProgram.sc.nextInt();


		
		CVSmanagementProgram.count += 1;
		
		CVSmanagementProgram.p_numList[CVSmanagementProgram.count] = p_num;
		CVSmanagementProgram.p_nameList[CVSmanagementProgram.count] = p_name;
		CVSmanagementProgram.p_categoryList[CVSmanagementProgram.count] = p_category;
		CVSmanagementProgram.p_priceList[CVSmanagementProgram.count] = p_price;
		
		CVSmanagementProgram.p_sell_dateList[CVSmanagementProgram.count] = p_sell_date;
		CVSmanagementProgram.p_sell_weekList[CVSmanagementProgram.count] = p_sell_week;
		CVSmanagementProgram.p_sell_monthList[CVSmanagementProgram.count] = p_sell_month;
		CVSmanagementProgram.p_sell_yearList[CVSmanagementProgram.count] = p_sell_year;
	}
	
}
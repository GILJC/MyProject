package com.bitacademy.javaHomework1;

//���� ���� ����
public class P_priceSum_month {
	public void P_priceSum() {
		System.out.println("ã�� �⵵: ");
		int year = CVSmanagementProgram.sc.nextInt();
		System.out.println("ã�� ��: ");
		int month = CVSmanagementProgram.sc.nextInt();
		
		for (int i = 0; i < CVSmanagementProgram.count; i++) 
			if (year == CVSmanagementProgram.p_sell_yearList[i]) 
				if (month == CVSmanagementProgram.p_sell_monthList[i]) 
							CVSmanagementProgram.tmp += CVSmanagementProgram.p_priceList[i];

		System.out.println("���� ���� ����: " + CVSmanagementProgram.tmp);
		CVSmanagementProgram.priceSum_month = CVSmanagementProgram.tmp;
	}
}
package com.bitacademy.javaHomework1;

//��ǰ ���� ���
public class P_data {
	public void P_data(int index) {
		System.out.println("��ǰ index: " + index);
		System.out.println("��ǰ ��ȣ: " + CVSmanagementProgram.p_numList[index]);
		System.out.println("��ǰ �̸�: " + CVSmanagementProgram.p_nameList[index]);
		System.out.println("��ǰ �з�: " + CVSmanagementProgram.p_categoryList[index]);
		System.out.println("��ǰ ����: " + CVSmanagementProgram.p_priceList[index]);
		System.out.println();
		System.out.println("�Ǹ� ��¥: "
				+ CVSmanagementProgram.p_sell_yearList[index] + "�� "
				+ CVSmanagementProgram.p_sell_dateList[index] + "�� "
				+ CVSmanagementProgram.p_sell_weekList[index] + "�� "
				+ CVSmanagementProgram.p_sell_monthList[index] +"��");
	}
}
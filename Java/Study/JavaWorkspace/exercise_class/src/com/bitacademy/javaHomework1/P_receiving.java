package com.bitacademy.javaHomework1;

//��ǰ ���� �Է�
public class P_receiving {
	public void P_receiving() {
		System.out.println("��ǰ ��ȣ(���ڸ� �Է�): ");
		int p_num = CVSmanagementProgram.sc.nextInt();
		
		System.out.println("��ǰ �̸�: (������� �Է�)");
		String p_name = CVSmanagementProgram.sc.next();
		
		System.out.println("��ǰ �з�: (������� �Է�)");
		String p_category = CVSmanagementProgram.sc.next();	// nextLine()���� ���� : ���� ��� �Ұ�. -> ���� �������� �ܾ ���
		
		System.out.println("��ǰ ����: ");
		int p_price = CVSmanagementProgram.sc.nextInt();
		
		System.out.println("�Ǹ� ��¥: (��, ��, ��, �� �������� ���� Enter�� �Է�), ���ǸŽ� 0���� �Է�");
		System.out.print("�⵵: ");
		int p_sell_year = CVSmanagementProgram.sc.nextInt();
		System.out.print("��: ");
		int p_sell_month = CVSmanagementProgram.sc.nextInt();
		System.out.print("��: ");
		int p_sell_week = CVSmanagementProgram.sc.nextInt();
		System.out.println("��: ");
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
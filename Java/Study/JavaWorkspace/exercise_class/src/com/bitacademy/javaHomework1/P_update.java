package com.bitacademy.javaHomework1;

//��ǰ ���� ���� = ��ǰ �Ǹ�(�Ǹ� ��¥ �Է�)
public class P_update {
	public void P_update(int index) {
		System.out.println();
		System.out.println("��ǰ ��ȣ: " + CVSmanagementProgram.p_numList[index]);
		//CVSmanagementProgram.p_numList[index] = CVSmanagementProgram.sc.nextInt();
		System.out.println("��ǰ �̸�: " + CVSmanagementProgram.p_nameList[index]);
		//CVSmanagementProgram.p_nameList[index] = CVSmanagementProgram.sc.nextLine();
		System.out.println("��ǰ �з�: " + CVSmanagementProgram.p_categoryList[index]);
		//CVSmanagementProgram.p_categoryList[index] = CVSmanagementProgram.sc.nextLine();
		System.out.println("��ǰ ����: " + CVSmanagementProgram.p_priceList[index]);
		//CVSmanagementProgram.p_priceList[index] = CVSmanagementProgram.sc.nextInt();
		System.out.println();
		System.out.println("�Ǹ� ��¥: (�Ǹŵ� ��¥�� ���� �����Ͻÿ�.)"
				+ CVSmanagementProgram.p_sell_yearList[index] + "�� "
				+ CVSmanagementProgram.p_sell_dateList[index] + "�� "
				+ CVSmanagementProgram.p_sell_weekList[index] + "�� "
				+ CVSmanagementProgram.p_sell_monthList[index] +"��");
		System.out.println("�Ǹ� ��¥ ����: (��, ��, ��, �� �������� ���� Enter�� �Է�), ���ǸŽ� 0���� �Է�");
		System.out.print("�⵵: ");
		CVSmanagementProgram.p_sell_yearList[index] = CVSmanagementProgram.sc.nextInt();
		System.out.print("��: ");
		CVSmanagementProgram.p_sell_monthList[index] = CVSmanagementProgram.sc.nextInt();
		System.out.print("��: ");
		CVSmanagementProgram.p_sell_weekList[index] = CVSmanagementProgram.sc.nextInt();
		System.out.println("��: ");
		CVSmanagementProgram.p_sell_dateList[index] = CVSmanagementProgram.sc.nextInt();
		
	}
	
}
package com.bitacademy.javaHomework1;

//�� ���� ����
public class UserUpdate {
	public void UserUpdate(int index) {
		System.out.println("�� �̸�: " + CVSmanagementProgram.userNameList[index]);
		CVSmanagementProgram.userNameList[index] = CVSmanagementProgram.sc.next();
		System.out.println("�� ����: " + CVSmanagementProgram.userGenderList[index]);
		CVSmanagementProgram.userGenderList[index] = CVSmanagementProgram.sc.next();
		System.out.println("�� ��ȣ: " + CVSmanagementProgram.userNumberList[index]);
		CVSmanagementProgram.userNumberList[index] = CVSmanagementProgram.sc.nextInt();
	}
}

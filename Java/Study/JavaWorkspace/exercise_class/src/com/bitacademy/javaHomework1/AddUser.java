package com.bitacademy.javaHomework1;

//�� �߰�
public class AddUser {
	public void AddUser() {
		System.out.println("�� key: " + CVSmanagementProgram.userCount);
		System.out.println("�� �̸�: ");
		String userName = CVSmanagementProgram.sc.next();
		
		System.out.println("�� ����: ");
		String userGender = CVSmanagementProgram.sc.next();
		
		System.out.println("�� ��ȣ");
		int userNumber = CVSmanagementProgram.sc.nextInt();
		
		CVSmanagementProgram.userNameList[CVSmanagementProgram.userCount] = userName;
		CVSmanagementProgram.userGenderList[CVSmanagementProgram.userCount] = userGender;
		CVSmanagementProgram.userNumberList[CVSmanagementProgram.userCount] = userNumber;
		
		CVSmanagementProgram.userCount++;
	}
}
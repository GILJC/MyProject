package com.bitacademy.javaHomework1;

//�� ���� ����
public class UserDelete {
	public void UserDelete(int index) {
		for(int i = index; i < CVSmanagementProgram.userCount; i++) {
			CVSmanagementProgram.userNameList[i] = CVSmanagementProgram.userNameList[i+1];
			CVSmanagementProgram.userGenderList[i] = CVSmanagementProgram.userGenderList[i+1];
			CVSmanagementProgram.userNumberList[i] = CVSmanagementProgram.userNumberList[i+1];
		}
		CVSmanagementProgram.userCount--;
	}
}
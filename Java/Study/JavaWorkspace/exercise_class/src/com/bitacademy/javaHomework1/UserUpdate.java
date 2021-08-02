package com.bitacademy.javaHomework1;

//°í°´ Á¤º¸ ¼öÁ¤
public class UserUpdate {
	public void UserUpdate(int index) {
		System.out.println("°í°´ ÀÌ¸§: " + CVSmanagementProgram.userNameList[index]);
		CVSmanagementProgram.userNameList[index] = CVSmanagementProgram.sc.next();
		System.out.println("°í°´ ¼ºº°: " + CVSmanagementProgram.userGenderList[index]);
		CVSmanagementProgram.userGenderList[index] = CVSmanagementProgram.sc.next();
		System.out.println("°í°´ ¹øÈ£: " + CVSmanagementProgram.userNumberList[index]);
		CVSmanagementProgram.userNumberList[index] = CVSmanagementProgram.sc.nextInt();
	}
}

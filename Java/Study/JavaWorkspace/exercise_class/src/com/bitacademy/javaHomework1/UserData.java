package com.bitacademy.javaHomework1;

//Æ¯Á¤ °í°´ Á¤º¸ Ãâ·Â
public class UserData {
	public void UserData(int index) {
		System.out.println("°í°´ key: " + index);
		System.out.println("°í°´ ÀÌ¸§: " + CVSmanagementProgram.userNameList[index]);
		System.out.println("°í°´ ¼ºº°: " + CVSmanagementProgram.userGenderList[index]);
		System.out.println("°í°´ ¹øÈ£: " + CVSmanagementProgram.userNumberList[index]);
	}
}

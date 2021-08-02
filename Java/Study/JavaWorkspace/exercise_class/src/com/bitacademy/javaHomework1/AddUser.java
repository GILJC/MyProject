package com.bitacademy.javaHomework1;

//°í°´ Ãß°¡
public class AddUser {
	public void AddUser() {
		System.out.println("°í°´ key: " + CVSmanagementProgram.userCount);
		System.out.println("°í°´ ÀÌ¸§: ");
		String userName = CVSmanagementProgram.sc.next();
		
		System.out.println("°í°´ ¼ºº°: ");
		String userGender = CVSmanagementProgram.sc.next();
		
		System.out.println("°í°´ ¹øÈ£");
		int userNumber = CVSmanagementProgram.sc.nextInt();
		
		CVSmanagementProgram.userNameList[CVSmanagementProgram.userCount] = userName;
		CVSmanagementProgram.userGenderList[CVSmanagementProgram.userCount] = userGender;
		CVSmanagementProgram.userNumberList[CVSmanagementProgram.userCount] = userNumber;
		
		CVSmanagementProgram.userCount++;
	}
}
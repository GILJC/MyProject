public class j5_16_EnumDemo {
	public static void main(String[] args) {
		Gender5_16 gender = Gender5_16.FEMALE;
		if (gender == Gender5_16.MALE)
			System.out.println(Gender5_16.MALE + "�� �濪 �ǹ��� �ִ�.");
		else
			System.out.println(Gender5_16.FEMALE + "�� �濪 �ǹ��� ����.");
	}
}

enum Gender5_16 {
	MALE, FEMALE
}

enum Direction5_16 {
	EAST, WEST, SOUTH, NORTH
}
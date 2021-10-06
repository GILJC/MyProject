public class j5_16_EnumDemo {
	public static void main(String[] args) {
		Gender5_16 gender = Gender5_16.FEMALE;
		if (gender == Gender5_16.MALE)
			System.out.println(Gender5_16.MALE + "은 방역 의무가 있다.");
		else
			System.out.println(Gender5_16.FEMALE + "은 방역 의무가 없다.");
	}
}

enum Gender5_16 {
	MALE, FEMALE
}

enum Direction5_16 {
	EAST, WEST, SOUTH, NORTH
}
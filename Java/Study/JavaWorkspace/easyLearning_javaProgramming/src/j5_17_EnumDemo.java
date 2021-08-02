public class j5_17_EnumDemo {
	public static void main(String[] args) {
		Gender5_17 gender = Gender5_17.FEMALE;
		if (gender == Gender5_17.MALE)
			System.out.println(Gender5_17.MALE + "은 병역 의무가 있다."); // Gender.MALE -> 문자열로 변경되야 하므로
																	// Gender.MALE.toSrting()과 동일하다.
		else
			System.out.println(Gender5_17.FEMALE + "은 병역 의무가 없다.");

		for (Gender5_17 g : Gender5_17.values()) // 반복문. for(A:B) -> B에서 차례로 객체를 꺼내 A에 넣겠다. B가 0,1,2,3,4,5 이렇게 있다면
			System.out.println(g.name()); // 열거 타입 상수 이름 반환 A=0, A=1, A=2, A=3, A=4, A=5; 이렇게 하겠다는 의미다.

		System.out.println(Gender5_17.valueOf("MALE")); // 문자열 "MALE"에 대응하는 열거 타입 상수 반환한다.
	}
}

enum Gender5_17 {
	MALE("남성"), FEMALE("여성");

	private String s;

	Gender5_17(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}
}

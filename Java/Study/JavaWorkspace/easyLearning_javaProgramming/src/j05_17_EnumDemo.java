public class j5_17_EnumDemo {
	public static void main(String[] args) {
		Gender5_17 gender = Gender5_17.FEMALE;
		if (gender == Gender5_17.MALE)
			System.out.println(Gender5_17.MALE + "�� ���� �ǹ��� �ִ�."); // Gender.MALE -> ���ڿ��� ����Ǿ� �ϹǷ�
																	// Gender.MALE.toSrting()�� �����ϴ�.
		else
			System.out.println(Gender5_17.FEMALE + "�� ���� �ǹ��� ����.");

		for (Gender5_17 g : Gender5_17.values()) // �ݺ���. for(A:B) -> B���� ���ʷ� ��ü�� ���� A�� �ְڴ�. B�� 0,1,2,3,4,5 �̷��� �ִٸ�
			System.out.println(g.name()); // ���� Ÿ�� ��� �̸� ��ȯ A=0, A=1, A=2, A=3, A=4, A=5; �̷��� �ϰڴٴ� �ǹ̴�.

		System.out.println(Gender5_17.valueOf("MALE")); // ���ڿ� "MALE"�� �����ϴ� ���� Ÿ�� ��� ��ȯ�Ѵ�.
	}
}

enum Gender5_17 {
	MALE("����"), FEMALE("����");

	private String s;

	Gender5_17(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}
}

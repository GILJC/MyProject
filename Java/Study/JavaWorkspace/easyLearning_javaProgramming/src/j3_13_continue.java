
public class j3_13_continue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue; // ¦���� ���� �Ʒ��� �� �����ϰ� ó������ ���ư���.
			System.out.print(i); // Ȧ���ϋ��� ��� = 13579
		}
	}

}

package sec06;

public interface Controllable {
	default void repair() {
		show("��� �����Ѵ�.");
	}

	static void reset() { // ���� �޼����̴�.
		System.out.println("��� �ʱ�ȭ�Ѵ�.");
	}

	private void show(String s) { // �ڹ� 9���� �����ϸ�, �ַ� ����� �޼���� ���ȴ�.
		System.out.println(s);
	}

	void turnOn();
	void turnOff(); // �߻� �޼����̴�.
}

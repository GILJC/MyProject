package sec06;

public interface Controllable {
	default void repair() {
		show("장비를 수리한다.");
	}

	static void reset() { // 정적 메서드이다.
		System.out.println("장비를 초기화한다.");
	}

	private void show(String s) { // 자바 9부터 가능하며, 주로 도우미 메서드로 사용된다.
		System.out.println(s);
	}

	void turnOn();
	void turnOff(); // 추상 메서드이다.
}

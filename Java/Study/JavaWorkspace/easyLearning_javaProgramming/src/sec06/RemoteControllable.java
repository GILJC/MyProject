package sec06;

public class RemoteControllable {
	public static void main(String[] agrs) {
		TV tv = new TV();
		Computer com = new Computer();

		tv.turnOn();
		tv.turnOff();
		tv.repair();
		com.turnOn();
		com.turnOff(); // Controllable 인터페이스로 TV 객체와
		com.repair(); // Computer 객체를 동작하는 방법이 같다.

		Controllable.reset();
		// tv.reset();
		// com.reset(); // 정적 메서드는 인터페이스로 직접 호출해야 한다.

		
	}

}

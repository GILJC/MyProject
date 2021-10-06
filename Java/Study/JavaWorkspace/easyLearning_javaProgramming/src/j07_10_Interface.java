
interface Coin_7_10 {
	int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
} // int만 표시되어 있지만, public static final int 이다.
	// 인터페이스의 모든 필드는 public static final이기 떄문이다.

///	///			///	///

//public interface Controllable_7_10 {		// -> 같은 .java파일 안에서 작업중이라 public interface 쓰면 에러남. 그래서 그냥 여기서만 interface로 사용할 것.
// 자바파일 한개당 public 클래스는 하나만 가질수 있고 그 클래스는 파일명이랑 똑같은 클래스 여야된다.  -> 이유 : 가독성 때문
interface Controllable_7_10 {
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

// public interface RemoteControllable_7_10 extends Controllable_7_10 {		// 마찬가지. 하나의 .java파일 안이라 public interface 못사용함.
interface RemoteControllable_7_10 extends Controllable_7_10 { // 인터페이스도 상속받을 때는 extends 키워드를 사용한다.
	void remoteOn();

	void remoteOff(); // RemoteControllable 인터페이스에 새로 추가한 메서드이다.
}

// public class TV implements Controllable {
class TV implements Controllable_7_10 {

	@Override
	public void turnOn() { // Controllable 인터페이스에 정의된 모든 추상 메서드를 구현해야 한다.
		System.out.println("TV를 켠다.");
	}

	@Override
	public void turnOff() { // 반드시 public이어야 한다.
		System.out.println("TV를 끈다."); // 자식은 부모보다 접근 번위가 좁으면 안 되기 때문에.
	} // 부모인 interface의 method는 모두 public이다.
} // 여기선 interface에 public을 안썼으므로 조금 다를 수 있음.

public class j7_10_Interface {
	public static void main(String[] args) {
		System.out.println("Dime은 " + Coin_7_10.DIME + "세트입니다.");

		///

		TV tv = new TV();
		Computer_7_10 com = new Computer_7_10();

		tv.turnOn();
		tv.turnOff();
		tv.repair();
		com.turnOn();
		com.turnOff(); // Controllable 인터페이스로 TV 객체와
		com.repair(); // Computer 객체를 동작하는 방법이 같다.

		Controllable_7_10.reset();
		// tv.reset();
		// com.reset(); // 정적 메서드는 인터페이스로 직접 호출해야 한다.

		Notebook_7_10 n = new Notebook_7_10(); // 자신의 생성자를 호출해도 괜찮다.
												// 단, 생성자 내부에서 호출할 때는 this()를 사용해야 한다.
		n.turnOn();
		n.turnOff();
		n.inMyBag();
	}
}

class Computer_7_10 implements Controllable_7_10 {

	@Override
	public void turnOn() {
		System.out.println("Computer를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Computer를 끈다.");
	}
}

interface Portable_7_10 {
	void inMyBag();
}

class Notebook_7_10 extends Computer_7_10 implements Portable_7_10 {
	public void inMyBag() {
		System.out.println("노트북은 가방에 있다."); // Portable_7_10 인터페이스의 메서드를 구현한다.
	}

	public void turnOn() {
		System.out.println("노트북을 켠다");
	}

	public void turnOff() {
		System.out.println("노트북을 끈다."); // Computer 클래스의 메서드를 오버라이딩 한다.
	}
}

class Vehicle_6_20 {
	String name = "탈 것";

	void whoami() {
		System.out.println("나는 탈 것이다.");
	}

	static void move() {
		System.out.println("이동하다.");
	}
}

class Car_6_20 extends Vehicle_6_20 {
	String name = "자동차";

	void whoami() {
		System.out.println("나는 자동차이다.");
	}

	static void move() {
		System.out.println("달리다.");
	}
}

public class j6_20_OvertypeDemo {
	public static void main(String[] args) {
		Vehicle_6_20 v = new Car_6_20();
		System.out.println(v.name); // 탈 것
		v.whoami(); // 나는 자동차이다.
		v.move(); // 이동하다. // -> static을 지우면 // 달리다. <-가 출력됨
		Vehicle_6_20.move(); // 이동하다.
		Car_6_20.move(); // 달리다. -> static이라 바로 쓸 수 있다.

		// ----------------

		Vehicle_6_20[] vehicles = new Vehicle_6_20[2];
		vehicles[0] = new Car_6_20();
		vehicles[1] = new SportsCar_6_20();

		for (Vehicle_6_20 v2 : vehicles)
			v2.whoami();
		// 나는 자동차이다.
		// 나는 스포츠 자동차이다.
	}
}

class SportsCar_6_20 extends Car_6_20 {
	void whoami() {
		System.out.println("나는 스포츠 자동차이다.");
	}
}

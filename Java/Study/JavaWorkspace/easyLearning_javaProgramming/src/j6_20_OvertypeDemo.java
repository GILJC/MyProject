class Vehicle_6_20 {
	String name = "Ż ��";

	void whoami() {
		System.out.println("���� Ż ���̴�.");
	}

	static void move() {
		System.out.println("�̵��ϴ�.");
	}
}

class Car_6_20 extends Vehicle_6_20 {
	String name = "�ڵ���";

	void whoami() {
		System.out.println("���� �ڵ����̴�.");
	}

	static void move() {
		System.out.println("�޸���.");
	}
}

public class j6_20_OvertypeDemo {
	public static void main(String[] args) {
		Vehicle_6_20 v = new Car_6_20();
		System.out.println(v.name); // Ż ��
		v.whoami(); // ���� �ڵ����̴�.
		v.move(); // �̵��ϴ�. // -> static�� ����� // �޸���. <-�� ��µ�
		Vehicle_6_20.move(); // �̵��ϴ�.
		Car_6_20.move(); // �޸���. -> static�̶� �ٷ� �� �� �ִ�.

		// ----------------

		Vehicle_6_20[] vehicles = new Vehicle_6_20[2];
		vehicles[0] = new Car_6_20();
		vehicles[1] = new SportsCar_6_20();

		for (Vehicle_6_20 v2 : vehicles)
			v2.whoami();
		// ���� �ڵ����̴�.
		// ���� ������ �ڵ����̴�.
	}
}

class SportsCar_6_20 extends Car_6_20 {
	void whoami() {
		System.out.println("���� ������ �ڵ����̴�.");
	}
}

interface Movable_7_13 {
	void move(int x);
}

class Car_7_13 implements Movable_7_13 {
	private int pos = 0;
	
	public void move(int x) {		//  Movable �������̽��� �߻� �޼����� move()�� ����ü�̴�.
		pos += x;
	}
	
	public void show() {
		System.out.println(pos + "m �̵��߽��ϴ�.");
	}
}


public class j7_13_MovableDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable_7_13 m = new Car_7_13();
		// = Car_7_13 m = new Car_7_13(); 
		
		
		m.move(5);
		// m.show();		// Movable Ÿ�Կ��� show() �޼��尡 ���� ������ ȣ���� �� ����.
		
		Car_7_13 c = (Car_7_13) m;		// m�� �����ϴ� ���� ��ü�� Car Ÿ���̹Ƿ� ���� Ÿ�� ��ȯ�� �� �ִ�.
		c.move(10);
		c.show();		// Car Ÿ�Կ��� show() �޼��尡 �־� ȣ���� �� �ִ�.
	}
}



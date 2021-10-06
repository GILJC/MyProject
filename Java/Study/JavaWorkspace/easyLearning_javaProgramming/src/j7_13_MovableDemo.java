interface Movable_7_13 {
	void move(int x);
}

class Car_7_13 implements Movable_7_13 {
	private int pos = 0;
	
	public void move(int x) {		//  Movable 인터페이스의 추상 메서드인 move()의 구현체이다.
		pos += x;
	}
	
	public void show() {
		System.out.println(pos + "m 이동했습니다.");
	}
}


public class j7_13_MovableDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable_7_13 m = new Car_7_13();
		// = Car_7_13 m = new Car_7_13(); 
		
		
		m.move(5);
		// m.show();		// Movable 타입에는 show() 메서드가 없기 때문에 호출할 수 없다.
		
		Car_7_13 c = (Car_7_13) m;		// m이 참조하는 실제 객체가 Car 타입이므로 강제 타입 변환할 수 있다.
		c.move(10);
		c.show();		// Car 타입에는 show() 메서드가 있어 호출할 수 있다.
	}
}



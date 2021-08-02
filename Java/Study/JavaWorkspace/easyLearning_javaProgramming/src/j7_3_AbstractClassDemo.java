abstract class Shape_7_3 {
	double pi = 3.14; // 추상 클래스도 멤버 필드를 포함할 수 있다.

	abstract void draw(); // 추상 메서드는 본체가 없다.

	public double findArea() { // 추상 클래스도 구현 메서드를 포함할 수 있다.
		return 0.0;
	}
}

class Circle_7_3 extends Shape_7_3 { // 추상클래스의 자식 클래스이므로 추상클래스의 메소드를 사용하지 않으면 에러 발생
	int radius;

	public Circle_7_3(int radius) {
		this.radius = radius;
	}

	public void draw() { // 부모 클래스에서 추상 메서드로 선언했으므로 자식 클래스에서 반드시 구현해야 한다.
		System.out.println("원을 그리다.");
	}

	public double findArea() { // 부모 클래스의 메서드를 오버라이딩한다.
		return pi * radius * radius; // pi : 부모 클래스인 Shape에서 물려받은 변수이다.
	}
}

public class j7_3_AbstractClassDemo {
	public static void main(String[] args) {
		// Shape_7_3 s = new Shape_7_3(); // Shape 클래스는 추상 클래스이므로 생성자를 사용해 객체를 생성할 수 없다.

		Circle_7_3 c = new Circle_7_3(3); // int값(=3) 안넣어주면 에러
		c.draw();
		System.out.printf("원의 넓이는 %.1f\n", c.findArea());

		Rectangle_7_3 r = new Rectangle_7_3(3, 4);
		r.draw();
		System.out.printf("사각형의 넓이는 %.1f\n", r.findArea());

	}

}

class Rectangle_7_3 extends Shape_7_3 {
	int line1, line2;

	public Rectangle_7_3(int line1, int line2) {
		this.line1 = line1;
		this.line2 = line2;
	}

	public void draw() {
		System.out.println("사각형을 그리다.");
	}

	public double findArea() {
		return line1 * line2;
	}
}

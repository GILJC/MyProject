class Square_4_7 {
	private double side;

	public void setRadius(double s) { // 의미가 같은데도 다른 이름을 사용한다면 가독성이 떨어진다.
		side = s; // 멤버 변수 side와 매개변수 s의 의미는 같지만 역할이 다른다.
	} // 의미가 같으므로 2개의 변수를 둘 다 side로 선언한다고 하자.
}

class Square_4_7_this {
	private double side;

	public void setRadius(double side) {
		this.side = side; // this는 생성자에 의해 생성된 객체 자신을 가리킨다.
	} // 자바는객체 자신을 참조할 수 있도록 this 키워드를 제공한다.
} // this는 생성자에 의해 생성된 객체 자신을 가리킨다.

class Circle_4_7 {
	double radius;
	String color;

//	public Circle_4_7(double r, String c) {
//		radius = r;
//		color = c;
//	}	-> this와 this()로 중복 코드를 없에면 아래처럼 됨.
	public Circle_4_7(double radius, String color) { // 생성자 1
		this.radius = radius;
		this.color = color; // -> this는 항상 맨 위에 있어야 함. radius = 4;
	} // this.color; 이런식으로 쓸 수 없음.

//	public Circle_4_7(double r) {
//		radius = r;
//		color = "파랑";
//	}
	public Circle_4_7(double radius) { // 생성자 2
		this(radius, "파랑");
	}

//	public Circle_4_7(String c) {
//		radius = 10.0;
//		color = c;
//	}
	public Circle_4_7(String color) { // 생성자 3
		this(10.0, color);
	}

//	public Circle_4_7() {
//		radius = 10.0;
//		color = "빨강";
//	}
	public Circle_4_7() { // 생성자 4
		this(10.0, "빨강");
	}
}

public class j4_7_this_Circle {
	public static void main(String[] args) {
		Circle_4_7 c1 = new Circle_4_7(10.0, "빨강"); // 생성자 1을 호출한다.

		Circle_4_7 c2 = new Circle_4_7(5.0); // 생성자 2을 호출한다.

		Circle_4_7 c3 = new Circle_4_7("빨강"); // 생성자 3을 호출한다.

		Circle_4_7 c4 = new Circle_4_7(); // 생성자 4을 호출한다.
	}
}

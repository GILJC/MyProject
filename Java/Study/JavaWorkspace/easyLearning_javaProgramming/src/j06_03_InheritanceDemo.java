	// public class Circle6_3 {  <-- 하나의 .java 파일 안에 있어서 public class 못씀. 그래서 여기선 일단 그냥 class로 사용
class Circle6_3 {
	private void secret() {
		System.out.println("비밀이다.");
	}

	protected void findRadius() {
		System.out.println("반지름이 10.0센티이다.");
	}

	public void findArea() {
		System.out.println("넓이는 (π*반지름*반지름)이다");
	}

	public void findArea2() {
		System.out.println("넓이는 (π*반지름*반지름)이다");
	}
}

// 위와 마찬가지. public class Ball6_3 대신 사용. public을 뺌.
class Ball6_3 extends Circle6_3 {
	private String color;

	public Ball6_3(String color) {
		this.color = color;
	}

	public void findColor() {
		System.out.println(color + " 공이다.");
	}

	public void findVolume() {
		System.out.println("부피는 4/3*(π*반지름*반지름*반지름)이다.");
	}

	@Override // -> 어노테이션(annotation) -> @Override는 뒤에 선언된 메서드가 부모 클래스의 메서드를 오버라이딩한 메서드라는 것을
				// 명시한다.
	public void findArea2() {
		System.out.println("\n넓이는 4*(π*반지름*반지름)이다"); // -> 메서드 오버라이딩
	} // 자식 클래스는 물려받은 메서드를 자신에게 맞도록 수정할 수 있음.

	@Override // @Override는 오버라이딩 규칙에 어긋나면 컴파일 어류를 발생시키기 때문에 흔한 실수를 사전에 방지할 수 있다.
	public void findArea() {
	}

	public void getArea2() { // 예를 들어 메서드 이름을 findAre() 대신에 getArea2()로 잘못 작성하면
	} // @로 시작하는 어노테이션이 없으면 Ball6_3 클래스에 추가한 메서드로 잘못 취급한다.

	@Override // @Override 어노테이션이 있으므로 오버라이딩할 getArea()메서드가 부모 클래스에 없어
	public void getArea() { // 컴파일 오류를 발생시킨다.
	} // -> 요 오류부분 메서드{} 주석처리하고 실행하면 오류 없이 실행 됨.

}

public class j6_3_InheritanceDemo {

	public static void main(String[] args) {
		Circle6_3 c1 = new Circle6_3();
		Ball6_3 c2 = new Ball6_3("빨간색");
		// Ball6_3 c2 = new Ball6_3(); -> 에러 -> Ball6_3 안에 Ball(String color) {
		// this.color = color } 가 있으므로, String 입력값을 줘야만 함.

		System.out.println("원 :");
		c1.findRadius();
		c1.findArea();
		// c1.secret(); -> private는 사용 불가

		System.out.println("\n공 :");
		c2.findRadius(); // extends Circle6_3
		c2.findColor();
		c2.findArea(); // 자식 클래스라, 부모 클래스의 메서드를 그대로 사용할 수 있다.
		c2.findVolume();

		c2.findArea2();
	}

}

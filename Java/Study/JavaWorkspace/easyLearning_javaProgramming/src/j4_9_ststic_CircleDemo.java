/*
class Circle4_9 {
	double radius;
	static int numofCircles = 0;
	int numCircles = 0;
}
public class j4_9_ststic_CircleDemo {
	public static void main(String[] args) {
		Circle4_9 myCircle = new Circle4_9();	// 10.0 넣으면 에러
	}
}
*/
class Circle4_9 {
	double radius;
	static int numofCircles = 0;
	int numCircles = 0;

	public Circle4_9(double radius) { // 요놈 추가
		this.radius = radius;
		numofCircles++; // 객체를 생성할 때마다 하나씩 증가한다
		numCircles++; // 객체를 생성할 때 하나씩 증가하지만,
	} // 객체마다 별도의 기억 공간을 사용하기 때문에 항상 0에서 증가한다.
}

public class j4_9_ststic_CircleDemo {
	public static void main(String[] args) {
		Circle4_9 myCircle = new Circle4_9(10.0); // 비워두면 에러
		Circle4_9 yourCircle = new Circle4_9(5.0);

		// print(); -> main() 메서드는 정적 메서드이므로 인스턴스 메서드를 호출할 수 없다.
		System.out.println("원의 개수 : " + Circle4_9.numofCircles);
		System.out.println("원의 개수 : " + yourCircle.numCircles);
	}

	void print() {
		System.out.println("인스턴스 메서드입니다.");
	}
}

// static, public

// 그냥 public으로 전역변수를 사용할 수도 있지만
// public static은 다른 클래스에서도 사용이 가능한 변수
// private static은 다른 클래스에서 접근이 불가능한 변수

// 정도로 이해해 두면 될 거 같다.

// 그냥 static은 protected

// public 이 더 넓은 범위..

// 참고로 static public이랑 public static이랑 같다.
// 하지만 관례에 따라 public static으로 사용하는게 낫다.
// 지맘대로 쓰면 다른 개발자들이 개지랄 하기 떄문에..

class Circle_4_3 {
	double radius;

	double findArea() {
		return 3.14 * radius * radius;
	}

	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}

public class j4_3_CircleDemo {
	public static void main(String[] args) {
		Circle_4_3 myCircle = new Circle_4_3();

		myCircle.radius = 10.0;

		myCircle.show(myCircle.radius, myCircle.findArea());
	}

}

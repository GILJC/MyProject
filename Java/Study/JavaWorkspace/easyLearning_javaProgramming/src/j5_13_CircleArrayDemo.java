class Circle5_13 {
	double radius;

	public Circle5_13(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	double findArea() {
		return 3.14 * radius * radius;
	}
}

public class j5_13_CircleArrayDemo {
	public static void main(String[] args) {
		Circle5_13[] circles = new Circle5_13[5];

		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle5_13(i + 1.0);
			System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n", circles[i].radius, circles[i].findArea());
		}
	}
}

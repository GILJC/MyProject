class Circle4_4 {
	private double radius;

	public double getRadius() {
		return radius; // ������
	}

	public void setRadius(double r) {
		this.radius = r; // ������
	}

	double findArea() {
		return 3.14 * radius * radius;
	}

	void show(double x, double y) {
		System.out.printf("������ = %.1f, ���� = %.1f\n", x, y);
	}
}

public class j4_4_CircleDemo2 {

	public static void main(String[] args) {
		Circle4_4 myCircle = new Circle4_4();

		myCircle.setRadius(10.0);

		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}

}

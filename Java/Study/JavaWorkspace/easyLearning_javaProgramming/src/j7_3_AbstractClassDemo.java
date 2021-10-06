abstract class Shape_7_3 {
	double pi = 3.14; // �߻� Ŭ������ ��� �ʵ带 ������ �� �ִ�.

	abstract void draw(); // �߻� �޼���� ��ü�� ����.

	public double findArea() { // �߻� Ŭ������ ���� �޼��带 ������ �� �ִ�.
		return 0.0;
	}
}

class Circle_7_3 extends Shape_7_3 { // �߻�Ŭ������ �ڽ� Ŭ�����̹Ƿ� �߻�Ŭ������ �޼ҵ带 ������� ������ ���� �߻�
	int radius;

	public Circle_7_3(int radius) {
		this.radius = radius;
	}

	public void draw() { // �θ� Ŭ�������� �߻� �޼���� ���������Ƿ� �ڽ� Ŭ�������� �ݵ�� �����ؾ� �Ѵ�.
		System.out.println("���� �׸���.");
	}

	public double findArea() { // �θ� Ŭ������ �޼��带 �������̵��Ѵ�.
		return pi * radius * radius; // pi : �θ� Ŭ������ Shape���� �������� �����̴�.
	}
}

public class j7_3_AbstractClassDemo {
	public static void main(String[] args) {
		// Shape_7_3 s = new Shape_7_3(); // Shape Ŭ������ �߻� Ŭ�����̹Ƿ� �����ڸ� ����� ��ü�� ������ �� ����.

		Circle_7_3 c = new Circle_7_3(3); // int��(=3) �ȳ־��ָ� ����
		c.draw();
		System.out.printf("���� ���̴� %.1f\n", c.findArea());

		Rectangle_7_3 r = new Rectangle_7_3(3, 4);
		r.draw();
		System.out.printf("�簢���� ���̴� %.1f\n", r.findArea());

	}

}

class Rectangle_7_3 extends Shape_7_3 {
	int line1, line2;

	public Rectangle_7_3(int line1, int line2) {
		this.line1 = line1;
		this.line2 = line2;
	}

	public void draw() {
		System.out.println("�簢���� �׸���.");
	}

	public double findArea() {
		return line1 * line2;
	}
}

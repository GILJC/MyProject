class Square_4_7 {
	private double side;

	public void setRadius(double s) { // �ǹ̰� �������� �ٸ� �̸��� ����Ѵٸ� �������� ��������.
		side = s; // ��� ���� side�� �Ű����� s�� �ǹ̴� ������ ������ �ٸ���.
	} // �ǹ̰� �����Ƿ� 2���� ������ �� �� side�� �����Ѵٰ� ����.
}

class Square_4_7_this {
	private double side;

	public void setRadius(double side) {
		this.side = side; // this�� �����ڿ� ���� ������ ��ü �ڽ��� ����Ų��.
	} // �ڹٴ°�ü �ڽ��� ������ �� �ֵ��� this Ű���带 �����Ѵ�.
} // this�� �����ڿ� ���� ������ ��ü �ڽ��� ����Ų��.

class Circle_4_7 {
	double radius;
	String color;

//	public Circle_4_7(double r, String c) {
//		radius = r;
//		color = c;
//	}	-> this�� this()�� �ߺ� �ڵ带 ������ �Ʒ�ó�� ��.
	public Circle_4_7(double radius, String color) { // ������ 1
		this.radius = radius;
		this.color = color; // -> this�� �׻� �� ���� �־�� ��. radius = 4;
	} // this.color; �̷������� �� �� ����.

//	public Circle_4_7(double r) {
//		radius = r;
//		color = "�Ķ�";
//	}
	public Circle_4_7(double radius) { // ������ 2
		this(radius, "�Ķ�");
	}

//	public Circle_4_7(String c) {
//		radius = 10.0;
//		color = c;
//	}
	public Circle_4_7(String color) { // ������ 3
		this(10.0, color);
	}

//	public Circle_4_7() {
//		radius = 10.0;
//		color = "����";
//	}
	public Circle_4_7() { // ������ 4
		this(10.0, "����");
	}
}

public class j4_7_this_Circle {
	public static void main(String[] args) {
		Circle_4_7 c1 = new Circle_4_7(10.0, "����"); // ������ 1�� ȣ���Ѵ�.

		Circle_4_7 c2 = new Circle_4_7(5.0); // ������ 2�� ȣ���Ѵ�.

		Circle_4_7 c3 = new Circle_4_7("����"); // ������ 3�� ȣ���Ѵ�.

		Circle_4_7 c4 = new Circle_4_7(); // ������ 4�� ȣ���Ѵ�.
	}
}

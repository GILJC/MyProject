/*
class Circle4_9 {
	double radius;
	static int numofCircles = 0;
	int numCircles = 0;
}
public class j4_9_ststic_CircleDemo {
	public static void main(String[] args) {
		Circle4_9 myCircle = new Circle4_9();	// 10.0 ������ ����
	}
}
*/
class Circle4_9 {
	double radius;
	static int numofCircles = 0;
	int numCircles = 0;

	public Circle4_9(double radius) { // ��� �߰�
		this.radius = radius;
		numofCircles++; // ��ü�� ������ ������ �ϳ��� �����Ѵ�
		numCircles++; // ��ü�� ������ �� �ϳ��� ����������,
	} // ��ü���� ������ ��� ������ ����ϱ� ������ �׻� 0���� �����Ѵ�.
}

public class j4_9_ststic_CircleDemo {
	public static void main(String[] args) {
		Circle4_9 myCircle = new Circle4_9(10.0); // ����θ� ����
		Circle4_9 yourCircle = new Circle4_9(5.0);

		// print(); -> main() �޼���� ���� �޼����̹Ƿ� �ν��Ͻ� �޼��带 ȣ���� �� ����.
		System.out.println("���� ���� : " + Circle4_9.numofCircles);
		System.out.println("���� ���� : " + yourCircle.numCircles);
	}

	void print() {
		System.out.println("�ν��Ͻ� �޼����Դϴ�.");
	}
}

// static, public

// �׳� public���� ���������� ����� ���� ������
// public static�� �ٸ� Ŭ���������� ����� ������ ����
// private static�� �ٸ� Ŭ�������� ������ �Ұ����� ����

// ������ ������ �θ� �� �� ����.

// �׳� static�� protected

// public �� �� ���� ����..

// ����� static public�̶� public static�̶� ����.
// ������ ���ʿ� ���� public static���� ����ϴ°� ����.
// ������� ���� �ٸ� �����ڵ��� ������ �ϱ� ������..

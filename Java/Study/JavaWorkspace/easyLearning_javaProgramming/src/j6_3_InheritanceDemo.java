	// public class Circle6_3 {  <-- �ϳ��� .java ���� �ȿ� �־ public class ����. �׷��� ���⼱ �ϴ� �׳� class�� ���
class Circle6_3 {
	private void secret() {
		System.out.println("����̴�.");
	}

	protected void findRadius() {
		System.out.println("�������� 10.0��Ƽ�̴�.");
	}

	public void findArea() {
		System.out.println("���̴� (��*������*������)�̴�");
	}

	public void findArea2() {
		System.out.println("���̴� (��*������*������)�̴�");
	}
}

// ���� ��������. public class Ball6_3 ��� ���. public�� ��.
class Ball6_3 extends Circle6_3 {
	private String color;

	public Ball6_3(String color) {
		this.color = color;
	}

	public void findColor() {
		System.out.println(color + " ���̴�.");
	}

	public void findVolume() {
		System.out.println("���Ǵ� 4/3*(��*������*������*������)�̴�.");
	}

	@Override // -> ������̼�(annotation) -> @Override�� �ڿ� ����� �޼��尡 �θ� Ŭ������ �޼��带 �������̵��� �޼����� ����
				// ����Ѵ�.
	public void findArea2() {
		System.out.println("\n���̴� 4*(��*������*������)�̴�"); // -> �޼��� �������̵�
	} // �ڽ� Ŭ������ �������� �޼��带 �ڽſ��� �µ��� ������ �� ����.

	@Override // @Override�� �������̵� ��Ģ�� ��߳��� ������ ����� �߻���Ű�� ������ ���� �Ǽ��� ������ ������ �� �ִ�.
	public void findArea() {
	}

	public void getArea2() { // ���� ��� �޼��� �̸��� findAre() ��ſ� getArea2()�� �߸� �ۼ��ϸ�
	} // @�� �����ϴ� ������̼��� ������ Ball6_3 Ŭ������ �߰��� �޼���� �߸� ����Ѵ�.

	@Override // @Override ������̼��� �����Ƿ� �������̵��� getArea()�޼��尡 �θ� Ŭ������ ����
	public void getArea() { // ������ ������ �߻���Ų��.
	} // -> �� �����κ� �޼���{} �ּ�ó���ϰ� �����ϸ� ���� ���� ���� ��.

}

public class j6_3_InheritanceDemo {

	public static void main(String[] args) {
		Circle6_3 c1 = new Circle6_3();
		Ball6_3 c2 = new Ball6_3("������");
		// Ball6_3 c2 = new Ball6_3(); -> ���� -> Ball6_3 �ȿ� Ball(String color) {
		// this.color = color } �� �����Ƿ�, String �Է°��� ��߸� ��.

		System.out.println("�� :");
		c1.findRadius();
		c1.findArea();
		// c1.secret(); -> private�� ��� �Ұ�

		System.out.println("\n�� :");
		c2.findRadius(); // extends Circle6_3
		c2.findColor();
		c2.findArea(); // �ڽ� Ŭ������, �θ� Ŭ������ �޼��带 �״�� ����� �� �ִ�.
		c2.findVolume();

		c2.findArea2();
	}

}

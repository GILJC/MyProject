// public class Person {
class Person6_19 {
	String name = "���";

	void whoami() {
		System.out.println("���� ����̴�.");
	}
}

//public class Student extends Person {
class Student6_19 extends Person6_19 {
	int number = 7;

	void work() {
		System.out.println("���� �����Ѵ�.");
	}
}

public class j6_19_InstanceofDemo {
	public static void main(String[] args) {

		// Student s= new Student();
		// Person p = s; // �ڵ����� Ÿ�� ��ȯ�� �Ѵ�. (O)

		// Person p = new Person();
		// Student s = (Student) p; // ������ Ÿ�� ��ȯ�� �ϸ� ������ �߻��Ѵ�. (X)

		// Student s1 = new Student();
		// Person p = s1;
		// Student s2 = (Student) p; // ������ Ÿ�� ��ȯ�� �� �� �ִ�. (O)
		// ���� ���� �ڽ� ��ü������ �θ� Ÿ�� ������ �����ϰ� �ִٸ� �ڽ� Ÿ������ ��ȯ�� �� �ִ�.
		// �θ� Ÿ�� ������ �ڽ� ��ü�� �θ� Ÿ������ �����ؼ� �� ������ �����δ� �ڽ� ��ü�� ��� ����� ������ �ֱ� �����̴�.

		Student6_19 s = new Student6_19();
		Person6_19 p = new Person6_19();

		// ������ �����ϴ� ��ü�� ���� Ÿ���� �ĺ��ϵ��� �ڹٴ� instanceof �����ڸ� �����Ѵ�.
		// instanceof �����ڴ� ������ �ش� Ÿ���̳� �ڽ� Ÿ���̶�� true�� ��ȯ�ϰ�, �׷��� �ʴٸ� false�� ��ȯ�Ѵ�.
		// �׷��� ������ �ش� Ÿ�԰� ������ ���ٸ� ������ �߻��Ѵ�.

		System.out.println(s instanceof Person6_19); // s�� Person�� �ڽ� Ÿ���̹Ƿ� true
		// true

		System.out.println(s instanceof Student6_19); // s�� Student Ÿ���̹Ƿ� true
		// true

		System.out.println(p instanceof Student6_19); // p�� Student Ÿ�Ե� �ƴϰ� Student �ڽ� Ÿ�Ե� �ƴϹǷ� false
		// false

		// System.out.println(s instanceof String); // s�� String Ÿ�԰� ��������Ƿ� ������ �߻��Ѵ�.

		downcast(s);
		// ok, ���� Ÿ�� ��ȯ
	}

	static void downcast(Person6_19 p) { // �μ��� Person Ÿ�� Ȥ�� Person �ڽ�Ÿ���� ���� �� �ִ�.
		if (p instanceof Student6_19) {
			Student6_19 s = (Student6_19) p; // p�� ���� Ÿ���� Student Ÿ���̹Ƿ� ���� Ÿ�� ��ȯ�� �� �ִ�.
			System.out.println("ok, ���� Ÿ�� ��ȯ");
		}
	}
}

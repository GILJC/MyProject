// public class Person {
class Person6_19 {
	String name = "사람";

	void whoami() {
		System.out.println("나는 사람이다.");
	}
}

//public class Student extends Person {
class Student6_19 extends Person6_19 {
	int number = 7;

	void work() {
		System.out.println("나는 공부한다.");
	}
}

public class j6_19_InstanceofDemo {
	public static void main(String[] args) {

		// Student s= new Student();
		// Person p = s; // 자동으로 타입 변환을 한다. (O)

		// Person p = new Person();
		// Student s = (Student) p; // 강제로 타입 변환을 하면 오류가 발생한다. (X)

		// Student s1 = new Student();
		// Person p = s1;
		// Student s2 = (Student) p; // 강제로 타입 변환을 할 수 있다. (O)
		// 위와 같이 자식 객체이지만 부모 타입 변수가 참조하고 있다면 자식 타입으로 변환할 수 있다.
		// 부모 타입 변수는 자식 객체를 부모 타입으로 여과해서 볼 뿐이지 실제로는 자식 객체의 모든 멤버를 가지고 있기 때문이다.

		Student6_19 s = new Student6_19();
		Person6_19 p = new Person6_19();

		// 변수가 참조하는 객체의 실제 타입을 식별하도록 자바는 instanceof 연산자를 제공한다.
		// instanceof 연산자는 변수가 해당 타입이나 자식 타입이라면 true를 반환하고, 그렇지 않다면 false를 반환한다.
		// 그러나 변수가 해당 타입과 관련이 없다면 오류를 발생한다.

		System.out.println(s instanceof Person6_19); // s가 Person의 자식 타입이므로 true
		// true

		System.out.println(s instanceof Student6_19); // s가 Student 타입이므로 true
		// true

		System.out.println(p instanceof Student6_19); // p가 Student 타입도 아니고 Student 자식 타입도 아니므로 false
		// false

		// System.out.println(s instanceof String); // s가 String 타입과 관계없으므로 오류가 발생한다.

		downcast(s);
		// ok, 하향 타입 변환
	}

	static void downcast(Person6_19 p) { // 인수로 Person 타입 혹은 Person 자식타입을 받을 수 있다.
		if (p instanceof Student6_19) {
			Student6_19 s = (Student6_19) p; // p의 실제 타입이 Student 타입이므로 강제 타입 변환할 수 있다.
			System.out.println("ok, 하향 타입 변환");
		}
	}
}

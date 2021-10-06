class Person4_8 {
	String name;
	int age;

	public Person4_8 setName(String name) {
		this.name = name;
		return this;
	}

	public Person4_8 setAge(int age) {
		this.age = age;
		return this;
	}

	public void sayHello() {
		System.out.println("안녕, 나는 " + name + "이고 " + age + "살이야.");
	}
}

public class j4_8_MethodChainDemo {

	public static void main(String[] args) {
		Person4_8 person = new Person4_8();
		person.setName("민국").setAge(21).sayHello(); // 연속 호출
	}
}

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
		System.out.println("�ȳ�, ���� " + name + "�̰� " + age + "���̾�.");
	}
}

public class j4_8_MethodChainDemo {

	public static void main(String[] args) {
		Person4_8 person = new Person4_8();
		person.setName("�α�").setAge(21).sayHello(); // ���� ȣ��
	}
}

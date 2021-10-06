interface Animal {
	void sound();
}

class Dog implements Animal {
	public void sound() {
		System.out.println("�۸�~~");
	}
}
											//  Animal ���� Ŭ�����̴�.
class Cuckoo implements Animal {
	public void sound() {
		System.out.println("����~~");
	}
}

public class j_7_12_AnimalDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Cuckoo c = new Cuckoo();
		
		makeSound(d);
		makeSound(c);
	}
	
	static void makeSound(Animal a) {		// Dog ��ü�� Cuckoo ��ü�� Animal  Ÿ�Կ� �����Ѵ�.
		a.sound();		// a ��ü�� Ÿ���� ���� ���߿� �����Ѵ�.
	}					// a ��ü�� Dog Ÿ���̸� '�۸�~~',
						// Cuckoo Ÿ���̸� '����~~'�� ����Ѵ�.
}


interface Animal {
	void sound();
}

class Dog implements Animal {
	public void sound() {
		System.out.println("멍멍~~");
	}
}
											//  Animal 구현 클래스이다.
class Cuckoo implements Animal {
	public void sound() {
		System.out.println("뻐꾹~~");
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
	
	static void makeSound(Animal a) {		// Dog 객체나 Cuckoo 객체를 Animal  타입에 대입한다.
		a.sound();		// a 객체의 타입을 실행 도중에 결정한다.
	}					// a 객체가 Dog 타입이면 '멍멍~~',
						// Cuckoo 타입이면 '뻐꾹~~'을 출력한다.
}


package sec06;

public class One1 extends One{
	void print() {
		// System.out.println(secret);	// 같은 패키지에 있는 자식 객체라도 부모 클래스의 private 멤버에는 접근할 수 없다.
		System.out.println(roommate);
		System.out.println(child);
		System.out.println(anybody);	// 같은 페키지에 있는 자식 객체는 부모 클래스의 private 외의 멤버에 접근할 수 있다.
	}
	
	// void show() {		// 오버라이딩할 때 접근 범위가 좁아지면 오류가 발생한다.	
	// }
}



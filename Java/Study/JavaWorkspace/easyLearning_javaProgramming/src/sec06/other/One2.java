package sec06.other;

import sec06.One;		// 다른 패키지에 있는 public 클래스를 임포트한다.
						// public 클래스가 아니면 임포트할 수 없다.
public class One2 extends One {
	void print() {
		// System.out.println(secret);
		// System.out.println(roommate);		//	자식 클래스라도 부모와 다른 패키지에 있다면 private과 default 멤버에 접근할 수 없다.  
		System.out.println(child);
		System.out.println(anybody);
	}
}

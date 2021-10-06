package sec06.other;

import sec06.One;

public class Three {
	void print() {
		One o = new One();
		// System.out.println(o.secret);
		// System.out.println(o.rommate);
		// System.out.println(o.child);
		System.out.println(o.anybody);		// 다른 패키지에 있는 클래스라면 public 멤버만 접근할 수 있다.
	}

}

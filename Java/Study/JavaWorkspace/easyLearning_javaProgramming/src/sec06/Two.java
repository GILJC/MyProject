package sec06;

public class Two {
	void print() {
		One o = new One();
		// System.out.println(o.secret);	// 같은 패키지에 있더라도 다른 객체의 private 멤버에 접근할 수 없다.
		System.out.println(o.roommate);
		System.out.println(o.child);		// 같은 패키지에 있다면 다른 객체의 private외의 멤버에 접근할 수 있다.
		System.out.println(o.anybody);		// 그러나 자신의 멤버가 아니기 때문에 객체를 생성해야 한다.
	}
}

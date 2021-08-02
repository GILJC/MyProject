class Parent {
	int x=10;
}

class Child extends Parent {
	int x=20;
	void method() {
		System.out.println("x=" + x);	// x=20
		System.out.println("this.x=" + this.x);		// this.x=20
		System.out.println("super.x=" + super.x);	// super.x=10
	}
}
// super : 조상의 멤버와 자신의 멤버를 구별하는데 사용


public class Super_x {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}

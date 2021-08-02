class Bird_7_18 {
	public void move() {
		System.out.println("새가 움직인다~~~.");
	}
}
// public interface Bird {
// void move();
// }

public class j7_18_MemberDemo {
	class Eagle extends Bird_7_18 {		// 멤버 클래스이다.
		public void move() {
			System.out.println("독수리가 난다~~~.");	// Bird 클래스의 move()를 오버라이딩한 메서드이다.
		}
		
		public void sound() {
			System.out.println("휘익~~~.");		// Eagle 클래스에 추가한 메서드이다.
		}
	}
	
	Eagle e = new Eagle();		// MemberDemo 클래스의 멤버 필드이다.
		
	
	public static void main(String[] args) {
		j7_18_MemberDemo m = new j7_18_MemberDemo();
		m.e.move();
		m.e.sound();		// MemberDemo 클래스의 객체인 m의 멤버 필드 e 객체의 move()와 sound() 메서드를 호출한다. 
	}

}

/*

독수리가 난다~~~.
휘익~~~.


*/

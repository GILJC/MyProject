class Bird_7_18 {
	public void move() {
		System.out.println("���� �����δ�~~~.");
	}
}
// public interface Bird {
// void move();
// }

public class j7_18_MemberDemo {
	class Eagle extends Bird_7_18 {		// ��� Ŭ�����̴�.
		public void move() {
			System.out.println("�������� ����~~~.");	// Bird Ŭ������ move()�� �������̵��� �޼����̴�.
		}
		
		public void sound() {
			System.out.println("����~~~.");		// Eagle Ŭ������ �߰��� �޼����̴�.
		}
	}
	
	Eagle e = new Eagle();		// MemberDemo Ŭ������ ��� �ʵ��̴�.
		
	
	public static void main(String[] args) {
		j7_18_MemberDemo m = new j7_18_MemberDemo();
		m.e.move();
		m.e.sound();		// MemberDemo Ŭ������ ��ü�� m�� ��� �ʵ� e ��ü�� move()�� sound() �޼��带 ȣ���Ѵ�. 
	}

}

/*

�������� ����~~~.
����~~~.


*/

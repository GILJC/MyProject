
public class j7_19_Anonymous1Demo {
	Bird_7_18 e = new Bird_7_18() {
		public void move() {
			System.out.println("�������� ����~~~.");
		}
		
		void sound() {
			System.out.println("����~~~.");
		}
	};

	public static void main(String[] args) {
		j7_19_Anonymous1Demo a = new j7_19_Anonymous1Demo();
		a.e.move();		// �������� ����~~~.
		//a.e.sound();
	}

}


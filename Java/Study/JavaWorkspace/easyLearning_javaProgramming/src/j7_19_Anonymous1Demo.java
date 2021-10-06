
public class j7_19_Anonymous1Demo {
	Bird_7_18 e = new Bird_7_18() {
		public void move() {
			System.out.println("독수리가 난다~~~.");
		}
		
		void sound() {
			System.out.println("휘익~~~.");
		}
	};

	public static void main(String[] args) {
		j7_19_Anonymous1Demo a = new j7_19_Anonymous1Demo();
		a.e.move();		// 독수리가 난다~~~.
		//a.e.sound();
	}

}


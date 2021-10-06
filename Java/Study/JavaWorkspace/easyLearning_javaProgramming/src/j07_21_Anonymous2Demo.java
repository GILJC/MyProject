
public class j7_21_Anonymous2Demo {

	public static void main(String[] args) {
		Bird_7_18 b = new Bird_7_18() {
			public void move() {
				System.out.println("독수리가 난다~~~.");
			}
		};
		b.move();		// 독수리가 난다~~~.
	}

}

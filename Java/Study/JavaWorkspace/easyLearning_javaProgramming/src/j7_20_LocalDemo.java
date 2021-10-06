
public class j7_20_LocalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Eagle extends Bird_7_18 {		// 지역 클래스이다.
			public void move() {
				System.out.println("독수리가 난다~~~.");		// Bird 클래스의 move()를 오버라이딩한 메서드
			}
		}
		
		Bird_7_18 e = new Eagle();		// e -> main() 메서드의 지역 변수이다.
		e.move();	// 독수리가 난다~~~.
	}

}

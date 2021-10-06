
public class j7_15_LocalClassDemo {
	private String s1 = "외부";
	
	void method() {
		int x = 1;
		class LocalClass {		// 지역 클래스이다.
			String s2 = "내부";
			String s3 = s1;		// 외부 클래스의 private 멤버도 접근할 수 있다.
			
			public void show() {
				System.out.println("지역 클래스");
				// x = 2;		// x는 method() 내부에 선언된 지역 변수이다.
			}					// 지역 변수는 사실상 final이므로 수정할 수 없다.
		}
		
		LocalClass lc = new LocalClass();
		System.out.println(lc.s2);
		lc.show();
	}

	public static void main(String[] args) {
		j7_15_LocalClassDemo lcd = new j7_15_LocalClassDemo();
		lcd.method();
	}

}

/*

내부
지역 클래스

*/
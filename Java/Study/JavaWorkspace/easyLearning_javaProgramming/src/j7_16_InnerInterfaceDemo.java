class Icon_7_16 {
	interface Touchable {		// 중첩 인터페이스이다.
		void touch();
	}
}

public class j7_16_InnerInterfaceDemo implements Icon_7_16.Touchable {
	public void touch() {							// Icon 클래스의 멤버 Touchable 인터페이스를 의미한다.
		System.out.println("아이콘을 터치한다.");
	}
	
	public static void main(String[] args) {
		Icon_7_16.Touchable btn = new j7_16_InnerInterfaceDemo();
		btn.touch();	//  -> 아이콘을 터치한다.
	}

}


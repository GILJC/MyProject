class Icon_7_16 {
	interface Touchable {		// ��ø �������̽��̴�.
		void touch();
	}
}

public class j7_16_InnerInterfaceDemo implements Icon_7_16.Touchable {
	public void touch() {							// Icon Ŭ������ ��� Touchable �������̽��� �ǹ��Ѵ�.
		System.out.println("�������� ��ġ�Ѵ�.");
	}
	
	public static void main(String[] args) {
		Icon_7_16.Touchable btn = new j7_16_InnerInterfaceDemo();
		btn.touch();	//  -> �������� ��ġ�Ѵ�.
	}

}


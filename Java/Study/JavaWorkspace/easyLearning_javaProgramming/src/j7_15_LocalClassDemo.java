
public class j7_15_LocalClassDemo {
	private String s1 = "�ܺ�";
	
	void method() {
		int x = 1;
		class LocalClass {		// ���� Ŭ�����̴�.
			String s2 = "����";
			String s3 = s1;		// �ܺ� Ŭ������ private ����� ������ �� �ִ�.
			
			public void show() {
				System.out.println("���� Ŭ����");
				// x = 2;		// x�� method() ���ο� ����� ���� �����̴�.
			}					// ���� ������ ��ǻ� final�̹Ƿ� ������ �� ����.
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

����
���� Ŭ����

*/
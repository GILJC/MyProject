// ��ø Ŭ������ �ܺ� Ŭ������ ����� �ʿ� ����, �ܺ� Ŭ������ private ������� ����� �� �ִ�.

public class j7_14_MemberClassDemo {
	private String secret = "�����";
	String s = "�ܺ�";

	class MemberClass_7_14 {
		String s = "����";

		public void show1() {
			System.out.println("���� Ŭ����");
			System.out.println(secret);

			System.out.println(s);

			System.out.println(j7_14_MemberClassDemo.this.s);
		}

		// static String ss = "���� ��� �ʵ�";
		// ststic void show2() {}
	}

//public class j7_14_MemberClassDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j7_14_MemberClassDemo m = new j7_14_MemberClassDemo();
		j7_14_MemberClassDemo.MemberClass_7_14 m1 = m.new MemberClass_7_14();
		
		System.out.println(m1.s);
		m1.show1();
		
		System.out.println();
		System.out.println(m.s);
		
	}

}

/*

����
���� Ŭ����
�����
����
�ܺ�

�ܺ�

*/





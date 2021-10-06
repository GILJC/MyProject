// 중첩 클래스는 외부 클래스를 상속할 필요 없이, 외부 클래스의 private 멤버까지 사용할 수 있다.

public class j7_14_MemberClassDemo {
	private String secret = "비공개";
	String s = "외부";

	class MemberClass_7_14 {
		String s = "내부";

		public void show1() {
			System.out.println("내부 클래스");
			System.out.println(secret);

			System.out.println(s);

			System.out.println(j7_14_MemberClassDemo.this.s);
		}

		// static String ss = "정적 멤버 필드";
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

내부
내부 클래스
비공개
내부
외부

외부

*/





public class j5_1_String1Demo {
	public static void main(String[] args) {
		String s1 = "Hi, Java!"; // ���ڿ� ���ͷ��� ����� String Ÿ���� s1 ������ �ʱ�ȭ�Ѵ�.
		String s2 = "Hi, Java!";
		String s3 = new String("Hi, Java!"); // ���ο� ���ڿ� ��ü�� ������
		String s4 = new String("Hi, Java!"); // String Ÿ���� s3,s4 ������ �ʱ�ȭ�Ѵ�.

		System.out.println("s1 == s2 -> " + (s1 == s2)); // s1 == s2 -> true
		System.out.println("s1 == s3 -> " + (s1 == s3)); // s1 == s3 -> false
		System.out.println("s3 == s2 -> " + (s3 == s4)); // s3 == s4 -> false

		s1 = s3;
		System.out.println("s1 == s3 -> " + (s1 == s3)); // s1 == s3 -> true
	}
}

public class j5_1_String1Demo {
	public static void main(String[] args) {
		String s1 = "Hi, Java!"; // 문자열 리터럴을 사용해 String 타입의 s1 변수를 초기화한다.
		String s2 = "Hi, Java!";
		String s3 = new String("Hi, Java!"); // 새로운 무자열 객체를 생성해
		String s4 = new String("Hi, Java!"); // String 타입의 s3,s4 변수를 초기화한다.

		System.out.println("s1 == s2 -> " + (s1 == s2)); // s1 == s2 -> true
		System.out.println("s1 == s3 -> " + (s1 == s3)); // s1 == s3 -> false
		System.out.println("s3 == s2 -> " + (s3 == s4)); // s3 == s4 -> false

		s1 = s3;
		System.out.println("s1 == s3 -> " + (s1 == s3)); // s1 == s3 -> true
	}
}

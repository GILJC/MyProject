
public class j5_2_String2Demo {

	public static void main(String[] args) {
		String s1 = "Hi, Java!";
		String s2 = new String("Hi, Java!");
		String s3 = "Hi, Code!";
		String s4 = "Hi, java!";

		System.out.println(s1.equals(s2)); // 글자가 같은지 확인.
											// s1 == s2하면 false <- new String() = 새로 만듬
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4)); // 문자열을 대소문자 구분 없이 비교 후 true/false 반환

		System.out.println(s1.compareTo(s3)); // s1과 s3는 'Java'의 'J'와 'Code'의 'C'부터 다르기 때문에 7(='J'-'C')을 출력한다.
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s3.compareTo(s4)); // 'C'-'j'의 값인 -39를 출력한다.
		System.out.println("Hi, Java!".compareToIgnoreCase("hi, java!"));
	}

}

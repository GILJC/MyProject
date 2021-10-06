public class j5_3_String3Demo {
	public static void main(String[] args) {
		String s1 = new String("Hi, ");
		String s2 = new String(" Java");

		System.out.println("문자열 길이(s1) : " + s1.length());
		System.out.println(s1.charAt(1)); // s1의 1번 인덱스, 즉 두 번쨰 문자를 반환.

		s1 = s1.concat(s2); // concat : s1과 s2를 이어줌

		System.out.println(s1.concat(s2) + "!");
		System.out.println(s1.toLowerCase() + "!"); // 소문자 출력
		System.out.println(s1.substring(4, 8) + "!"); // substring -> 0번째부터 시작 -> 4~8번째 글자

		String s3 = " ";
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank()); // isEmpty()와 isBlank()의 차이점을 보여줌
		String s4 = "";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());

		String s5 = "*-*";
		System.out.println(s5.repeat(10)); // 10번 반복

		System.out.println(s2.trim().indexOf("v")); // trim() -> 앞뒤에 있는 공백을 제거한 후 반환
	}
}

/*
 * 
 * boolean contains(String s) -> 문자열 s를 포함하는지 조사 boolean endsWith(String s) ->
 * 끝나는 문자열이 s인지 조사
 * 
 * int indexOf(Strings) -> 문자열 s가 나타난 위치를 반환
 * 
 * int length() -> 길이를 반환
 * 
 * boolean startsWith(String s)->시작하는 문자열이 s인지 조사
 * 
 * String substring(int index) -> index부터 시작하는 문자열의 일부를 반환
 * 
 */

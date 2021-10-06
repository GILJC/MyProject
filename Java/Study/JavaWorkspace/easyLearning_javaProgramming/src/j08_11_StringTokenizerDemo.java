import java.util.StringTokenizer;

public class j8_11_StringTokenizerDemo {
	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		
		StringTokenizer st = new StringTokenizer(s, " ,");	// 공백과 콤마를 구분자로 파싱한 StringTokenizer 객체를 생성한다.
		
		System.out.println(st.countTokens());	// 9  (토큰의 갯수)
		System.out.println(st.hasMoreTokens());	// true
		
		//System.out.println(st.nextToken());	// of
		//System.out.println(st.nextToken());	// the
		// 위 2개를 실행하고 밑에를 실행하면 [people] 부터 출력 됨.
		
		while (st.hasMoreTokens()) {		// 토큰이 남아 있을 때까지 다음 토큰을 꺼내어 출력한다.
			System.out.print("[" + st.nextToken() + "] ");
			// [of] [the] [people] [by] [the] [people] [for] [the] [people]
		}
	}

}

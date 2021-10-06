import java.util.StringTokenizer;

public class j9_1_Unchecked1Demo {
	public static void main(String[] args) {
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);
		
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken() + "+");		// Time+is+money+
		}
		
		System.out.print(st.nextToken());	// 더 이상 가져올 토큰이 없어 예외를 발생시킨다.
	}

}

/*
Time+is+money+Exception in thread "main" java.util.NoSuchElementException
at java.base/java.util.StringTokenizer.nextToken(StringTokenizer.java:347)
at j9_1_Unchecked1Demo.main(j9_1_Unchecked1Demo.java:12)

*/
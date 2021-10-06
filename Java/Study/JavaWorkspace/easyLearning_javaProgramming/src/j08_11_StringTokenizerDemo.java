import java.util.StringTokenizer;

public class j8_11_StringTokenizerDemo {
	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		
		StringTokenizer st = new StringTokenizer(s, " ,");	// ����� �޸��� �����ڷ� �Ľ��� StringTokenizer ��ü�� �����Ѵ�.
		
		System.out.println(st.countTokens());	// 9  (��ū�� ����)
		System.out.println(st.hasMoreTokens());	// true
		
		//System.out.println(st.nextToken());	// of
		//System.out.println(st.nextToken());	// the
		// �� 2���� �����ϰ� �ؿ��� �����ϸ� [people] ���� ��� ��.
		
		while (st.hasMoreTokens()) {		// ��ū�� ���� ���� ������ ���� ��ū�� ������ ����Ѵ�.
			System.out.print("[" + st.nextToken() + "] ");
			// [of] [the] [people] [by] [the] [people] [for] [the] [people]
		}
	}

}

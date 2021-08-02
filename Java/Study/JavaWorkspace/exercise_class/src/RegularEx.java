import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "A broken hand works, but not a broken heart";
		String pattern = "broken";
		
		StringBuffer sb = new StringBuffer();
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		System.out.println(source);		// A broken hand works, but not a broken heart
		
		int i = 0;
		
		while(m.find()) {
			++i;
			System.out.println(i + "��° ��Ī:" + m.start() + "~" + m.end());	//  ��Ī�� �ܾ��� ���� ��ġ, �� ��ġ
			
			m.appendReplacement(sb, "drunken");		//  broken �� drunken���� ��ü
		}
		
		m.appendTail(sb);	// StringBuffer sb�� �� ���� ����, �̰��� �߰��ϰڴ�.
		System.out.println("Replacement count: " + i);
		System.out.println("result" + sb.toString());
	}

}

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
			System.out.println(i + "번째 매칭:" + m.start() + "~" + m.end());	//  매칭된 단어의 시작 위치, 끝 위치
			
			m.appendReplacement(sb, "drunken");		//  broken 을 drunken으로 교체
		}
		
		m.appendTail(sb);	// StringBuffer sb에 들어간 것의 끝에, 이것을 추가하겠다.
		System.out.println("Replacement count: " + i);
		System.out.println("result" + sb.toString());
	}

}

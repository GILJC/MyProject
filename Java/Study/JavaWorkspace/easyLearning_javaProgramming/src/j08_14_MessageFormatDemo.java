import java.text.MessageFormat;

public class j8_14_MessageFormatDemo {
	public static void main(String[] args) {
		String java = "Java";
		int version = 8;
		
		String s = MessageFormat.format("language : {1}\nversion : {0}", 
				version, java);				// language : Java
											// version : 8
		System.out.println(s);
		
		Object[] data = { java, version };
		
		MessageFormat f = new MessageFormat("language : {0}\nversion : {1}");
		
		System.out.println(f.format(data));		// language : Java
												// version : 8
		
		double pie = 3.14159265358979;
		double money = 4424.243423;
		System.out.println(String.format("%.2f", pie)); //결과 : 3.14
		System.out.println(String.format("%.3f", pie)); //결과 : 3.142
		System.out.println(String.format("%,.3f", money)); //결과 : 4,424.243
	}

}

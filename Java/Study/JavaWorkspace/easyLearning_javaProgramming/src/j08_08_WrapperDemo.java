
public class j8_8_WrapperDemo {
	public static void main(String[] args) {
		Integer bi1 = new Integer(10);		// Integer 타입 객체를 생성한다.
		
		int i1 = bi1.intValue();		// Integer 타입을 int 타입으로 변환한다.
		
		double d = bi1.doubleValue();		// Integer 타입을 double 타입으로 변환한다.
		
		Integer bi2 = 20;		// 자동 박싱이다.
		
		int i2 = bi2 + 20;		// 자동 언박싱이다.
		
		String s1 = Double.toString(3.14);		// double 타입 데이터를 String 타입으로 변환한다.
		
		Double pi = Double.parseDouble("3.14");		// String 타입을 double 타입으로 변환한다.
		
		Integer bi3 = Integer.valueOf("11", 16);	// 16진수 숫자 문자열을 10진수 Integer 타입으로 변환한다.
		
		System.out.println(bi3);	// 17	// 16진수의 11은 10진수의 17이다.
	}

}

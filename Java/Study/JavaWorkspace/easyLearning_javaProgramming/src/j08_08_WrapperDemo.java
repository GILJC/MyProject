
public class j8_8_WrapperDemo {
	public static void main(String[] args) {
		Integer bi1 = new Integer(10);		// Integer Ÿ�� ��ü�� �����Ѵ�.
		
		int i1 = bi1.intValue();		// Integer Ÿ���� int Ÿ������ ��ȯ�Ѵ�.
		
		double d = bi1.doubleValue();		// Integer Ÿ���� double Ÿ������ ��ȯ�Ѵ�.
		
		Integer bi2 = 20;		// �ڵ� �ڽ��̴�.
		
		int i2 = bi2 + 20;		// �ڵ� ��ڽ��̴�.
		
		String s1 = Double.toString(3.14);		// double Ÿ�� �����͸� String Ÿ������ ��ȯ�Ѵ�.
		
		Double pi = Double.parseDouble("3.14");		// String Ÿ���� double Ÿ������ ��ȯ�Ѵ�.
		
		Integer bi3 = Integer.valueOf("11", 16);	// 16���� ���� ���ڿ��� 10���� Integer Ÿ������ ��ȯ�Ѵ�.
		
		System.out.println(bi3);	// 17	// 16������ 11�� 10������ 17�̴�.
	}

}

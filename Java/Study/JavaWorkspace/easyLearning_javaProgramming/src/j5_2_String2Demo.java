
public class j5_2_String2Demo {

	public static void main(String[] args) {
		String s1 = "Hi, Java!";
		String s2 = new String("Hi, Java!");
		String s3 = "Hi, Code!";
		String s4 = "Hi, java!";

		System.out.println(s1.equals(s2)); // ���ڰ� ������ Ȯ��.
											// s1 == s2�ϸ� false <- new String() = ���� ����
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4)); // ���ڿ��� ��ҹ��� ���� ���� �� �� true/false ��ȯ

		System.out.println(s1.compareTo(s3)); // s1�� s3�� 'Java'�� 'J'�� 'Code'�� 'C'���� �ٸ��� ������ 7(='J'-'C')�� ����Ѵ�.
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s3.compareTo(s4)); // 'C'-'j'�� ���� -39�� ����Ѵ�.
		System.out.println("Hi, Java!".compareToIgnoreCase("hi, java!"));
	}

}

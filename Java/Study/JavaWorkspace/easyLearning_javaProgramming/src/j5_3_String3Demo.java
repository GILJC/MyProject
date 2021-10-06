public class j5_3_String3Demo {
	public static void main(String[] args) {
		String s1 = new String("Hi, ");
		String s2 = new String(" Java");

		System.out.println("���ڿ� ����(s1) : " + s1.length());
		System.out.println(s1.charAt(1)); // s1�� 1�� �ε���, �� �� ���� ���ڸ� ��ȯ.

		s1 = s1.concat(s2); // concat : s1�� s2�� �̾���

		System.out.println(s1.concat(s2) + "!");
		System.out.println(s1.toLowerCase() + "!"); // �ҹ��� ���
		System.out.println(s1.substring(4, 8) + "!"); // substring -> 0��°���� ���� -> 4~8��° ����

		String s3 = " ";
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank()); // isEmpty()�� isBlank()�� �������� ������
		String s4 = "";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());

		String s5 = "*-*";
		System.out.println(s5.repeat(10)); // 10�� �ݺ�

		System.out.println(s2.trim().indexOf("v")); // trim() -> �յڿ� �ִ� ������ ������ �� ��ȯ
	}
}

/*
 * 
 * boolean contains(String s) -> ���ڿ� s�� �����ϴ��� ���� boolean endsWith(String s) ->
 * ������ ���ڿ��� s���� ����
 * 
 * int indexOf(Strings) -> ���ڿ� s�� ��Ÿ�� ��ġ�� ��ȯ
 * 
 * int length() -> ���̸� ��ȯ
 * 
 * boolean startsWith(String s)->�����ϴ� ���ڿ��� s���� ����
 * 
 * String substring(int index) -> index���� �����ϴ� ���ڿ��� �Ϻθ� ��ȯ
 * 
 */

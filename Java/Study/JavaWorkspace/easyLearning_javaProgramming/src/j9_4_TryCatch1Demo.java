
public class j9_4_TryCatch1Demo {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			System.out.println("������ ���� => " + array[3]);		// array�� 3���� ���Ҹ� �����Ƿ� array[3]�� ����. ���� ���ܰ� �߻��Ѵ�.
			System.out.println("ù ��° ���� => " + array[0]);		//	���� ���๮���� ���ܰ� �߻������Ƿ� �� ���๮�� �������� �ʴ´�.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���Ұ� �������� �ʽ��ϴ�.");
		}
		System.out.println("������!!!");
	}
}

/*

���Ұ� �������� �ʽ��ϴ�.
������!!!

*/



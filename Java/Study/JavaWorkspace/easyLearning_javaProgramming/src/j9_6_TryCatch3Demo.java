
public class j9_6_TryCatch3Demo {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			int x = array[3];
		} catch (Exception e) {
			System.out.println("������!!!");
		} catch (ArrayIndexOutOfBoundsException e) {	// 		-> Exception ��ü�� ó���ϴ� catch ��Ͽ��� ��� ���ܸ� ó���ϹǷ�
			System.out.println("���Ұ� �������� �ʽ��ϴ�.");			// �� catch ����� ������ �� ����. ���� ������ ������ �߻��Ѵ�. 
		}
		System.out.println("����");
	}

}

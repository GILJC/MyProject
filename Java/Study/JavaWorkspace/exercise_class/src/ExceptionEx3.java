
public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
		// ExceptionEx3.method();  //  ���� ����. �̷������� ȣ�⵵ ����.
		
		System.out.println("method1() �� ���� �Ϸ��ϰ� main���� ����");
	}
	
	static void method() {
		try {
			System.out.println("method()�� ȣ��Ǿ���.");
			return;		// return�� ������ �ڽ��� ȣ���� �޼ҵ�� �ٷ� ���ư��� ������,
		} catch (Exception e) {
			e.printStackTrace();	// ���ܰ� �߻��� ������ ���� ����
		} finally {		// �׷��� finally ������ �ݵ�� ������.
			System.out.println("method1()�� finally ���� ����Ǿ���.");
		}			// ���� return�� ������ finally�� �ݵ�� ������.
	}
}


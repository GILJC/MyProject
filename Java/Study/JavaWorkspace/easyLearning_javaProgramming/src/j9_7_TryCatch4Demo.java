
public class j9_7_TryCatch4Demo {
	public static void main(String[] args) {
		Reso reso = new Reso();			// �ڹ� 7 Ȥ�� 8�̶�� 3~5���� ������ ���� �����ؾ� �Ѵ�.
		
		try(reso) {						// try(Reso reso = new Reso()) {
			reso.show();
		} catch (Exception e) {
			System.out.println("���� ó��");
		}
	}

}

class Reso implements AutoCloseable {
	void show() {
		System.out.println("�ڿ� ���");
	}
	
	public void close() throws Exception {		// AutoCloseable �������̽����� �䱸�ϴ� ���� �޼����̴�.
		System.out.println("�ڿ� �ݱ�");
	}
}

/*

�ڿ� ���
�ڿ� �ݱ�		->  close() ���� �ʾҴµ��� �̿� ���� �޽����� ��µȴ�. �̴� �ڿ��� AutoCloseable ���� ��ü�̸� try~with~resource ���� ����߱� �����̴�.

*/

class Garbage {
	public int no;
	
	public Garbage(int no) {
		this.no = no;
		System.out.printf("Garbage(%d) ����\n", no);
	}
	
	protected void finalize() {							// �������� �����ϱ� ����
		System.out.printf("Garbage(%d) ����\n", no);		// ������ �÷��Ͱ� ȣ���ϴ� ObjectŬ������ �޼����̴�.
	}													// ������ ���� ������ ����Ϸ��� �������̵��� �ڵ��̴�.
}
public class j8_7_GarbageDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i ++)
			new Garbage(i);		// ������ ��ü�� ���� ������ �������� �ʾұ� ������ �ٷ� �������� �ȴ�.
		
		System.gc();		// JVM�� ���� ������ �÷��͸� �����϶�� ��û�Ѵ�.
	}

}

/*
Garbage(0) ����
Garbage(1) ����
Garbage(2) ����
Garbage(2) ����		// �������� ���� ������ ���� ������ �����ϴ�. (���� ��� �ٲ�)
Garbage(0) ����
Garbage(1) ����
*/


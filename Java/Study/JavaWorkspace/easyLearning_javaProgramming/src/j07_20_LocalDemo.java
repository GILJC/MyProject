
public class j7_20_LocalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Eagle extends Bird_7_18 {		// ���� Ŭ�����̴�.
			public void move() {
				System.out.println("�������� ����~~~.");		// Bird Ŭ������ move()�� �������̵��� �޼���
			}
		}
		
		Bird_7_18 e = new Eagle();		// e -> main() �޼����� ���� �����̴�.
		e.move();	// �������� ����~~~.
	}

}

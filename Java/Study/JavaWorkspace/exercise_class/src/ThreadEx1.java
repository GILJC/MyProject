
public class ThreadEx1 {
	
	//���Ǵ� �ð��� �����尡 ������ �� �ֵ��� static�� �ٿ���
	static long startTime = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 500; i++)
			System.out.printf("%s", new String("-"));	// println�ϸ� ����. printStream���� ����(?)
		
		System.out.println("\n�ҿ�ð�1_1: " + (System.currentTimeMillis()-startTime));
		
		for(int i = 0; i < 500; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.println("\n�ҿ�ð�1_2: " + (System.currentTimeMillis()-startTime));
		// ���ð��� �ƴ� ���������� ó��
		
		
		//------------------
		MyThread th1 = new MyThread();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("-");
		}
		System.out.printf("\n�ҿ�ð�2_1: " + (System.currentTimeMillis() - ThreadEx1.startTime));
	}	

}


class MyThread extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.printf("|");		// myThread�� ����� �ﵵ�� ��Ŵ. ���� �ο�
		}
		System.out.print("\n�ҿ�ð�2_2: " + (System.currentTimeMillis() - ThreadEx1.startTime));
	}
}
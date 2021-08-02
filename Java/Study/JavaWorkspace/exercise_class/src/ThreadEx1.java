
public class ThreadEx1 {
	
	//사용되는 시간을 쓰레드가 공용할 수 있도록 static을 붙여줌
	static long startTime = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 500; i++)
			System.out.printf("%s", new String("-"));	// println하면 에러. printStream에는 못씀(?)
		
		System.out.println("\n소요시간1_1: " + (System.currentTimeMillis()-startTime));
		
		for(int i = 0; i < 500; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.println("\n소요시간1_2: " + (System.currentTimeMillis()-startTime));
		// 동시간이 아닌 순차적으로 처리
		
		
		//------------------
		MyThread th1 = new MyThread();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("-");
		}
		System.out.printf("\n소요시간2_1: " + (System.currentTimeMillis() - ThreadEx1.startTime));
	}	

}


class MyThread extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.printf("|");		// myThread가 막대기 찍도록 시킴. 역할 부여
		}
		System.out.print("\n소요시간2_2: " + (System.currentTimeMillis() - ThreadEx1.startTime));
	}
}
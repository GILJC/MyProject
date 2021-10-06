
public class j8_6_SystemDemo {
	public static void main(String[] args) {
		int[] src = new int[] {1, 2, 3, 4, 5, 6};
		int[] dst = {100, 200, 300, 400, 500, 600, 700};
		
		System.arraycopy(src, 2, dst, 3, 4);	// �螌 src�� 2~5�� ���� 4���� �迭 dst�� 3~6�� ���ҿ� �����Ѵ�. (�迭�� 0���� ����)
		for (int i = 0; i < dst.length; i++) {
			System.out.print(dst[i] + " " );
		}
		System.out.println();
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.getenv("JAVA_HOME"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.nanoTime());
	}

}


/*
100 200 300 3 4 5 6 
1627903807882
C:\Program Files\Java\jdk-16.0.2
Windows 10
645223981158200
*/
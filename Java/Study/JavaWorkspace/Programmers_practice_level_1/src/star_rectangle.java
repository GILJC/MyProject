/*
		 ���簢�� ����� ���� ���� �� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�. ��(*) ���ڸ� �̿��� ������ ���̰� n,
		 ������ ���̰� m�� ���簢�� ���¸� ����غ�����.
		  
		 ���� ���� n�� m�� ���� 1000 ������ �ڿ����Դϴ�.
		  
		 ����) 
		 �Է� : 5 3 
		 ��� :
		 *****
		 *****
		 ***** 
		  
*/

public class star_rectangle {

	public static void main(String[] args) {
		
		int q_count = 0;
		
		int a = 5;
		int b = 3;
		
		while (q_count < 2) {
			//---------------------------------
			int n = a;
			int m = b;

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++)
					System.out.print("*");
				System.out.println("");
			}
			//---------------------------------
			q_count += 1;
			a = 2;
			b = 2;
			System.out.println();
		}

		// System.out.println(a + b);

	}

}

//-----------------------------------------------


/*

import java.util.stream.IntStream;

StringBuilder sb = new StringBuilder();
IntStream.range(0, a).forEach(s -> sb.append("*"));
IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));

*/



/*
		 직사각형 별찍기 문제 설명 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다. 별(*) 문자를 이용해 가로의 길이가 n,
		 세로의 길이가 m인 직사각형 형태를 출력해보세요.
		  
		 제한 조건 n과 m은 각각 1000 이하인 자연수입니다.
		  
		 예시) 
		 입력 : 5 3 
		 출력 :
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



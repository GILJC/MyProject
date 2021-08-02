/*
x만큼 간격이 있는 n개의 숫자
문제 설명
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

제한 조건
x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.
입출력 예
x	n	answer
2	5	[2,4,6,8,10]
4	3	[4,8,12]
-4	2	[-4, -8]

*/



import java.util.Arrays;

public class n_nums_distance_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int q_count = 0;

		int x = 2;
		int n = 5;

		while (q_count < 3) {
			//--------------------------------
			int list_size = n;
			long tmp = (int)x;	// -> int에서 long 으로 형변환
			long[] list = new long[list_size];

			for (int i = 0; i < n; i++) {
				list[i] = tmp;
				tmp += x;
				// System.out.print(list[i] + " ");
			}
			// 이곳저곳 다 long으로 안하면 범위가 100만을 넘어가서 에러.
			// int는 한계치가 +-21만 정도였음
			long[] answer = Arrays.copyOfRange(list, 0, list_size);
			// long[] answer = Arrays.copyOf(list, list_size);
			System.out.println(Arrays.toString(list));

			// return answer;
			//----------------------------------

			q_count += 1;
			if (q_count == 1) {
				x = 4;
				n = 3;
				System.out.println();
			} else if (q_count == 2) {
				x = -4;
				n = 2;
				System.out.println();
			}
		}
	}
}


//---------------------------------------
/*
import java.util.*;
class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}
*/







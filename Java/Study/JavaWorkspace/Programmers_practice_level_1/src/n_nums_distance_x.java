/*
x��ŭ ������ �ִ� n���� ����
���� ����
�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
n�� 1000 ������ �ڿ����Դϴ�.
����� ��
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
			long tmp = (int)x;	// -> int���� long ���� ����ȯ
			long[] list = new long[list_size];

			for (int i = 0; i < n; i++) {
				list[i] = tmp;
				tmp += x;
				// System.out.print(list[i] + " ");
			}
			// �̰����� �� long���� ���ϸ� ������ 100���� �Ѿ�� ����.
			// int�� �Ѱ�ġ�� +-21�� ��������
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







//https://ryan-han.com/post/java/java-lang/

import java.util.StringTokenizer;

public class STEx { // StringTokenizer

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "��ʿ�����õ"; // 354000

		System.out.println(input);
		System.out.println(hangulToNum(input));
	}

	public static long hangulToNum(String input) {
		long result = 0;
		long tmpResult = 0; // �ʹ�õ ������ ���� �����ϱ� ���� �ӽú���
		long num = 0;

		final String NUMBER = "�����̻�����ĥ�ȱ�";
		final String UNIT = "�ʹ�õ��������";
		final long[] UNIT_NUM = { 10, 100, 1000, 10000, (long) 1e8, (long) 1e12, (long) 1e16 };

		StringTokenizer st = new StringTokenizer(input, UNIT, true);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			int check = NUMBER.indexOf(token); // ��������, ����(UNIT)���� Ȯ��

			if (check == -1) { // ������ ���
				if ("������".indexOf(token) == -1) {
					tmpResult += (num != 0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
				} else {
					tmpResult += num;
					result += (tmpResult != 0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
					tmpResult = 0;
				}
				num = 0;
			} else {
				num = check;
			}
		}
		return result + tmpResult + num;
	}
}
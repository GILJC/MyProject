
public class j9_5_TryCatch2Demo {

	public static void main(String[] args) {
		int dividend = 10;
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
		} catch (ArrayIndexOutOfBoundsException e) {		// �迭�� ������ ��� �ε����� ����� �� �߻��Ѵ�.
			System.out.println("���Ұ� �������� �ʽ��ϴ�.");			//	���⼭�� main() �޼����� �μ��� ���� �� �߻��Ѵ�.
		} catch (NumberFormatException e) {				// main() �޼����� �μ��� ���ڷ� �ٲ� �� ���� �� �߻��Ѵ�.
			System.out.println("���ڰ� �ƴմϴ�.");
		} catch (ArithmeticException e) {				// main() �޼����� �μ��� 0�϶� ���� �� �����Ƿ� �߻��Ѵ�.
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
			System.out.println("�׻� ����˴ϴ�.");			// ���� �߻��� ������� �׻� �����Ѵ�. finally ����� ���� ����̴�.
		}
		System.out.println("����.");
	}

}

/*

���Ұ� �������� �ʽ��ϴ�.
�׻� ����˴ϴ�.
����.


*/

/*
args���� ����� �ִ� ��� : ���� ���(���) , �׻� ����˴ϴ�. ����.
���� �ƴ� �μ��� �־��� �� : ���ڰ� �ƴմϴ�.
						�׻� ����˴ϴ�.
						����
(�μ��� 0�϶�)
0���� ���� �� �����ϴ�.
�׻� ����˴ϴ�.
����.
*/
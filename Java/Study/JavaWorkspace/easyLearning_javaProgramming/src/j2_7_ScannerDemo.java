import java.util.Scanner;

public class j2_7_ScannerDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("%d * %d�� %d�Դϴ�.", x, y, x * y);

		Scanner s = new Scanner(System.in);

		// String str = s.nextLine();
		String str;

		do {
			System.out.printf("�����Ϸ��� q�� �Է��Ͻÿ�.");
			str = s.nextLine();
		} /* while (str != "q"); */ while (!str.equals("q")); // ���ڿ� �� �� equals() �޼ҵ� �̿�
	}
}

import java.util.Scanner;

public class j2_7_ScannerDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d입니다.", x, y, x * y);

		Scanner s = new Scanner(System.in);

		// String str = s.nextLine();
		String str;

		do {
			System.out.printf("종료하려면 q를 입력하시오.");
			str = s.nextLine();
		} /* while (str != "q"); */ while (!str.equals("q")); // 문자열 비교 시 equals() 메소드 이용
	}
}

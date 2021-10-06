import java.util.Scanner;

public class j9_8_ThrowsDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			square(in.nextLine());
		} catch (NumberFormatException e) {			// square() �޼��忡�� ���ܰ� �߻��ϸ� ������ ó������ �ʰ� ���⼭ ó���Ѵ�.
			System.out.println("������ �ƴմϴ�.");
		}
	}
	
	private static void square(String s) throws NumberFormatException {		// ȣ���� �޼��忡�� ���ܸ� ó���ϵ��� ���ѱ��.
		int n = Integer.parseInt(s);		// s�� ���� ���ڿ��� �ƴϸ� NumberFormatException ���ܰ� �߻��Ѵ�.
		System.out.println(n * n);
	}

}



/*

a		->  �Է°����� ���� ���ڿ��� �ƴϴ�.
������ �ƴմϴ�.


*/
//---------------------
/*

2
4


*/
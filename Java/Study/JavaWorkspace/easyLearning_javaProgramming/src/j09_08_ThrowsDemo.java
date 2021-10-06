import java.util.Scanner;

public class j9_8_ThrowsDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			square(in.nextLine());
		} catch (NumberFormatException e) {			// square() 메서드에서 예외가 발생하면 스스로 처리하지 않고 여기서 처리한다.
			System.out.println("정수가 아닙니다.");
		}
	}
	
	private static void square(String s) throws NumberFormatException {		// 호출한 메서드에서 예외를 처리하도록 떠넘긴다.
		int n = Integer.parseInt(s);		// s가 숫자 문자열이 아니면 NumberFormatException 예외가 발생한다.
		System.out.println(n * n);
	}

}



/*

a		->  입력값으로 정수 문자열이 아니다.
정수가 아닙니다.


*/
//---------------------
/*

2
4


*/
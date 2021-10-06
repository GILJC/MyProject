
public class j9_5_TryCatch2Demo {

	public static void main(String[] args) {
		int dividend = 10;
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
		} catch (ArrayIndexOutOfBoundsException e) {		// 배열의 범위를 벗어날 인덱스를 사용할 때 발생한다.
			System.out.println("원소가 존재하지 않습니다.");			//	여기서는 main() 메서드의 인수가 없을 때 발생한다.
		} catch (NumberFormatException e) {				// main() 메서드의 인수를 숫자로 바꿀 수 없을 떄 발생한다.
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException e) {				// main() 메서드의 인수가 0일때 나눌 수 없으므로 발생한다.
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("항상 실행됩니다.");			// 예외 발생과 관계없이 항상 실행한다. finally 블록은 선택 사양이다.
		}
		System.out.println("종료.");
	}

}

/*

원소가 존재하지 않습니다.
항상 실행됩니다.
종료.


*/

/*
args값을 제대로 주는 경우 : 정상 출력(계산) , 항상 실행됩니다. 종료.
정수 아닌 인수가 주어질 때 : 숫자가 아닙니다.
						항상 실행됩니다.
						종료
(인수가 0일때)
0으로 나눌 수 없습니다.
항상 실행됩니다.
종료.
*/
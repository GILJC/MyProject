
public class j9_4_TryCatch1Demo {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			System.out.println("마지막 원소 => " + array[3]);		// array는 3개의 원소만 있으므로 array[3]은 없다. 따라서 예외가 발생한다.
			System.out.println("첫 번째 원소 => " + array[0]);		//	이전 실행문에서 예외가 발생했으므로 이 실행문은 실행하지 않는다.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다.");
		}
		System.out.println("어이쿠!!!");
	}
}

/*

원소가 존재하지 않습니다.
어이쿠!!!

*/



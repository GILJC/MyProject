
public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("일부러 발생시킨거임");
			throw e;
			// throw new Exception("고의로 발생시킨거임.");
		} catch (Exception e) {
			System.out.println("에럴 메시지: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}

// 예외 발생시, try -> catch -> finally의 순서로 실행되고

// 예외 미발생시, try -> finally의 순서로 실행된다.

// try 또는 catch 블럭에서 return문을 만나도  finally는 실행된다.


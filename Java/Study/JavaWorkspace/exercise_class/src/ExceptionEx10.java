
public class ExceptionEx10 {
	
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 메소드에서 예외를 처리했습니다.");
			e.printStackTrace();
			e.getMessage();
		}
	}
	
	static void method1() throws Exception {
		throw new Exception("ㅁ\"e.getMessage 출력문\"ㅁ");
	}

}

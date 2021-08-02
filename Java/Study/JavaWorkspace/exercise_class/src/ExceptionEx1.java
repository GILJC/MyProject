
public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(1);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			System.out.println("예외 메시지: " + ae.getMessage());
			ae.printStackTrace();
			System.out.println("어떤 수를 0으로 나눌 수 없습니다.");
			System.out.println(5);
		}
		System.out.println(6);
	}
}

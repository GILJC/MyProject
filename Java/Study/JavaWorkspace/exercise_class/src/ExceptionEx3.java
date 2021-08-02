
public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
		// ExceptionEx3.method();  //  위와 같음. 이런식으로 호출도 가능.
		
		System.out.println("method1() 의 실행 완료하고 main으로 복귀");
	}
	
	static void method() {
		try {
			System.out.println("method()이 호출되었음.");
			return;		// return을 만나면 자신을 호출한 메소드로 바로 돌아가야 하지만,
		} catch (Exception e) {
			e.printStackTrace();	// 예외가 발생할 여지가 전혀 없음
		} finally {		// 그래도 finally 내용은 반드시 실행함.
			System.out.println("method1()의 finally 블럭이 실행되었음.");
		}			// 위에 return이 있지만 finally는 반드시 실행함.
	}
}



public class j9_7_TryCatch4Demo {
	public static void main(String[] args) {
		Reso reso = new Reso();			// 자바 7 혹은 8이라면 3~5행을 다음과 같이 수정해야 한다.
		
		try(reso) {						// try(Reso reso = new Reso()) {
			reso.show();
		} catch (Exception e) {
			System.out.println("예외 처리");
		}
	}

}

class Reso implements AutoCloseable {
	void show() {
		System.out.println("자원 사용");
	}
	
	public void close() throws Exception {		// AutoCloseable 인터페이스에서 요구하는 구현 메서드이다.
		System.out.println("자원 닫기");
	}
}

/*

자원 사용
자원 닫기		->  close() 하지 않았는데도 이와 같은 메시지가 출력된다. 이는 자원이 AutoCloseable 구현 객체이며 try~with~resource 문을 사용했기 때문이다.

*/

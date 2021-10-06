class Garbage {
	public int no;
	
	public Garbage(int no) {
		this.no = no;
		System.out.printf("Garbage(%d) 생성\n", no);
	}
	
	protected void finalize() {							// 가비지를 수거하기 전에
		System.out.printf("Garbage(%d) 수거\n", no);		// 가비지 컬렉터가 호출하는 Object클래스의 메서드이다.
	}													// 가비지 수거 과정을 출력하려고 오버라이딩한 코드이다.
}
public class j8_7_GarbageDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i ++)
			new Garbage(i);		// 생성된 객체를 참조 변수에 대입하지 않았기 떄문에 바로 가비지가 된다.
		
		System.gc();		// JVM에 빨리 가비지 컬렉터를 실행하라고 요청한다.
	}

}

/*
Garbage(0) 생성
Garbage(1) 생성
Garbage(2) 생성
Garbage(2) 수거		// 가비지의 생성 순서와 수거 순서는 무관하다. (순서 계속 바뀜)
Garbage(0) 수거
Garbage(1) 수거
*/


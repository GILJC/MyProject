
public class ExceptionEx10 {
	
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main �޼ҵ忡�� ���ܸ� ó���߽��ϴ�.");
			e.printStackTrace();
			e.getMessage();
		}
	}
	
	static void method1() throws Exception {
		throw new Exception("��\"e.getMessage ��¹�\"��");
	}

}


public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("�Ϻη� �߻���Ų����");
			throw e;
			// throw new Exception("���Ƿ� �߻���Ų����.");
		} catch (Exception e) {
			System.out.println("���� �޽���: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}

// ���� �߻���, try -> catch -> finally�� ������ ����ǰ�

// ���� �̹߻���, try -> finally�� ������ ����ȴ�.

// try �Ǵ� catch ������ return���� ������  finally�� ����ȴ�.


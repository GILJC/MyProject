import java.io.*;
import java.net.*;

public class j18_2_2_SimpleClient {			// ���� ���� ( j18_2_1_SimpleServer ) �����ؼ� ����
	public static void main(String[] args) {
		try (Socket client = new Socket("localhost", 5000);		// 5000�� ��Ʈ�� ������ Socket ��ü�� �����Ѵ�. 5000���� ������ ������ ��Ʈ ��ȣ�̴�.	/ 'client' Socket ����
				OutputStream os = client.getOutputStream();		// client�� �����⸸ �ҰŶ� inputStream �ʿ� ����
				ObjectOutputStream oos = new ObjectOutputStream(os);) {		// ������ outputStream�� ����� ObjectOutputStream oos�� �ٽ� �������� objectȭ �Ǿ ���� �� �ִ�.
			
			oos.writeObject("�ȳ�, �ܼ� ������");		// ��� ��Ʈ������ ���ڿ��� ������
			oos.flush();							// ���۸� �����.		/ flush -> NoSQL(redis)������ ���� ���ﶧ ���̴� �װ�
		} catch (Exception e) {
			
		}
	}
}

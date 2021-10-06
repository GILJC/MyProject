import java.io.*;
import java.net.*;

public class j18_2_1_SimpleServer {
	public static void main(String[] args) {		//		// try~with~resource ���̹Ƿ� ���⼭ ������ �ڿ��� ����� ���� �� �ڵ����� �ݳ��ȴ�.
		try (ServerSocket server = new ServerSocket(5000);		//  port5000 ¥�� server�� �����д�.(���� �� ����, �� �� �ְ� ��������)	-> �̸��� server���� ��� ���� �����Ѱ�.
				Socket connection = server.accept();			// Ŭ���̾�Ʈ�� ������ ��û�� ������ ��ٸ���. ������ ��û�ϸ� �����ϰ�, ������ ������ �����Ѵ�.	<- ���⼭ ���� �������
				InputStream is = connection.getInputStream();	// ������ Socket connection��  server.accept()�� �ʱ�ȭ�����Ƿ�, client���� server�� ���� ���� connection�� is�� Inputstream���� ������	-> inputstream���� is�� ����  
				ObjectInputStream ois = new ObjectInputStream(is);) {	// is�� InputStream���� ����� �����͸� ois�� OutputStream���� ����		-> inputstream is ���� OutputStream ois�� �������� ��� ���� 
			
			String str = (String) ois.readObject();			// �Է� ��Ʈ���� ���� ���ڿ��� �о� ���δ�.	-> ������ ���� ois �����͸� String str�� ������.
			System.out.println("���� ���ڿ� = " + str);		// ���� ������ ���� ����� str(=������ Ŭ���̾�Ʈ���� ���� input��)�� ���
		} catch (Exception e) {
		}
	}
}


/*

1. ��ȭ�� ����� �޾ƾ� ������.
2. ������ �׳� ���� ������ ���. Ŭ���̾�Ʈ�� �����ϱ������� �ƹ� ���� ����.

3. ������ ���� ������ ������(client���� ������ loop �����Ƿ� client�� �׳� ���� ����)
   ���Ͽ��� ������ ����� ��Ʈ���� ������ �ݴ´�. 

*/
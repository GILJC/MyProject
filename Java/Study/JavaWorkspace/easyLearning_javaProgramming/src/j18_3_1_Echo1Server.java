import java.io.*;
import java.net.*;

public class j18_3_1_Echo1Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = null;
		Socket connection = null;
		BufferedReader in = null;
		
		try {
			server = new ServerSocket(5000);		// ���� ������ 500�� port�� �����Ѵ�.
		} catch (IOException e) {
		
		}
		
		System.out.println("���� ��� ��.....");
		
		try {
			connection = server.accept();		//  Ŭ���̾�Ʈ���� ������ ��û�ϸ� �����ϰ� ������ �����Ѵ�.
		} catch (IOException e) {
			
		}
		
		System.out.println("�޽����� ��ٸ��� ��.....");
		
		in = new BufferedReader(										// ���Ͽ��� �Է� ��Ʈ���� ������
				new InputStreamReader(connection.getInputStream()));	// InputStreamReader ��ü�� �����Ѵ�.
		
		String msg;
		
		while ((msg = in.readLine()) != null) {					// ������ �̿��� Ŭ���̾�Ʈ���� �Էµ� �޽����� �Է�
			if (msg.contains("��"))								// ��Ʈ���� ���� �� '��'�� �������� ���� ������
				break;
			System.out.println("���� �޽��� �޾Ƹ� : " + msg);		// ȭ�鿡 ����Ѵ�.
		}
		
		System.out.println("���� ����");
		in.close();
		connection.close();
		server.close();
	}
}


/*

���� ��� ��.....
�޽����� ��ٸ��� ��.....
���� �޽��� �޾Ƹ� : �ȳ��ϼ���.
���� �޽��� �޾Ƹ� : �����ϴ�
���� ����


*/










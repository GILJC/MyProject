import java.io.*;
import java.net.*;
import java.util.Scanner;

public class test {			// throws IOException -> �̰� ������ �߰��κ��� client.getOutputStream() �κа�, 
	public static void main(String[] args) throws IOException {	// ���������� client.close();���� ������ �߻� -> å�� throw ����. �߰��� -> �׷����� �ߵ� 
		Socket client = null;
		PrintWriter out = null;
		
		try {
			client = new Socket();		// �� ������ �����Ѵ�.
			System.out.println("���� ������ ���� �õ�...");
			client.connect(new InetSocketAddress("localhost", 5000), 3000);	// �������� ������ ������ ��û�Ѵ�
			System.out.println("���� ������ ���� ����...");				// 3000 -> Ÿ�Ӿƿ��� �ǹ��ϸ�, ������ ms�̴�.
		} catch (Exception e) {			
		}
		
		out = new PrintWriter(client.getOutputStream(), true);  // true�̸� ���۸� �������� ����.
												// ���Ͽ��� ��� ��Ʈ���� �����Ѵ�.
		Scanner in = new Scanner(System.in);
		String msg;
		
		System.out.print("���� �޽����� �ֳ���? ");
		while ((msg = in.nextLine()) != null) {			// ������ �̿���
			if (msg.contains("��"))						// Ŭ���̾�Ʈ���� �Էµ� �޽�����
				break;									// �Է� ��Ʈ������ ���� ��
			out.println(msg);							// '��'�� �������� ���� �� ����
			System.out.print("���� �޼����� �� �ֳ���? ");	// ȭ�鿡 ����Ѵ�.
		}
		
		System.out.println("Ŭ���̾�Ʈ ����");
		out.close();
		in.close();			// ����, �Է�,��� ��Ʈ���� �ݴ´�.
		client.close();
	}
}


/*

���� ������ ���� �õ�...
���� ������ ���� ����...
���� �޽����� �ֳ���? �ȳ��ϼ���.
���� �޼����� �� �ֳ���? �����ϴ�
���� �޼����� �� �ֳ���? ��
Ŭ���̾�Ʈ ����


*/











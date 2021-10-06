import java.io.*;
import java.net.*;

public class j18_4_Echo2Server extends Thread{	// Echo2Server �� Thread�� �ڽ� Ŭ�����̴�. -> Thread �� ���� class�� �ȸ��� ���� �ֱ⿡ extends ����
	protected static boolean cont = true;
	protected Socket connection = null;
	
	public static void main(String[] args) throws IOException { // throws IOException -> ���� �����Ҷ� ������ ����������
		ServerSocket server = null;
		// 1:1 Server�� 3���� ServerSocket server = null �� �Ʒ��� ���ְ� (O)
		// Socket connection = null;  -> �� ���� �� ���� (O)
		// BufferedReader in = null �� �Ʒ�, run() �Լ����� ���. (O)
		
		server = new ServerSocket(5000);  //  5000 �� ��Ʈ�� server ����
		System.out.println("���� ���� ����");
		
		while (cont) { // -> �� True�� ���ߴ����� ������, cont = True
			System.out.println("���� ���� ����");
			new j18_4_Echo2Server(server.accept()); // 'Ŭ���̾�Ʈ�� ��û�� ����'�ϰ� ������ ����� �����带 �����Ѵ�.
		}						// 1:1Ŭ���̾�Ʈ���� -> try{ Socket connection = server.accept();
		server.close();					//			} catch(IOException e) {} �� Ŭ���̾�Ʈ�� ��û�� server�� ������������ ���⼱ �Ⱦ�.  
	}
	// 1:1server������ try, catch�� connection=server.accept();�� �ѹ� �ް� �Ѿ����, ���⼱ while�� ��� ����. -> ��� ���� ����
 	
	private j18_4_Echo2Server(Socket clientSocket) {
		//  �׳� Echo2Server �� �ϸ� ���� -> �ڱ� class�̸� ���� �ؾ� ��.
		connection = clientSocket;
		start();
	}
	
	public void run() {
		BufferedReader in;
		
		System.out.println("Ŭ���̾�Ʈ�� ����� ���� ���ο� ������ ����");
		try {
			in = new BufferedReader(		// ���Ͽ��� ������ �Է� ��Ʈ������ Ŭ���̾�Ʈ���� ���ڿ��� �޾� ����Ѵ�.
					new InputStreamReader(connection.getInputStream()));
			
			String msg;
			
			while ((msg = in.readLine()) != null) {
				System.out.println("���� �޽��� �޾Ƹ� : " + msg);
			}
			
			in.close();
			connection.close();
		}catch (IOException e) {
		}
	}
	
}


/*

���� ���� ����
���� ���� ����
���� ���� ����
Ŭ���̾�Ʈ�� ����� ���� ���ο� ������ ����
���� �޽��� �޾Ƹ� : ����, ���� �輱��
���� ���� ����
Ŭ���̾�Ʈ�� ����� ���� ���ο� ������ ����
���� ���� ����
Ŭ���̾�Ʈ�� ����� ���� ���ο� ������ ����
���� �޽��� �޾Ƹ� : ����, ���� �Ӳ���


*/

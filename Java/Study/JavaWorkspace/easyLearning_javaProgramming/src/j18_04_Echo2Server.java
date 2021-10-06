import java.io.*;
import java.net.*;

public class j18_4_Echo2Server extends Thread{	// Echo2Server 가 Thread의 자식 클래스이다. -> Thread 는 따로 class를 안만들어도 원래 있기에 extends 가능
	protected static boolean cont = true;
	protected Socket connection = null;
	
	public static void main(String[] args) throws IOException { // throws IOException -> 서버 연결할때 없으면 에러나더라
		ServerSocket server = null;
		// 1:1 Server의 3개중 ServerSocket server = null 은 아래에 써주고 (O)
		// Socket connection = null;  -> 은 위에 뺴 놓음 (O)
		// BufferedReader in = null 은 아래, run() 함수에서 사용. (O)
		
		server = new ServerSocket(5000);  //  5000 번 포트로 server 생성
		System.out.println("서버 소켓 생성");
		
		while (cont) { // -> 왜 True로 안했는지는 모르지만, cont = True
			System.out.println("서버 소켓 생성");
			new j18_4_Echo2Server(server.accept()); // '클라이언트의 요청을 승인'하고 소켓을 사용해 스레드를 생성한다.
		}						// 1:1클라이언트에선 -> try{ Socket connection = server.accept();
		server.close();					//			} catch(IOException e) {} 로 클라이언트의 요청을 server가 승인해줬지만 여기선 안씀.  
	}
	// 1:1server에서는 try, catch로 connection=server.accept();를 한번 받고 넘어갔지만, 여기선 while로 계속 돌림. -> 모든 연결 승인
 	
	private j18_4_Echo2Server(Socket clientSocket) {
		//  그냥 Echo2Server 로 하면 에러 -> 자기 class이름 으로 해야 함.
		connection = clientSocket;
		start();
	}
	
	public void run() {
		BufferedReader in;
		
		System.out.println("클라이언트와 통신을 위한 새로운 스레드 생성");
		try {
			in = new BufferedReader(		// 소켓에서 생성한 입력 스트림으로 클라이언트에서 문자열을 받아 출력한다.
					new InputStreamReader(connection.getInputStream()));
			
			String msg;
			
			while ((msg = in.readLine()) != null) {
				System.out.println("읽은 메시지 메아리 : " + msg);
			}
			
			in.close();
			connection.close();
		}catch (IOException e) {
		}
	}
	
}


/*

서버 소켓 생성
서버 소켓 생성
서버 소켓 생성
클라이언트와 통신을 위한 새로운 스레드 생성
읽은 메시지 메아리 : 나야, 봉이 김선달
서버 소켓 생성
클라이언트와 통신을 위한 새로운 스레드 생성
서버 소켓 생성
클라이언트와 통신을 위한 새로운 스레드 생성
읽은 메시지 메아리 : 나야, 의적 임꺽정


*/

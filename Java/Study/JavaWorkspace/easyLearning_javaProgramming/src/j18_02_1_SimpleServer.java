import java.io.*;
import java.net.*;

public class j18_2_1_SimpleServer {
	public static void main(String[] args) {		//		// try~with~resource 문이므로 여기서 생성한 자원은 블록이 끝날 때 자동으로 반납된다.
		try (ServerSocket server = new ServerSocket(5000);		//  port5000 짜리 server를 만들어둔다.(아직 안 열음, 열 수 있게 만들어놓음)	-> 이름은 server지만 사실 소켓 생성한것.
				Socket connection = server.accept();			// 클라이언트가 연결을 요청할 때까지 기다린다. 연결을 요청하면 승인하고, 서버용 소켓을 생성한다.	<- 여기서 서버 열어놓음
				InputStream is = connection.getInputStream();	// 위에서 Socket connection을  server.accept()로 초기화했으므로, client에서 server로 들어온 값을 connection이 is에 Inputstream으로 저장함	-> inputstream값을 is에 저장  
				ObjectInputStream ois = new ObjectInputStream(is);) {	// is에 InputStream으로 저장된 데이터를 ois에 OutputStream으로 꺼냄		-> inputstream is 값을 OutputStream ois로 만들어줘야 출력 가능 
			
			String str = (String) ois.readObject();			// 입력 스트림을 통해 문자열을 읽어 들인다.	-> 위에서 꺼낸 ois 데이터를 String str에 저장함.
			System.out.println("받은 문자열 = " + str);		// 위의 과정을 거쳐 저장된 str(=서버가 클라이언트에서 받은 input값)을 출력
		} catch (Exception e) {
		}
	}
}


/*

1. 방화벽 허락을 받아야 연결함.
2. 서버라서 그냥 서버 열리고 대기. 클라이언트가 접속하기전까지 아무 반응 없음.

3. 한쪽의 소켓 연결을 끊으면(client에서 보내면 loop 없으므로 client는 그냥 정상 종료)
   소켓에서 가져온 입출력 스트림과 소켓을 닫는다. 

*/
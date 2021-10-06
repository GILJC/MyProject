import java.io.*;
import java.net.*;

public class j18_3_1_Echo1Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = null;
		Socket connection = null;
		BufferedReader in = null;
		
		try {
			server = new ServerSocket(5000);		// 서버 소켓을 500번 port로 생성한다.
		} catch (IOException e) {
		
		}
		
		System.out.println("연결 대기 중.....");
		
		try {
			connection = server.accept();		//  클라이언트에서 연결을 요청하면 승인하고 소켓을 생성한다.
		} catch (IOException e) {
			
		}
		
		System.out.println("메시지를 기다리는 중.....");
		
		in = new BufferedReader(										// 소켓에서 입력 스트림을 가져와
				new InputStreamReader(connection.getInputStream()));	// InputStreamReader 객체를 생성한다.
		
		String msg;
		
		while ((msg = in.readLine()) != null) {					// 소켓을 이용해 클라이언트에서 입력된 메시지를 입력
			if (msg.contains("끝"))								// 스트림을 읽은 후 '끝'을 포함하지 않을 때까지
				break;
			System.out.println("읽은 메시지 메아리 : " + msg);		// 화면에 출력한다.
		}
		
		System.out.println("서버 종료");
		in.close();
		connection.close();
		server.close();
	}
}


/*

연결 대기 중.....
메시지를 기다리는 중.....
읽은 메시지 메아리 : 안녕하세요.
읽은 메시지 메아리 : 좋습니다
서버 종료


*/










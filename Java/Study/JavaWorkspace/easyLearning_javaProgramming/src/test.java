import java.io.*;
import java.net.*;
import java.util.Scanner;

public class test {			// throws IOException -> 이게 없으면 중간부분의 client.getOutputStream() 부분과, 
	public static void main(String[] args) throws IOException {	// 마지막줄의 client.close();에서 에러가 발생 -> 책에 throw 없음. 추가함 -> 그랬더니 잘됨 
		Socket client = null;
		PrintWriter out = null;
		
		try {
			client = new Socket();		// 빈 소켓을 생성한다.
			System.out.println("에코 서버와 연결 시도...");
			client.connect(new InetSocketAddress("localhost", 5000), 3000);	// 소켓으로 서버에 연결을 요청한다
			System.out.println("에코 서버와 연결 성공...");				// 3000 -> 타임아웃을 의미하며, 단위는 ms이다.
		} catch (Exception e) {			
		}
		
		out = new PrintWriter(client.getOutputStream(), true);  // true이면 버퍼를 지동으로 비운다.
												// 소켓에서 출력 스트림을 생성한다.
		Scanner in = new Scanner(System.in);
		String msg;
		
		System.out.print("보낼 메시지가 있나요? ");
		while ((msg = in.nextLine()) != null) {			// 소켓을 이용해
			if (msg.contains("끝"))						// 클라이언트에서 입력된 메시지를
				break;									// 입력 스트림으로 읽은 후
			out.println(msg);							// '끝'을 포함하지 않을 떄 까지
			System.out.print("보낼 메세지가 더 있나요? ");	// 화면에 출력한다.
		}
		
		System.out.println("클라이언트 종료");
		out.close();
		in.close();			// 소켓, 입력,출력 스트림을 닫는다.
		client.close();
	}
}


/*

에코 서버와 연결 시도...
에코 서버와 연결 성공...
보낼 메시지가 있나요? 안녕하세요.
보낼 메세지가 더 있나요? 좋습니다
보낼 메세지가 더 있나요? 끝
클라이언트 종료


*/











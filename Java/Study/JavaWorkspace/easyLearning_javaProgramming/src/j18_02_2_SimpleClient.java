import java.io.*;
import java.net.*;

public class j18_2_2_SimpleClient {			// 앞의 서버 ( j18_2_1_SimpleServer ) 참고해서 볼것
	public static void main(String[] args) {
		try (Socket client = new Socket("localhost", 5000);		// 5000번 포트로 연결할 Socket 객체를 생성한다. 5000번은 연결할 서버의 포트 번호이다.	/ 'client' Socket 생성
				OutputStream os = client.getOutputStream();		// client는 보내기만 할거라 inputStream 필요 없음
				ObjectOutputStream oos = new ObjectOutputStream(os);) {		// 위에서 outputStream을 만들고 ObjectOutputStream oos로 다시 만들어줘야 object화 되어서 보낼 수 있다.
			
			oos.writeObject("안녕, 단순 서버야");		// 출력 스트림으로 문자열을 보내고
			oos.flush();							// 버퍼를 지운다.		/ flush -> NoSQL(redis)에서도 전부 지울때 쓰이는 그것
		} catch (Exception e) {
			
		}
	}
}

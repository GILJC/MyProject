import java.net.*;
import java.util.Scanner;


public class j18_1_InetAddressDemo {
	public static void main(String[] args) {
		InetAddress addr1 = null, addr2 = null;
		System.out.print("호스트 이름을 입력하시오 : ");
		Scanner in = new Scanner(System.in);
		String url = in.nextLine();
		
		try {
			addr1 = InetAddress.getByName(url);		// 호스트의 이름으로 InetAddress 객체를 생성한다.	-> 입력한 url의 ip주소  의 정보를 받는다(String형태 아님)
			addr2 = InetAddress.getLocalHost();		// 로컬 호스트의 InetAddress 객체를 생성한다.		-> 내 컴퓨터(로컬호스트)의 ip주소  의 정보를 받는다(String형태 아님)
		} catch (UnknownHostException e) {
		}
		
		System.out.println(url + "의 IP 주소 : ");
		System.out.println(addr1.getHostAddress());		// IP 주소를 String 타입으로 반환한다.
		System.out.println("로컬 IP 주소 : ");
		System.out.println(addr2.getHostAddress());
	}
}


/*

호스트 이름을 입력하시오 : www.hanbit.co.kr
www.hanbit.co.kr의 IP 주소 : 
218.38.58.195
로컬 IP 주소 : 
192.168.100.1

*/


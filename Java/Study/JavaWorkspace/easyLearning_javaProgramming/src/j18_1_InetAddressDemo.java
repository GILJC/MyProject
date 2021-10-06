import java.net.*;
import java.util.Scanner;


public class j18_1_InetAddressDemo {
	public static void main(String[] args) {
		InetAddress addr1 = null, addr2 = null;
		System.out.print("ȣ��Ʈ �̸��� �Է��Ͻÿ� : ");
		Scanner in = new Scanner(System.in);
		String url = in.nextLine();
		
		try {
			addr1 = InetAddress.getByName(url);		// ȣ��Ʈ�� �̸����� InetAddress ��ü�� �����Ѵ�.	-> �Է��� url�� ip�ּ�  �� ������ �޴´�(String���� �ƴ�)
			addr2 = InetAddress.getLocalHost();		// ���� ȣ��Ʈ�� InetAddress ��ü�� �����Ѵ�.		-> �� ��ǻ��(����ȣ��Ʈ)�� ip�ּ�  �� ������ �޴´�(String���� �ƴ�)
		} catch (UnknownHostException e) {
		}
		
		System.out.println(url + "�� IP �ּ� : ");
		System.out.println(addr1.getHostAddress());		// IP �ּҸ� String Ÿ������ ��ȯ�Ѵ�.
		System.out.println("���� IP �ּ� : ");
		System.out.println(addr2.getHostAddress());
	}
}


/*

ȣ��Ʈ �̸��� �Է��Ͻÿ� : www.hanbit.co.kr
www.hanbit.co.kr�� IP �ּ� : 
218.38.58.195
���� IP �ּ� : 
192.168.100.1

*/


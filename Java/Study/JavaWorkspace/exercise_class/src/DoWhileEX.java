import java.util.Scanner;

public class DoWhileEX {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//String str = s.nextLine();
		String str;
				
		do {
			System.out.printf("�����Ϸ��� q�� �Է��Ͻÿ�.");
			str = s.nextLine();			
		} /*while (str != "q"); */ while (!str.equals("q"));
	}

}


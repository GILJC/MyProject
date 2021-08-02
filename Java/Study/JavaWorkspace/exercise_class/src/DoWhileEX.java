import java.util.Scanner;

public class DoWhileEX {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//String str = s.nextLine();
		String str;
				
		do {
			System.out.printf("종료하려면 q를 입력하시오.");
			str = s.nextLine();			
		} /*while (str != "q"); */ while (!str.equals("q"));
	}

}


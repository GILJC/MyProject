import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("C:/test.txt"));
		int count = 0;
		int totalSum = 0;
		
		while (sc.hasNextLine()) {		// hasNextLine -> boolean 형, 다음 라인이 있냐.
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			int sum = 0;
			
			while(sc2.hasNextInt()) {	// -> 다음 정수 입력이 있는가 묻는 것.
				sum += sc2.nextInt(); 
			}
			
			System.out.println(line + "sum = " + sum);
			totalSum += sum;
			count++;
		}
		System.out.println("Line: " + count + ", Total: " + totalSum);
	}

}

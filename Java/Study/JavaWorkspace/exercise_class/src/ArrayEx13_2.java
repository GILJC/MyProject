
public class ArrayEx13_2 {

	public static void main(String[] args) {
		// 계산기
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("프로그램의이름 arg1 arg2");
			System.exit(0);
		}
		
		String strNum1 = args[0]; //100
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); //Wrapper class
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}

// 사용법
// 우클릭 -> Run As ->  Run Configurations -> 상단 메뉴중 Arguments
// -> 띄어쓰기 간격으로 입력값 2개 넣고 -> Run
// ex) 100 200

public class ArrayEx13_2 {

	public static void main(String[] args) {
		// ����
		if(args.length != 2) {
			System.out.println("���α׷��� ����");
			System.out.println("���α׷����̸� arg1 arg2");
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

// ����
// ��Ŭ�� -> Run As ->  Run Configurations -> ��� �޴��� Arguments
// -> ���� �������� �Է°� 2�� �ְ� -> Run
// ex) 100 200
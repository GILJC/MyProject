import javax.swing.*;	// JOptionPane 클래스를 사용

public class ArrayEx16 {
	public static void main(String[] args) {
		
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;			// 사용자입력을 저장할 공간
		String temp = "";		// 사용자입력을 저장할 임시공간
		int count = 0;			// 시도횟수를 세기위한 변수
		
		do {
			count++;
			temp = JOptionPane.showInputDialog("1~100사이의 숫자를 입력하세요."
					+ "끝내려면 -1을 입력하세요.");
			
			// 사용자가 취소버튼을 누르거나 -1을 입력하면 do-while문을 벗어난다.
			if(temp==null || temp.equals("-1")) break;
			
			System.out.println("입력값 : " +temp);
			
			//사용자입력을 문자열로 받아오기 때문에 int로 변환해 주어야한다.
			input = Integer.parseInt(temp);
		} while(1==1); 
	}
}

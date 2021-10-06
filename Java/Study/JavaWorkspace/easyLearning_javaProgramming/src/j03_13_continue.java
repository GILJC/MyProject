
public class j3_13_continue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue; // 짝수일 때는 아래는 다 무시하고 처음으로 돌아간다.
			System.out.print(i); // 홀수일떄만 출력 = 13579
		}
	}

}

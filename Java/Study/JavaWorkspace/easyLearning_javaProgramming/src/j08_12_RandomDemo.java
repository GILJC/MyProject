import java.util.Random;

public class j8_12_RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();
		
		for (int i = 0; i < 5; i++)
			System.out.print(r.nextInt(100) + " ");		// 0~100 ������ int Ÿ�� ������ �߻���Ų��.
	}

}

// 71 4 42 93 1  <- ��� �ٲ�

public class j9_2_UnChecked2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0, 1, 2 };
		
		System.out.println(array[3]);	// ������ ��� �������� ����� ���ܸ� �߻���Ų��.
	}

}

/*

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at j9_2_UnChecked2Demo.main(j9_2_UnChecked2Demo.java:8)


*/
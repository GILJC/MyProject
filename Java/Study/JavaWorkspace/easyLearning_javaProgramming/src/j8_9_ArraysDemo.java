import java.util.Arrays;

public class j8_9_ArraysDemo {
	public static void main(String[] args) {
		char[] a1 = {'J', 'a', 'v', 'a'};
		char[] a2 = Arrays.copyOf(a1, a1.length);	// �迭�� �����Ѵ�.
		System.out.println(a2);		// Java
		
		String[] sa = {"����ũ", "����", "����", "�ٳ���" };		// ����ũ ���� ���� �ٳ���
		print(sa);
				
		Arrays.sort(sa);	// �迭�� ���Ҹ� �����Ѵ�.
		print(sa);		// ���� �ٳ��� ���� ����ũ
		
		System.out.println(Arrays.binarySearch(sa, "����"));		// 2
		
		Arrays.fill(sa,  2, 4, "��Ÿ");
		print(sa);		// ���� �ٳ��� ��Ÿ ��Ÿ 
	}
	
	static void print(Object[] oa) {
		for (Object o : oa)
			System.out.print(o + " ");
		System.out.println();
	}

}

/*
Java
����ũ ���� ���� �ٳ��� 
���� �ٳ��� ���� ����ũ 
2
���� �ٳ��� ��Ÿ ��Ÿ 
*/

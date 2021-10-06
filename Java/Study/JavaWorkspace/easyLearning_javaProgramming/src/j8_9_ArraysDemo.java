import java.util.Arrays;

public class j8_9_ArraysDemo {
	public static void main(String[] args) {
		char[] a1 = {'J', 'a', 'v', 'a'};
		char[] a2 = Arrays.copyOf(a1, a1.length);	// 배열을 복사한다.
		System.out.println(a2);		// Java
		
		String[] sa = {"케이크", "애플", "도넛", "바나나" };		// 케이크 애플 도넛 바나나
		print(sa);
				
		Arrays.sort(sa);	// 배열의 원소를 정렬한다.
		print(sa);		// 도넛 바나나 애플 케이크
		
		System.out.println(Arrays.binarySearch(sa, "애플"));		// 2
		
		Arrays.fill(sa,  2, 4, "기타");
		print(sa);		// 도넛 바나나 기타 기타 
	}
	
	static void print(Object[] oa) {
		for (Object o : oa)
			System.out.print(o + " ");
		System.out.println();
	}

}

/*
Java
케이크 애플 도넛 바나나 
도넛 바나나 애플 케이크 
2
도넛 바나나 기타 기타 
*/

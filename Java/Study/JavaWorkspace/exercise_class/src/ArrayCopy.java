
public class ArrayCopy {

	public static void main(String[] args) {
		int[] number = {1,2,3,4,5};
		int[] newNumber = new int[10];
		
		for(int i=0; i<number.length; i++) {
			newNumber[i] = number[i];	//  �迭 number�� ���� newNumber�� ����
			
			System.out.print(newNumber[i]);	// 12345
		}
		System.out.println();
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[10];
		
		System.arraycopy(arr1,  0,  arr2,  0, arr1.length);
					//    arr1[0] ���� arr2[0] ���� arr1.length���� �����͸� ����
		for(int i=0; i<arr2.length; i++)
			System.out.print(arr2[i]);	// 1234500000
	}
}

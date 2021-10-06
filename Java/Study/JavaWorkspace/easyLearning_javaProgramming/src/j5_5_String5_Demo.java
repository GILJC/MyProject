
public class j5_5_String5_Demo {

	public static void main(String[] args) {
		String version = String.format("%sm %d", "JDK", 14);
		System.out.println(version);

		String fruits = String.join(", ", "apple", "banana", "cherry", "durioan");
		System.out.println(fruits);

		String pi = String.valueOf(3.14);
		System.out.println(pi);
	}

}

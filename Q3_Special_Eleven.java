
public class Q3_Special_Eleven {

	public static void main(String[] args) {

		// Invoking method

		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
	}

	public static void specialEleven(int number) {

		// Check if number is a special 11 or not
		if (number % 11 == 0 || number % 11 == 1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}

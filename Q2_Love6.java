
public class Q2_Love6 {

	public static void main(String[] args) {

		love6(6, 4);
		love6(4, 5);
		love6(1, 5);
		love6(12, 6);
	}

	public static void love6(int num1, int num2) {
		
		int sum = num1 + num2;
		int dif = num1 - num2;

		if (num1 == 6 || num2 == 6 || sum == 6 || dif == 6) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}

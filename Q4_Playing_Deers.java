
public class Q4_Playing_Deers {

	public static void main(String[] args) {

		deerPlay(60, false);	// invoke method
	}

	public static void deerPlay(int temperature, boolean isSumer) {

		// chek if it's summer
		if (isSumer) {
			if (temperature >= 60 && temperature <= 100) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		} else {
			if (temperature >= 60 && temperature <= 90) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
	}

}

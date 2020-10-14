
public class Q1_StringTimes {

	public static void main(String[] args) {
		
		stringTimes("Hi", 2);   // Invoking method with the arguments
	}
	public static void stringTimes(String word, int number) {
		
		for(int i=1 ; i<=number ; i++) {    // How many times the word "Hi" is displayed
			System.out.print(word);
		}
	}
}

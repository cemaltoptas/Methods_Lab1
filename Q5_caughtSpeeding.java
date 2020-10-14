
public class Q5_caughtSpeeding {

	public static void main(String[] args) {

		caughtSpeeding(70, true);
		caughtSpeeding(65, false);
		caughtSpeeding(50, true);
	}

	public static void caughtSpeeding(int speed, boolean birth_Day) {
		// check birthday . if it's then speed can be 5 higher in all cases
		if (birth_Day) { 
			if (speed >= 86) {
				System.out.println("2");
			} else if (speed >= 66 && speed <= 85) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
			// if not check regular conditions
		} else {
			if (speed >= 81) {
				System.out.println("2");
			} else if (speed >= 61 && speed <= 80) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

}

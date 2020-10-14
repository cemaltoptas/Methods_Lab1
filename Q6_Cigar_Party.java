
public class Q6_Cigar_Party {

	public static void main(String[] args) {
		
		//invoke method
		cigarParty(70, false);
	}
	public static void cigarParty(int cigar, boolean is_Weekend) {
   
		 // check if it's weekend. if yes there is no upper bound on the number of cigars.
		if (is_Weekend) {
			if (cigar >= 40) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			// check if it's not weekend
		} else {
			if (cigar >= 40 && cigar <= 60) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
	}

}

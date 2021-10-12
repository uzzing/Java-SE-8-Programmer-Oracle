
public class Assert4 {

	public static void main(String[] args) {
		
		int rateOfInterest = 0;
		String accountType = "LOAN";
		
		switch (accountType) {
		case "RD":
			rateOfInterest = 5;
			break;
		case "FD":
			rateOfInterest = 10;
			break;
		default:
			assert false: "No interest for this account";
		}
		System.out.print("Rate of interest" + rateOfInterest);

	}

}

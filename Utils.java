import java.util.Scanner; 


public class Utils {
	
	public static char getOperation() {
		// todo
		// use scanner
		
		Scanner scanDigit = new Scanner(System.in);
		char newDigit = scanDigit.next().charAt(0);
		return newDigit;
			
	}
	public static double getFirstNumber() {
		//todo
		//add scanner
		
		Scanner scanNumbers = new Scanner(System.in);
		double a = scanNumbers.nextDouble();
		return a;
		
	}
	public static double getSecondNumber() {
		//todo
		//add scanner
		Scanner scanNumbers = new Scanner(System.in);
		double b = scanNumbers.nextDouble();
		return b;
	}
	public static boolean getUserDecision() {
		// todo
		// scanner
		Scanner scanExit = new Scanner(System.in);
		char exitDecision = scanExit.next().charAt(0);
			if (exitDecision == 'Y' | exitDecision == 'y') {
			return true;
		} else {
			return false;
		}
	}
}

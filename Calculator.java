
import java.util.Scanner;

import operations.Operation;
import dispatchers.SimpleDispatcher;
public class Calculator {

	public static void main(String[] args) {
		boolean exit = false;
		while(!exit) {
			do {
			System.out.println("Enter Operation: ");
			char operation = Utils.getOperation();
			} while (InputCheck.CheckDigit());
			
			System.out.println("Enter two numbers");
			double a = Utils.getFirstNumber();
			double b = Utils.getSecondNumber();
			
			System.out.println("result:");
			Operation action = SimpleDispatcher.dispatch(operation, a, b);
			System.out.println(action.calculate());
			
			System.out.println("Do you want exit (Y/N)?");
			exit = Utils.getUserDecision();
		}
	}
}

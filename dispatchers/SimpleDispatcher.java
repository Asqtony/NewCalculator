package dispatchers;

import operations.*;

public class SimpleDispatcher {
	public static Operation dispatch(char requestedOperation, double a, double b) {
		Operation result;
		switch (requestedOperation) {
		case '+':
			result = new Addition(a, b);
			break;
			
		case '-':
			result = new Subtraction(a, b);
			break;
			
		case '*':
			result = new Multiplication(a, b);
			break;
			
		case '/':
			result = new Division(a, b);
			break;
			
		default:
			result = null;
			break;
		}
		
		return result;
	}
}

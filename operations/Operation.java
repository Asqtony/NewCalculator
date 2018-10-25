package operations;

public abstract class Operation {
	protected double FirstNumber;
	protected double SecondNumber;
	
	public Operation (double a, double b) {
		FirstNumber = a;
		SecondNumber = b;
	}
	
	public abstract double calculate();
}

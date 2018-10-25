package operations;

public class Multiplication extends Operation {
	
	public Multiplication (double a, double b) {
		super (a, b);
	}

	public double calculate () {
		return this.FirstNumber * this.SecondNumber;
	}
}

package operations;

public class Subtraction extends Operation {
	
	public Subtraction (double a, double b) {
		super (a, b);
	}
	
	public double calculate () {
		return this.FirstNumber - this.SecondNumber;
	}
}

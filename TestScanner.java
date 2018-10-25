
import java.util.Scanner;
public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Enter any integer number :");
Scanner scan = new Scanner(System.in);
int number = scan.nextInt();
int sum =  0;
for (int i = 1; i <= number; i++){
	sum = sum + i;
	
}
System.out.println(sum);
	}

}

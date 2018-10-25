import java.util.regex.Matcher;  
import java.util.regex.Pattern; 


public class InputCheck {

	public static boolean CheckDigit() {
		String stringDigit = String.valueOf(Utils.getOperation());
		Pattern pattern = Pattern.compile("[+-*/]{1}");
		if ((pattern.matcher(stringDigit).matches())) {
			return true;
		} else {
			return false;
		}
	}
}

import java.util.regex.Pattern;

public class UserNameImplementation implements Functions {

	public boolean checkValidFirstName(String string) {
		Pattern myPattern = Pattern.compile("^[A-Z]{1,}[a-zA-Z]{2,}");
		return myPattern.matcher(string).matches();
	}

}

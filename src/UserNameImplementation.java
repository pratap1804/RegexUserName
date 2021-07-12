import java.util.regex.Pattern;

public class UserNameImplementation implements Functions {

	public boolean checkValidFirstName(String string) {
		Pattern myPattern = Pattern.compile("^[A-Z]{1,}[a-zA-Z]{2,}");
		return myPattern.matcher(string).matches();
	}

	public boolean checkValidLastName(String string) {
		Pattern myPattern = Pattern.compile("^[A-Z]{1,}[a-zA-Z]{2,}");
		return myPattern.matcher(string).matches();
	}

	@Override
	public boolean checkValidEmail(String string) {
		Pattern myPattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		return myPattern.matcher(string).matches();
	}
}

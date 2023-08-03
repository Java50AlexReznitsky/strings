package telran.text;

public class JoinStringsOnStandard implements JoinStrings {
	
	public String join(String[] strings, String delimeter) {
		
		return String.join(delimeter, strings);
	}
}

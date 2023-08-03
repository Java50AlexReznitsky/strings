package telran.text;

public class JoinStringsOnBuilder implements JoinStrings{

	public String join(String[] strings, String delimeter) {
		String res = "";
		if (strings != null && strings.length > 0) {
			StringBuilder builder = new StringBuilder(strings[0]);
			for (int i = 1; i < strings.length; i++) {
				builder.append(delimeter).append(strings[i]);
			}
			res = builder.toString();
		}
		return res;
	}

	

	
}

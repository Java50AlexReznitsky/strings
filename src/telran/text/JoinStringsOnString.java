package telran.text;

public class JoinStringsOnString {

	String joinStringsOnString(String[] strings, String delimeter) {
		String res = "";
		if (strings != null && strings.length > 0) {
			res = strings[0];
			for (int i = 1; i < strings.length; i++) {
				res += delimeter + strings[i];
			}
		}
		return res;
	}
}

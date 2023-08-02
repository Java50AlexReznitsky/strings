package telran.text;

public class JoinStringsPerformanceAppl {

	public static void main(String[] args) {
		JoinStringsOnBuilder builder = new JoinStringsOnBuilder();
		JoinStringsOnStandard standard = new JoinStringsOnStandard();
		JoinStringsOnString string = new JoinStringsOnString();
		
		builder.joinStringsOnBuilder(args, null);
		standard.joinStringsOnStandard(args, null);
		string.joinStringsOnString(args, null);
	}

}

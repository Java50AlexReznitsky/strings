package telran.performance;
import telran.text.JoinStrings;

public class JoinStringsPerformanceTest extends PerformanceTest {
String[] strings;
String joinStrings;

	public JoinStringsPerformanceTest(String testName, int nRuns, String[] strings, String delimeter) {
		super(testName, nRuns);
	}

	@Override
	protected void runTest() {
		JoinStrings join = (strings,delimeter) -> {
			//TODO
			return "";
		};

	}

}

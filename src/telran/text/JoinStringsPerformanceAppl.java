package telran.text;

import java.util.Arrays;
import java.util.Map;

import telran.performance.JoinStringsPerformanceTest;

public class JoinStringsPerformanceAppl {
	static final int RUNS_COUNT = 1000;
	static final int STRINGS_COUNT = 1000;
	static final String[] strings;

	static {
		strings = new String[STRINGS_COUNT];
		Arrays.fill(strings, "Hello");
	}

	public static void main(String[] args) {
		Map<String, JoinStrings> map = Map.of(
				"Builder", new JoinStringsOnBuilder(),
				"Standard",new JoinStringsOnStandard(),
				 "String", new JoinStringsOnString());
		for(var entry: map.entrySet()) {
			var test = new JoinStringsPerformanceTest(entry.getKey(), RUNS_COUNT, strings, entry.getValue());
			test.run();
		}
	}
	

}

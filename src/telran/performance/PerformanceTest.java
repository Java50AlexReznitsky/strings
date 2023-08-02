package telran.performance;

public abstract class PerformanceTest {
	String testName;
	int nRuns;
	
	public PerformanceTest(String testName, int nRuns) {
		this.testName = testName;
		this.nRuns = nRuns;
	}
	public void run() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < nRuns; i++) {
			//TODO
		}
		long endTime = System.currentTimeMillis();
		long testTime = startTime - endTime;
		System.out.println("Number of runs: " + nRuns);
		System.out.println("Test name: " + testName);
		System.out.println("Overall test time: " + testTime);
	}
	protected abstract void runTest();
}

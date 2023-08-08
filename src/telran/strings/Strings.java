package telran.strings;

public class Strings {
	static public String javaVariable() {

		return "[a-zA-Z$][\\w$]*|_[\\w$]+";
	}

	static public String zero_300() {
		return "[1-9]\\d?|[1-2]\\d\\d|300|0";
	}

	static public String ipV4Octet() {

		return "(\\d\\d?|[0-1]\\d\\d|2([0-4]\\d|5[0-5]))";
	}

	static public String ipV4Address() {
		String octet = ipV4Octet();
		return String.format("%1$s(\\.%1$s){3}", octet);
	}

	public static String arithmeticExpression() {
		String operandRE = operand();
		String operatorRE = operator();
		return String.format("%1$s(%2$s%1$s)*", operandRE, operatorRE);
	}

	public static String operator() {
		return "([-+*/])";
	}

	private static String operand() {
		String numberExp = numberExp();
		String variableExp = javaVariable();
		return String.format("(\\s*\\(*\\s*)*((%s|%s))(\\s*\\)*\\s*)*", numberExp, variableExp);
	}

	private static String numberExp() {
		return "(\\d+\\.?\\d*|\\.\\d+)";
	}

	public static boolean isArithmeticExpression(String expression) {
		boolean res = false;
		if (bracketsPairsValidation(expression)) {
			res = expression.matches(arithmeticExpression());
		}
		return res;
	}

	private static boolean bracketsPairsValidation(String expression) {
		boolean res = true;
		int count = 0;
		char[] chars = expression.toCharArray();
		int index = 0;
		while (index < chars.length && res) {
			if (chars[index] == '(') {
				count++;
			} else if (chars[index] == ')') {
				count--;
				if (count < 0) {
					res = false;
				}
			}
			index++;
		}
		if (res) {
			res = count == 0;
		}
		return res;
	}
}

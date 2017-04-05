package univ.lecture;
/* 
 * 학번&이름
 * 201302392 나재성
 * 201302391 김환철
 * 201302493 최기현
 * 201302487 조민성
 */

import java.util.Stack;

/**
 * Created by tchi on 2017. 3. 19..
 * 
 * 
 */
public class Calculator {
	public int calculate(String exp) {

		return 2;
	}

	private String[] expressionTokenizer(String exp) {

	}

	private class RPN {
		// args에는 입력한 argument가 저장되어 있음.
		Stack<String> stack;

		private RPN(String[] args) {
			stack = new Stack<String>();
			// ArrayStack stack = new ArrayStack(args.length);

			for (int i = 0; i < args.length; i++) {
				String input = args[i];

				// System.out.print(input + " ");

				if (isAnOperator(input)) {
					double y = Double.parseDouble((String) stack.pop());
					double x = Double.parseDouble((String) stack.pop());
					double z = evaluate(x, y, input);
					stack.push("" + z);
				} else
					stack.push(input);
			}

		}

		private String returnResult() {
			return stack.pop();
		}

		private boolean isAnOperator(String s) {
			return (s.length() == 1 && "*/+-".indexOf(s) >= 0);
		}

		private double evaluate(double x, double y, String op) {

		}

	}

	private class Transform {

		private String[] infixToPostfix(String[] args) {

		}

		private int precedence(String token) {

		}
	}

}

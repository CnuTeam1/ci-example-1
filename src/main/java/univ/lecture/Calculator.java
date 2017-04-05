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
			// 연산자별 계산 방식 구분
			double result = 0;

			if (op.equals("+"))
				result = x + y;
			else if (op.equals("-"))
				result = x - y;
			else if (op.equals("*"))
				result = x * y;
			else
				result = x / y;
			return result;
		}
	}

	private class Transform {

		private String[] infixToPostfix(String[] args) {

		}

		private int precedence(String token) {

			// 연산자의 우선 순위를 반환하는 함수 작성
			// 연산자 우선 순위 *,/ > +,- > (,)
			
			if (token.equals("*") || token.equals("/"))
				return 4;
			else if (token.equals("+") || token.equals("-"))
				return 2;
			else if (token.equals("("))
				return 9;
			else if (token.equals(")")) {
				return 0;
			} else
				return 0; // 올바른 값이 안들어 왔을 경우 예외처리

		}
		
	}

}

package univ.lecture;
/*
 * 201302392 나재성
 * 201302391 김환철
 * 201302493 최기현
 * 201302487 조민성
 */

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

		private RPN(String[] args) {

		}

		private String returnResult() {

		}

		private boolean isAnOperator(String s) {

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

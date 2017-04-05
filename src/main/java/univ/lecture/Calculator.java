package univ.lecture;

import java.util.StringTokenizer;

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
		// 중위식을 후위식으로 변환하는 클래스를 생성해서 얻은 스트링 배열을 가지는 반환값을 매개변수로 가지는 RPN객체를 생성
		String result = new RPN(new Transform().infixToPostfix(expressionTokenizer(exp))).returnResult();
				
		return (int)Double.parseDouble(result);
	}

	private String[] expressionTokenizer(String exp) {
		String[] stringExpToStringArrayExp;
		int count=0;
		StringTokenizer token = new StringTokenizer(exp, "*/+-()", true);
		stringExpToStringArrayExp = new String[token.countTokens()];
		while(token.hasMoreTokens()){
			String nextToken=token.nextToken();
			stringExpToStringArrayExp[count]=nextToken;
			count++;
		}
		


		return stringExpToStringArrayExp;
	}


	private class RPN {

		private RPN(String[] args) {

		}
		private String returnResult(){
		
		}
		private boolean isAnOperator(String s) {

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

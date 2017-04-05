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

		return 2;
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

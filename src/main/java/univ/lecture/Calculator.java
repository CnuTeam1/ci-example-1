package univ.lecture;
/*
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
			private Stack<String> stack;
			// private ArrayStack stack;

			private String[] infixToPostfix(String[] args) {
				// 중위식을 후위식으로 변환한 결과를 String 배열로 반환하는 코드를 작성하고,
				// 마지막에 변환된 후위식을 출력함.
				stack = new Stack<String>();
				// stack = new ArrayStack(args.length);
				int count = 0;
				int size = 0;

				// *************** 스트링 배열의 크기를 찾기위한 코드 **************************
				for (int i = 0; i < args.length; i++) {
					if ("()".indexOf(args[i]) >= 0) {
						size++;
					}
				}
				size = args.length - size;
				String[] a = new String[size];
				// ***********************************************************
	
		}

		private int precedence(String token) {
		
		}
	}

}

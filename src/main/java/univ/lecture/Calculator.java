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

		private String returnResult() {

		}

		private boolean isAnOperator(String s) {

		}

		private double evaluate(double x, double y, String op) {

		}

	}

	private class Transform {
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
			// 후위식으로 변환하기 위한 코드
			for (int i = 0; i < args.length; i++) {
				if (args[i].length() == 1 && "*/+-()".indexOf(args[i]) >= 0) {
					// args[i]의 길이가 1이고, 연산자(A, S, M, D, (, ))에 해당하는 문자가
					// args[i]일 경우
					if (stack.isEmpty()) {
						stack.push(args[i]);// 스택이 비었을땐, push
					} else if (stack.peek().equals("(") || precedence(args[i]) > (precedence((String) stack.peek()))) {
						// 스택안의 연산자가 "("일 경우나 받아온 연산자(args[i])의 우선순위가 스택안의 연산자의
						// 우선순위보다 클 경우, push
						stack.push(args[i]);
					} else {
						while (!(stack.isEmpty()) && (precedence(args[i]) <= (precedence((String) stack.peek())))) {
							// 스택이 비어있지 않고, 받아온 연산자(args[i])의 우선순위가 스택안의 연산자의
							// 우선순위와 같거나 작을 경우 반복문 수행
							if (!(stack.peek().equals("("))) {
								// 스택의 top 값이 "(" 가 아닐 경우만 아래의 코드를 수행
								a[count] = (String) stack.pop();// 받아온
																// 연산자(args[i])의
																// 우선순위가 스택안의
																// 연산자의 우선순위와
																// 같거나 작을 경우 pop
								count++;
							} else {
								stack.pop();// 스택의 top 값이"("일 경우 pop
								break;
							}
						}
						if (precedence(args[i]) != 0) {//
							stack.push(args[i]);
							// pop을 다하고 난 뒤, args[i]의 값이 ")"인 경우를 빼고 받아온 연산자를
							// 스택에 push
						}
					}

				} else {
					// 피연산자는 스트링 배열에 저장
					a[count] = args[i];
					count++;

				}
			}
			while (!(stack.isEmpty())) {
				if (stack.peek() != "(") {
					// 받아올 값이 더이상 없는 경우, 스택이 비어질 때까지 pop해서 스트링 배열에 저장
					a[count] = (String) stack.pop();
					count++;
				}
			}
			

			return a;

		}

		private int precedence(String token) {

		}
	}

}

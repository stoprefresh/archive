import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double someNum, someNum2, solution;
		String stringFunc;

		System.out.print("Welcome to Calculator!\tWhat is the first number? ");
		someNum = input.nextDouble();

		System.out.print("\nWhat is the second number? ");
		someNum2 = input.nextDouble();

		System.out.println("Do you want to add, subtract, multiply, or divide? ");
		stringFunc = input.next();

		if (stringFunc.equals("add") || stringFunc.equals("+") || stringFunc.equals("plus")) {
			solution = someNum + someNum2;
			System.out.println(someNum + " + " + someNum2 + " equals " + solution);
		} else if (stringFunc.equals("subtract") || stringFunc.equals("-") || stringFunc.equals("minus")) {
			solution = someNum - someNum2;
			System.out.println(someNum + " - " + someNum2 + " equals " + solution);
		} else if (stringFunc.equals("multiply") || stringFunc.equals("*") || stringFunc.equals("times")) {
			solution = someNum * someNum2;
			System.out.println(someNum + " * " + someNum2 + " equals " + solution);
		} else if (stringFunc.equals("divide") || stringFunc.equals("/") || stringFunc.equals("division")) {
			solution = someNum / someNum2;
			System.out.println(someNum + " / " + someNum2 + " equals " + solution);
		} else {
			System.out.println("ERROR!");
		}
		input.close();
	}

}

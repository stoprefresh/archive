package solutions;

import java.util.Scanner;

public class CalculatorSwitch {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Calculator!");
    boolean keepGoing = true;
    do {
      System.out.print("Enter a number: ");
      double num1 = input.nextDouble();
      System.out.print("Enter another number: ");
      double num2 = input.nextDouble();
      System.out.print("What calculation do you want to do? ");
      String op = input.next();

      double result;
      switch (op) {
        case "+":
        case "add":
        case "plus":
          result = num1 + num2;
          System.out.println(num1 + " + " + num2 + " = " + result);
          break;
        case "-":
        case "subtract":
        case "minus":
        case "less":
          result = num1 - num2;
          System.out.println(num1 + " - " + num2 + " = " + result);
          break;
        case "*":
        case "multiply":
        case "times":
          result = num1 * num2;
          System.out.println(num1 + " * " + num2 + " = " + result);
          break;
        case "/":
        case "divide":
        case "over":
          result = num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + result);
          break;
        case "%":
        case "mod":
        case "modulo":
          result = num1 % num2;
          System.out.println(num1 + " % " + num2 + " = " + result);
          break;
        case "QUIT":
        case "EXIT":
          System.out.println("Exiting.");
          keepGoing = false;
          break;
        default:
          System.out.println("Operation not valid.");
      }
    } while (keepGoing);

    input.close();
  }

}

import java.util.Scanner;

public class ThreeVariables {
  public static void main(String[] args) {
    String deptCode;
    double salary;
    int empId;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter a Department code: ");
    deptCode = keyboard.next();

    System.out.println("Please enter your salary: ");
    salary = keyboard.nextDouble();

    System.out.println("Please enter your Employee ID: ");
    empId = keyboard.nextInt();

    System.out.println("Dept. Code:" + deptCode + " Salary:" + salary + " Employee ID:" + empId);

    System.out.println(deptCode + ":Dept. Code\t" + salary + ":Salary\t" + empId + ":Employee ID\t");

    System.out.println(deptCode + ":Dept. Code\n" + salary + ":Salary\n" + empId + ":Employee Id\n");


  }
}

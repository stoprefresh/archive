import java.util.Scanner;

public class FiveIntegers {
  public static void main(String[] args) {
    int int1, int2, int3, int4, int5;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Input five integers!");
    int1 = scanner.nextInt();
    int2 = scanner.nextInt();
    int3 = scanner.nextInt();
    int4 = scanner.nextInt();
    int5 = scanner.nextInt();

    System.out.print("Int 1:\t" + int1 + "\nInt 2:\t" + int2 + "\nInt 3:\t" + int3 + "\nInt 4:\t" + int4 + "\nInt 5:\t" + int5 + "\n");
  }
}

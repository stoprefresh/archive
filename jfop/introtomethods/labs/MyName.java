public class MyName {
  public static void main(String[] args) {

    firstName();
    space();
    lastName();
    fullName();
  }

  public static void firstName() {
    System.out.print("Miguel");
  }

  public static void lastName() {
    System.out.print("Marsiglia");
    System.out.println();
  }

  public static void space() {
    System.out.print(" ");
  }

  public static void fullName() {
    firstName();
    space();
    lastName();
  }
}

package com.skilldistillery.exceptions.solutions;

public class ExceptionsLab {

  public static void main( String[] args ) throws Exception {
    System.out.println("main() start.");
    ExceptionsLab lab = new ExceptionsLab();
    lab.run(); // Since run now throws Exception, main must handle or declare.
    System.out.println("main() end.");
  }

  private void run() throws Exception {
    System.out.println("run() start.");
    method1(); // Since method1 now throws Exception, we must handle or declare
    System.out.println("run() end.");
  }

  public void method1() throws Exception {
    System.out.println("method1() start.");
    // Uncomment:
    method2();  // method2 throws a checked exception we must handle or declare.
    System.out.println("method1() end.");
  }

  private void method2() throws Exception {
    System.out.println("method2() start.");
    boolean b = true;
    if ( b ) {
      Exception ex = new Exception("method2 Exception.");
      throw ex;
    }
    System.out.println("method2() end.");
  }

}

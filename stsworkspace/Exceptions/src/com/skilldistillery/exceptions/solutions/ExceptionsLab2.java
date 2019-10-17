package com.skilldistillery.exceptions.solutions;

public class ExceptionsLab2 {

  // main also no longer needs a throws declaration
  // main and run now complete normally.
  // Execution of method1 and method2 were terminated by the exception.
  public static void main( String[] args ) {
    System.out.println("main() start.");
    ExceptionsLab2 lab = new ExceptionsLab2();
    lab.run();
    System.out.println("main() end.");
  }

  // With method1's declared exception caught, we no longer need a throws declaration.
  private void run() {
    System.out.println("run() start.");
    try {
      method1();
    }
    catch (Exception e) {
      System.out.println("Exception caught in run().");
    } 
    System.out.println("run() end.");
  }

  public void method1() throws Exception {
    System.out.println("method1() start.");
    method2();
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

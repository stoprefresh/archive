package com.skilldistillery.exceptions.solutions;

public class ExceptionsLab3 {

  public static void main( String[] args ) {
    System.out.println("main() start.");
    ExceptionsLab3 lab = new ExceptionsLab3();
    lab.run();
    System.out.println("main() end.");
  }

  private void run() {
    System.out.println("run() start.");
    try {
      method1();
    }
    catch (Exception e) {
      System.out.println("Exception caught in run().");
      System.out.println(e.getMessage());
      System.out.println(e);  // println calls e.toString()
      e.printStackTrace();
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

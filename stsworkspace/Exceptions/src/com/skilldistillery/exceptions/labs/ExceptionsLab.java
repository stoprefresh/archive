package com.skilldistillery.exceptions.labs;

public class ExceptionsLab {

	public static void main(String[] args) {
		System.out.println("main() start.");

		ExceptionsLab lab = new ExceptionsLab();

		lab.run();

		System.out.println("main() end.");
	}

	private void run()  {
		System.out.println("run() start.");
		method1();
		System.out.println("run() end.");
	}

	public void method1() {
		System.out.println("method1() start.");
		// Uncomment:

		try {
			method2();
		} catch (Exception ex) {

			System.err.println(ex);
		}

		System.out.println("method1() end.");
	}

	private void method2() throws Exception {
		System.out.println("method2() start.");
		boolean b = true;
		if (b) {
			Exception ex = new Exception("method2 Exception. Aborted.");
			throw ex;
		}
		System.out.println("method2() end.");
	}
}

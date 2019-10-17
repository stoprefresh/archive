package com.skilldistillery.encapsulation.drills;

public class BankApp {

  public static void main(String[] args) {
    BankApp b = new BankApp();

    
    
    b.run();
  }
  
  void run(){
    Account acc1 = new Account("ACC-10001");
    Account acc2 = new Account(9053.23, "ACC-10002", "Fred");
    
    printAccountData(acc1);
    printAccountData(acc2); 
  }
  
  void printAccountData(Account account) {
	 
	  
    System.out.println(account.getAccountId() + " balance: " 
    		+ account.getBalance() + " Name: " + account.getName());
  }

}

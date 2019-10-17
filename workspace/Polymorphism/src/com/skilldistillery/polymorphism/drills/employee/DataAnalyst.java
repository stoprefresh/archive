package com.skilldistillery.polymorphism.drills.employee;

public class DataAnalyst extends Employee {
  private String securityClearance;
  
  public DataAnalyst() {
  }
  
  public DataAnalyst(String securityClearance, String firstName, String lastName, int age, String title, double salary) {
    super(firstName, lastName, age, title, salary);
    
  }

  public String getSecurityClearance() {
    return securityClearance;
  }

  public void setSecurityClearance(String securityClearance) {
    this.securityClearance = securityClearance;
  }
  
  public String getInfo() {
    return super.getInfo() + " " + securityClearance;
  }
  
  // DataAnalyst behavior...
  public String analyzeData(String data) {
    return data != null ? data.toUpperCase() : "Data is null";
  }
  
  
  public void executeJob(String string) {
	  System.out.println(analyzeData(string));
  }
}

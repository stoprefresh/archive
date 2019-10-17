package com.skilldistillery.polymorphism.drills.employee;

public class EmployeePrintingApp {

  public static void main(String[] args) {
    EmployeePrintingApp epa = new EmployeePrintingApp();
    
    epa.run();
    
  }
  
  private void run() {
	  
	 Employee emp[] = new Employee[3];
	 
	 DataAnalyst da = new DataAnalyst("Secret", "Dave", "Davery", 25, "Data-Analyst", 54.50);
	 emp[0] = da;
	 
	 emp[1] = new SoftwareDeveloper("Fred", "Freddy", 23, "Pooper", 89.90);
	 
	 emp[2] = new DatabaseAdmin("Glen", "Nobody", 50, "DBA", 60.25);
	 
	 
	 for(int i = 0; i < emp.length; i++) {
		 System.out.println(emp[i].getInfo());
		 emp[i].executeJob("One\n");
		 System.out.println(); 
	 }
	 
	 
	 
    // Create an array of type Employee with space for 3 Employees
    
    // Create a DataAnalyst, SoftwareDeveloper, and DatabaseAdmin
    // using the multi-arg constructors for each, and assign each to the array.
    
    // Call processEmployees and pass the Employee array reference.
  }
//  public void executeJob(String string) {
//	  System.out.println();
//  }
  
  
  // Add a method printEmployeeNameAndTitle that takes an Employee and prints
  // name - title
  // to the screen.
  
  public void processEmployees(Employee[] employees) {
    // loop through the Employee array and call printEmployeeNameAndTitle
    // for each Employee
	  for (int i = 0; i < employees.length; i++) {
			 
		 }
  }

}

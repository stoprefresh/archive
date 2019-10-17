package com.skilldistillery.polymorphism.drills.employee;

public class Upcasting {

  public static void main(String[] args) {
    Employee emp1 = new Employee("John", "Doe", 45, "This person's title", 33333.50);
    
    // Implicit upcast
    Person person1 = emp1;
    
    // Explicit (and pointless) upcast
    Person person2 = (Person) emp1;

    // Call getName() on Employee reference emp1 and print the results to the screen.
    emp1.getName();
    // Call getTitle() on Employee reference emp1 and print the results to the screen.
    emp1.getTitle();
    // Now call getName() on Person reference person1 and print the results to the screen.
    person1.getName();
    // Try to call getTitle() on Person reference person1. What does the compiler report?
    System.out.println(((Employee) person1).getTitle());
    
    Employee e = (Employee)person1;
    e.getAge();
    e.getTitle();
    
    
    Person p3 = new Person();
    if(p3 instanceof Employee) {
    Employee e2 = (Employee) p3;
    e2.getSalary();
    }
    else {
    	System.out.println("This is not an instance of an employee...");
    }
    
    if(person1 instanceof Employee) { // checks to see if the instance of person1 is an instance of employee
    								// to ensure that the code will not run into a RTE.
//    	System.out.println("person1 is for real an Employee");
//    	System.out.println(((Employee)person1).getTitle() + " is a joke");
    	String theTitle = ((Employee)person1).getTitle() + " is a joke";
    	System.out.println(theTitle);
    }
  }
}

package com.skilldistillery.inheritance.solutions;

public class Person {
  protected String firstName;
  protected String lastName;
  protected int age;
  
  public Person() {
  }
  
  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }
  
  public String getInfo() {
    return firstName + " " + lastName + " " + age;
  }
  
  public String getName() {
    return firstName + " " + lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

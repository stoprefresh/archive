package com.skilldistillery.equalsandhashcode.drills;

public class NamedObject extends Object { // "extends Object" not actually needed

  private String name;

  public NamedObject(String name) {
    this.name = name;
  }
  
  public boolean equals(Object o) {
	  // "this" check
	  if(this == o) {
		  return true;
	  }
	  // null check
	  if(o == null) {
		  return false;
	  }
	  // class check
	  if(!(o instanceof NamedObject)) {
		  return false;
	  }
	  
	  NamedObject other = (NamedObject) o;
	  String otherName = other.name;
	  
	  return this.name.equals(otherName);
	  
	  
	  
	  
  }
  
  // TODO Implement an equals method that determines if the passed Object is
  // a NamedObject, and if so compares its "name" field to the current object's.

}

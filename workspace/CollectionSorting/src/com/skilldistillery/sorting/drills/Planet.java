package com.skilldistillery.sorting.drills;

public class Planet implements Comparable<Planet>{
  private String name;
  private long orbit;
  private int diameter;

  public Planet(String name, long orbit, int diameter) {
    this.name = name;
    this.orbit = orbit;
    this.diameter = diameter;
  }
  
  @Override
  public int compareTo(Planet o) {
//	  In compareTo, use an if-else if-else to return:
//		  -1 if this planet's orbit is less than that of the planet that was passed to compareTo.
//		  1 if this planet's orbit is greater than the other's
//		  0 otherwise.
	  if(this.orbit > o.orbit) {
		  return 1;
	  }
	  if(this.orbit < o.orbit) {
		  return -1;
	  }
	  if(this.orbit == o.orbit) {
		  return 0;
	  }
	  
	  return 0;
  }

  public String getName() {
    return name;
  }

  public long getOrbit() {
    return orbit;
  }

  public int getDiameter() {
    return diameter;
  }

  @Override
  public String toString() {
    return name + "\t\t" + orbit;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + diameter;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + (int) (orbit ^ (orbit >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Planet other = (Planet) obj;
    if (diameter != other.diameter)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    }
    else if (!name.equals(other.name))
      return false;
    if (orbit != other.orbit)
      return false;
    return true;
  }
  

}
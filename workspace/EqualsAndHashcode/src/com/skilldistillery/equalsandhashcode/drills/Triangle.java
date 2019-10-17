package com.skilldistillery.equalsandhashcode.drills;

public class Triangle {
	private int base;
	private int height;

	public Triangle(int b, int h) {
		this.base = b;
		this.height = h;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + base;
		result = prime * result + height;
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
		Triangle other = (Triangle) obj;
		if (base != other.base)
			return false;
		if (height != other.height)
			return false;
		return true;
	}

}

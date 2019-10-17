package com.skilldistillery.equalsandhashcode.drills;

public class ColorTriangle extends Triangle {
  RGBColor color;
  
  public ColorTriangle(int b, int h, RGBColor c) {
    super(b, h);
    this.color = c;
  }

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	ColorTriangle other = (ColorTriangle) obj;
	if (color == null) {
		if (other.color != null)
			return false;
	} else if (!color.equals(other.color))
		return false;
	return true;
}

}

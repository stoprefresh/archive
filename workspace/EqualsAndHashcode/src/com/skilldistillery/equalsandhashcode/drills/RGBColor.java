package com.skilldistillery.equalsandhashcode.drills;

public class RGBColor {
	private int redValue;
	private int greenValue;
	private int blueValue;

	public RGBColor(int r, int g, int b) {
		redValue = r;
		greenValue = g;
		blueValue = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + blueValue;
		result = prime * result + greenValue;
		result = prime * result + redValue;
		return result;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (!(o instanceof RGBColor)) {
			return false;
		}

		RGBColor other = (RGBColor) o;

		if (this.redValue == other.redValue && this.blueValue == other.blueValue
				&& this.greenValue == other.greenValue) {
			return true;
		}
		return false;
	}

}

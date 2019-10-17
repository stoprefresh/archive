package com.skilldistillery.encapsulation.drills;

public class Student {

	int[] scores;
	private double average;

	public int[] getScores() {

		return scores;
	}

	public double getAverage(double average) {
		this.average = average;
		return this.average;
	}

	private void computeAverage() {
		// valid code to compute average
		// average = update average value
	}

	public Student() {
		computeAverage();
	}
}

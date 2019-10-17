package com.skilldistillery.history;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class President implements Comparable<President> {
	private int termNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private int electionsWon;
	private String whyLeftOffice;
	private String party;
	private LocalDate beganTerm, endTerm;
	private Period lengthOfTerm;
	
	public President(int termNumber, String firstName, String middleName, String lastName, LocalDate beganTerm, LocalDate endTerm, int electionsWon,
			String reasonLeftOffice, String party) {
		super();
		this.termNumber = termNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.electionsWon = electionsWon;
		this.whyLeftOffice = reasonLeftOffice;
		this.beganTerm = beganTerm;
		this.endTerm = endTerm;
		this.party = party;
	}

	public President(int termNumber, String firstName, String middleName, String lastName, LocalDate beganTerm, int electionsWon,
			String reasonLeftOffice, String party) {
		super();
		this.termNumber = termNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.electionsWon = electionsWon;
		this.whyLeftOffice = reasonLeftOffice;
		this.party = party;
	}

	public LocalDate getBeganTerm() {
		return beganTerm;
	}

	public void setBeganTerm(LocalDate beganTerm) {
		this.beganTerm = beganTerm;
	}

	public LocalDate getEndTerm() {
		return endTerm;
	}

	public void setEndTerm(LocalDate endTerm) {
		this.endTerm = endTerm;
	}

	public int getTermNumber() {
		return termNumber;
	}

	public void setTermNumber(int termNumber) {
		this.termNumber = termNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getElectionsWon() {
		return electionsWon;
	}

	public void setElectionsWon(int electionsWon) {
		this.electionsWon = electionsWon;
	}

	public String getWhyLeftOffice() {
		return whyLeftOffice;
	}

	public void setWhyLeftOffice(String reasonLeftOffice) {
		this.whyLeftOffice = reasonLeftOffice;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public Period getLengthOfTerm() {
		if(endTerm != null) {
			return lengthOfTerm = Period.between(beganTerm, endTerm);
		}
		else {
			return lengthOfTerm = Period.between(beganTerm, LocalDate.now());
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(termNumber + ": ");
		builder.append(firstName + " ");
		if (middleName.length() > 0) {
			builder.append(middleName + " ");
		}
		builder.append(lastName + " ");
		builder.append(beganTerm + " ");
		if (endTerm != null) {
			builder.append(endTerm + " ");
		}
		builder.append(" (" + party + ")");
		builder.append(", electionsWon=");
		builder.append(electionsWon);
		builder.append(", whyLeftOffice=");
		builder.append(whyLeftOffice);
		builder.append(", timeInOffice=");
		builder.append(getLengthOfTerm());
		return builder.toString();
	}

	@Override
	public int compareTo(President other) {
		if (this.termNumber > other.termNumber) {
			return 1;
		} else if (this.termNumber < other.termNumber) {
			return -1;
		}
		return 0;
	}
}
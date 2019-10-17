package com.skilldistillery.presidents.data;

import java.util.Date;

public class President {

	
	private String firstName;
	private String middleName;
	private String lastName;
	private Date inaugurationDate;
	private Date dateLeftOffice;
	private Integer electionsWon;
	private String reasonLeftOffice;
	private String party;
	private int termNumber;

	public President() {
		super();
	}

	public President(int termNumber, String firstName, String middleName, String lastName, Date inaugurationDate,
			Date dateLeftOffice, Integer electionsWon, String reasonLeftOffice, String party) {
		super();
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.inaugurationDate = inaugurationDate;
		this.dateLeftOffice = dateLeftOffice;
		this.electionsWon = electionsWon;
		this.reasonLeftOffice = reasonLeftOffice;
		this.party = party;
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

	public Date getInaugurationDate() {
		return inaugurationDate;
	}

	public void setInaugurationDate(Date inaugurationDate) {
		this.inaugurationDate = inaugurationDate;
	}

	public Date getDateLeftOffice() {
		return dateLeftOffice;
	}

	public void setDateLeftOffice(Date dateLeftOffice) {
		this.dateLeftOffice = dateLeftOffice;
	}

	public Integer getElectionsWon() {
		return electionsWon;
	}

	public void setElectionsWon(Integer electionsWon) {
		this.electionsWon = electionsWon;
	}

	public String getReasonLeftOffice() {
		return reasonLeftOffice;
	}

	public void setReasonLeftOffice(String reasonLeftOffice) {
		this.reasonLeftOffice = reasonLeftOffice;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("President [id=");
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", inaugurationDate=");
		builder.append(inaugurationDate);
		builder.append(", dateLeftOffice=");
		builder.append(dateLeftOffice);
		builder.append(", electionsWon=");
		builder.append(electionsWon);
		builder.append(", reasonLeftOffice=");
		builder.append(reasonLeftOffice);
		builder.append(", party=");
		builder.append(party);
		builder.append(", termNumber=");
		builder.append(termNumber);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateLeftOffice == null) ? 0 : dateLeftOffice.hashCode());
		result = prime * result + ((electionsWon == null) ? 0 : electionsWon.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((inaugurationDate == null) ? 0 : inaugurationDate.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((party == null) ? 0 : party.hashCode());
		result = prime * result + ((reasonLeftOffice == null) ? 0 : reasonLeftOffice.hashCode());
		result = prime * result + termNumber;
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
		President other = (President) obj;
		if (dateLeftOffice == null) {
			if (other.dateLeftOffice != null)
				return false;
		} else if (!dateLeftOffice.equals(other.dateLeftOffice))
			return false;
		if (electionsWon == null) {
			if (other.electionsWon != null)
				return false;
		} else if (!electionsWon.equals(other.electionsWon))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (inaugurationDate == null) {
			if (other.inaugurationDate != null)
				return false;
		} else if (!inaugurationDate.equals(other.inaugurationDate))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (party == null) {
			if (other.party != null)
				return false;
		} else if (!party.equals(other.party))
			return false;
		if (reasonLeftOffice == null) {
			if (other.reasonLeftOffice != null)
				return false;
		} else if (!reasonLeftOffice.equals(other.reasonLeftOffice))
			return false;
		if (termNumber != other.termNumber)
			return false;
		return true;
	}
}

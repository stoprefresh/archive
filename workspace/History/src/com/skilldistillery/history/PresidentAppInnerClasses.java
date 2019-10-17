package com.skilldistillery.history;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PresidentAppInnerClasses {
	private static final String fileName = "resources" + File.separator + "presidents.tsv";
	private List<President> presidents = new ArrayList<>();
	private static final String outputFile = "resources" + File.separator + "PresidentsOutput.tsv";

	public class PresidentNameMatcher implements PresidentMatcher {
		@Override
		public boolean matches(President pres, String string) {
			return pres.getFirstName().equalsIgnoreCase(string);
		}
	}

	public static void main(String[] args) {
		PresidentAppInnerClasses app = new PresidentAppInnerClasses();
		app.start();

	}

	public void start() {

		class PresidentWhyLeftMatcher implements PresidentMatcher {
			@Override
			public boolean matches(President pres, String string) {
				return pres.getWhyLeftOffice().equalsIgnoreCase(string);
			}
		}

		this.printPresidents(this.getPresidents());
		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("**************     By Party and Term    ***************");
		System.out.println("*******************************************************");
		//
		List<President> byPartAndTerm = sortedByPartAndTermNumber(getPresidents());
		printPresidents(byPartAndTerm);
		System.out.println("*******************************************************");
		System.out.println();

		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("**************         By Whig          ***************");
		System.out.println("*******************************************************");

		
		printPresidents(filter("Whig", new PresidentPartyMatcher()));
		
		
		System.out.println("*******************************************************");
		System.out.println();

		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("**************      By First Name       ***************");
		System.out.println("*******************************************************");

		printPresidents(filter("William", new PresidentNameMatcher()));

		System.out.println("*******************************************************");
		System.out.println();

		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("**************      Why Left Office     ***************");
		System.out.println("*******************************************************");

		List<President> whyLeft = filter("Term Ended", new PresidentWhyLeftMatcher());
		printPresidents(whyLeft);
		System.out.println("*******************************************************");
		System.out.println();

		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("**************    Last Name Start W/ C  ***************");
		System.out.println("*******************************************************");

		List<President> lastNameC = filter("C", new PresidentMatcher() {

			public boolean matches(President pres, String string) {
				return pres.getLastName().startsWith("C");
			}
		});
		printPresidents(lastNameC);
		
		System.out.println("*******************************************************");
		System.out.println();

		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("**************    Party Contains Demo   ***************");
		System.out.println("*******************************************************");

		
		printPresidents(filter("Democrat", new PresidentMatcher() {

			public boolean matches(President pres, String string) {
				return pres.getParty().contains(string);
			}
		}));
		
		System.out.println("*******************************************************");
		System.out.println();

		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("**************      Died in Office      ***************");
		System.out.println("*******************************************************");

		List<President> diedIn = filter("died in office", new PresidentMatcher() {

			public boolean matches(President pres, String string) {
				return pres.getWhyLeftOffice().equalsIgnoreCase(string);
			}
		});
		printPresidents(diedIn);
		
		System.out.println("*******************************************************");
		System.out.println();

		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("**************      Won only 1          ***************");
		System.out.println("*******************************************************");

		printPresidents(filter("1", new PresidentMatcher() {

			public boolean matches(President pres, String string) {

				return Integer.toString(pres.getElectionsWon()).contains(string);
			}
		}));

		System.out.println("*******************************************************");
		System.out.println();

		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("**************      Won in the 19th     ***************");
		System.out.println("*******************************************************");

		
		printPresidents(filter("18", new PresidentMatcher() {

			public boolean matches(President pres, String string) {

				return Integer.toString(pres.getBeganTerm().getYear()).contains(string);
			}
		}));
		
		
		System.out.println("*******************************************************");
		System.out.println();

	}

	// Used for passing info in to sort by something.
	public List<President> filter(String string, PresidentMatcher matcher) {
		List<President> filtered = new ArrayList<>();
		for (President p : presidents) {
			if (matcher.matches(p, string)) {
				filtered.add(p);
			}
		}
		return filtered;
	}

	public void writeToFile(String outputFile) throws FileNotFoundException {

		try (PrintWriter pw = new PrintWriter(outputFile)) {
			for (President p : presidents) {
				StringBuilder sb = new StringBuilder();
				sb.append(p.getTermNumber());
				sb.append('\t');
				sb.append(p.getFirstName());
				sb.append('\t');
				sb.append(p.getMiddleName());
				sb.append('\t');
				sb.append(p.getLastName());
				sb.append('\t');
				sb.append(p.getBeganTerm());
				sb.append('\t');
				sb.append(p.getEndTerm());
				sb.append('\t');
				sb.append(p.getElectionsWon());
				sb.append('\t');
				sb.append(p.getWhyLeftOffice());
				sb.append('\t');
				sb.append(p.getParty());
				sb.append('\t');
				pw.println(sb);
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	// These methods sort by Party **********************
//	private class PresidentsComparator implements Comparator<President>{
//
//			@Override
//			public int compare(President o1, President o2) {
//				String firstVal = o1.getParty();
//			      String secondVal = o2.getParty();
//			      int retval = firstVal.compareTo(secondVal);
//			     
//			      return (retval != 0) ? retval : o2.getParty().compareTo(o1.getParty());
//			}
//	}
//	public List<President> sortedByPartAndTermNumber(List<President> presidents){
//		
//		List<President> listP = new ArrayList<President>(presidents);
//		//sort this list by something....
//		Comparator<President> compP = new PresidentsComparator();
//		Collections.sort(listP, compP);
//		
//		return listP;
//	}

//	 These Methods will sort by the reason they left office  **********************
//	public List<President> sortedByPartAndTermNumber(List<President> presidents){
//		
//	class PresidentsComparator implements Comparator<President>{
//			@Override
//			public int compare(President o1, President o2) {
//				String firstVal = o1.getWhyLeftOffice();
//			      String secondVal = o2.getWhyLeftOffice();
//			      int retval = firstVal.compareTo(secondVal);
//			     
//			      return (retval != 0) ? retval : o2.getWhyLeftOffice().compareTo(o1.getWhyLeftOffice());
//			}
//	}
//	
//		List<President> listP = new ArrayList<President>(presidents);
//		//sort this list by something....
//		Comparator<President> compP = new PresidentsComparator();
//		Collections.sort(listP, compP);
//		
//		return listP;
//	}

	// This method calls an anon comparator class for sorting by last name
	// **********************
	public List<President> sortedByPartAndTermNumber(List<President> presidents) {

		List<President> listP = new ArrayList<President>(presidents);

		Collections.sort(listP, new Comparator<President>() {

			public int compare(President o1, President o2) {
				String firstVal = o1.getLastName();
				String secondVal = o2.getLastName();
				int retval = firstVal.compareTo(secondVal);

				return (retval != 0) ? retval : o2.getLastName().compareTo(o1.getLastName());
			}
		});

		return listP;
	}

	public PresidentAppInnerClasses() {
		this.loadPresidents(fileName);
		try {
			writeToFile(outputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public List<President> getPresidents() {
		return this.presidents;
	}

	public void printPresidents(List<President> pres) {
		for (President p : pres) {
			System.out.println(p);
		}
	}

	private void loadPresidents(String fileName) {
		// File format (tab-separated):
		// # First Middle Last Inaugurated Left office Elections won Reason left office
		// Party
		// 1 George Washington July 1, 1789 March 4, 1797 2 Did not seek re-election
		// Independent

		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String record = reader.readLine(); // Read and discard header line
			while ((record = reader.readLine()) != null) {
				String[] col = record.split("\\t");

				LocalDate endTerm = null;

				int term = Integer.parseInt(col[0]);
				String fName = col[1];
				String mName = col[2];
				String lName = col[3];

				// col[4]: Date term began.
				LocalDate beganTerm = LocalDate.parse(col[4], dateFormatter);
				// col[5]: Date term ended.
				String terms = col[5];
				if (terms.length() > 0) {
					endTerm = LocalDate.parse(terms, dateFormatter);
				}
				int won = Integer.parseInt(col[6]);
				String whyLeft = col[7];
				String party = col[8];

				if (whyLeft == null) {
					President pres = new President(term, fName, mName, lName, beganTerm, won, whyLeft, party);
					presidents.add(pres);
				} else {
					President pres = new President(term, fName, mName, lName, beganTerm, endTerm, won, whyLeft, party);
					presidents.add(pres);
				}

			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(1);
		}

	}
}

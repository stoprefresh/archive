package labs;

public class SBScores {

	public static void main(String[] args) {

		String superBowlScores[][] = { { "35", "10" }, { "33", "14" }, { "16 ", "7" }, { "23", "7" }, { "16", "3" } };

		String superBowlTeams[][] = { { "Packers", "Chiefs" }, { "Packers", "Raiders" }, { "Colts", "Jets" },
				{ "Vikings", "Chiefs" }, { "Cowboys", "Colts" } };

		displayScores(superBowlScores, superBowlTeams);
		System.out.println();
		
		String something[][] = new String [3][3];
		
		something[0][1] = "X";
		
		System.out.println(something[0][1]);
		
	}

	public static void displayScores(String scores[][], String teams[][]) {
		for (int i = 0; i < scores.length; i++) {

			System.out.println(teams[i][0] + ":" + scores[i][0] + " - " + teams[i][1] + ":" + scores[i][1]);

//			for (String[] score : scores) {
//				for (String[] team : teams) {
//					for (String total : score) {
//						for (String name : team) {
//							System.out.println(name);
//						}
//					System.out.println(total);
//					System.out.println();
//				}
//				}
//			}
		}
	}
	
	
}

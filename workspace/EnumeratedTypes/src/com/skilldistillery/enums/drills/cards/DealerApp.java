package com.skilldistillery.enums.drills.cards;

import java.util.*;

public class DealerApp {

	List<Card> curHand;
	
	public static void main(String[] args) {

		DealerApp da = new DealerApp();
		da.gameStart();
		
		
	}

	public void gameStart() {
		curHand = new ArrayList<Card>(10);
		Scanner sc = new Scanner(System.in);
		int cardsToDeal;
		
		
		Deck curDeck = new Deck();
		curDeck.shuffleDeck();
		
		

	
	}
	
	
	
	
}

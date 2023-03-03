package poker;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {
	public ArrayList<PokerCard> hand;
	
	public Hand() {
		this.hand = new ArrayList<>();
	}
	
	//Adds a given Card to the hand array and also sorts it
	public void addCardToHand(PokerCard c) {
		this.hand.add(c);
	}
	
	//Out puts the contents of the hand
	@Override
	public String toString() {
		String message = "Hand:";
		
		for(int i = 0; i < this.hand.size(); i++) {
			
			String card = this.hand.get(i).toString();
			
			message += " " + card;
		}
		
		message += ", Score: " + this.getScore();
		
		return message;
	}
	
	//Gets the best score of the hand
	private String getScore() {
		
		if(checkStraight() && checkFlush()) return "Straight Flush";
		
		if(checkPairs(4)) return "Four of a Kind";
		
		if(checkFlush()) return "Flush";
		
		if(checkStraight()) return "Straight";
		
		if(checkPairs(3)) return "Three of a Kind";
		
		if(checkPairs(2)) return "Pair";
		
		return "Nothing";
	}
	
	//Checks if all cards have are in a row
	private boolean checkStraight() {
		for(int i = 0; i < this.hand.size() -1; i++) {
			
			int f = this.hand.get(i).getRank().ordinal();
			int s = this.hand.get(i +1).getRank().ordinal();
			
			if(s - f != 1) return false;
		}
		
		return true;
	}
	
	//Checks if all cards have the same suit
	private boolean checkFlush() {
		
		Suit s = this.hand.get(0).getSuit();
		
		for(int i = 0; i < this.hand.size(); i++) {
			if(s != this.hand.get(i).getSuit()) return false;
		}
		
		return true;
	}
	/*
		Checks the number of kind by counting the number alike and then comparing it
		to the given integer.
	 */
	private boolean checkPairs(int num) {
		int count = 1;
		
		for(int i = 0; i <= this.hand.size() -num; i++) {
			
			Rank r = this.hand.get(i).getRank();
			
			for(int c = i +1; c < this.hand.size(); c++) {
				
				Rank cR = this.hand.get(c).getRank();
				
				if(r == cR) count++;
			}
			
			if(count == num) return true;
			else count = 1;
		}
		
		return false;
		
	}
}

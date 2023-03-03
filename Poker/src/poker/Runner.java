package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		ArrayList<PokerCard> deck = makeDeck();
		Scanner scnr = new Scanner(System.in);
		
		String input = "";
		
		int handSize = 5;
		
		do {
			Hand currentHand = new Hand();
			
			//Shuffles deck
			deck = shuffleDeck(deck);
		
			//Adds five cards from deck to the hand
			for(int i = 0; i < handSize; i++) {
				currentHand.addCardToHand(deck.get(i));
			}
			
			//Sorts hand
			Collections.sort(currentHand.hand);
			
			System.out.println(currentHand);
			
			input = scnr.nextLine();
			System.out.println("Again? (y):");
			
		}while(input.equals("y"));
		
	}
	
	//Makes a deck of cards out of all the suits and ranks possible
	public static ArrayList<PokerCard> makeDeck(){
		ArrayList<PokerCard> deck = new ArrayList<>();
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();
		for(Suit s: suits) {
			for(Rank r: ranks) {
				deck.add(new PokerCard(s, r));
			}
		}
		
		return deck;
	}
	
	//Shuffles deck by randomly swapping all the cards
	public static ArrayList<PokerCard> shuffleDeck(ArrayList<PokerCard> deck){
		
		for(int i = 0; i < deck.size(); i++) {
			int randomIndex = (int)(Math.random() *52);
			
			PokerCard placeHolder = deck.get(i);
			deck.set(i, deck.get(randomIndex));
			deck.set(randomIndex, placeHolder);
		}
		
		return deck;
	}
}
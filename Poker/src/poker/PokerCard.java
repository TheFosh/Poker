package poker;

public class PokerCard extends Card implements Comparable<PokerCard>{

	public PokerCard(Suit suit, Rank rank) {
		super(suit, rank);
	}

	@Override
	public int compareTo(PokerCard otherCard) {
		
		Rank f = this.getRank();
		Rank o = otherCard.getRank();
		
		if(f.ordinal() > o.ordinal()) return 1;
		else if(f.ordinal() < o.ordinal()) return -1;
		else return 0;
		
	}
	
	@Override
	public String toString() {
		return this.getRank(this.getRank()) + this.getSuit(this.getSuit());
	}
	
	private String getRank(Rank r) {
		if(r.toString().equals("TWO")) return "2";
		if(r.toString().equals("THREE")) return "3";
		if(r.toString().equals("FOUR")) return "4";
		if(r.toString().equals("FIVE")) return "5";
		if(r.toString().equals("SIX")) return "6";
		if(r.toString().equals("SEVEN")) return "7";
		if(r.toString().equals("EIGHT")) return "8";
		if(r.toString().equals("NINE")) return "9";
		if(r.toString().equals("TEN")) return "10";
		
		return r.toString().substring(0, 1);
	}
	
	private String getSuit(Suit s) {
		
		if(s.toString().equals("HEARTS")) return "♥";
		if(s.toString().equals("DIAMONDS")) return "♦";
		if(s.toString().equals("CLUBS")) return "♣";
		else return "♠";
	}

}

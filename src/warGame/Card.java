package warGame;

import java.util.List;

 

public class Card {

	private int cardname;
	private int cardvalue;
	
	public static final int Spade = 0;
	public static final int Heart = 1;
	public static final int Diamond = 2;
	public static final int Club = 3;
	
	
	public static final int Jack = 11;
	public static final int Queen = 12;
	public static final int King = 13;
	public static final int Ace = 14;
	
	
	
	public Card(int cardname, int cardvalue) {
		 this.setCardname(cardname);
		 this.setCardvalue(cardvalue);
	}

	public int getCardname() {
		return cardname;
	}

	public void setCardname(int cardname) {
		this.cardname = cardname;
	}

	public int getCardvalue() {
		return cardvalue;
	}

	public void setCardvalue(int cardvalue) {
		this.cardvalue = cardvalue;
	}
	
	public String toString() {
		String s = "";
		if (cardvalue == Jack) {
			s += "Jack";
		} else if (cardvalue == Queen) {
			s += "Queen";
		} else if (cardvalue == King) {
			s += "King";
		} else if (cardvalue == Ace) {
			s += "Ace";
		} else if (cardvalue == 2) {
			s += "Two";
		} else if (cardvalue == 3) {
			s += "Three";
		} else if (cardvalue == 4) {
			s += "Four";
		} else if (cardvalue == 5) {
			s += "Five";
		} else if (cardvalue == 6 ) {
			s += "Six";
		} else if (cardvalue == 7) {
			s += "Seven";
		} else if (cardvalue == 8) {
			s += "Eight";
		} else if (cardvalue == 9) {
			s += "Nine";
		}else if (cardvalue == 10) {
			s += "Ten";
		} else {
			s += cardvalue;
		}
			
		
		if (cardname == Club) {
			s += " of Clubs";
		} else if (cardname == Diamond) {
			s += " of Diamonds";
		} else if (cardname == Spade) {
			s += " of Spades";
		} else if (cardname == Heart) {
			s += " of Hearts";
		} else if (cardname == Club) {
			s += " of Clubs";
		}
		return s;
		
	}
	
	
	 public void describe() {
		 System.out.println(this.toString() + " ");
		 
	 }
	  public int getCard() {
	 		return cardvalue + cardname;
	 	}
	}
	 
	


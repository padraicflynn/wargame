package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

 

 
 public class Deck {
	 
	
	 List<Card> cards = new ArrayList<Card>();
	 
	 public Deck() {
		  
		 for ( int n = 0; n < 4; n++) {
			 for (int v = 2; v <= 14; v++) {
				 cards.add(new Card ( n, v));
				 }
			 }
	 }
	
public List<Card> getCards() {
	return cards;
}

public void setCards(List<Card> cards) {
	this.cards = cards;
}

public Card draw() {
	if (cards.isEmpty()) {
		return null;
	} else {
		Card drawCard = cards.get(0);
		cards.remove(0);
		return drawCard;
	}
}
public void shuffle() {
	Collections.shuffle(cards);
}
 
}

 
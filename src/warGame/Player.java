package warGame;

import java.util.LinkedList;
import java.util.List;

public class Player {
	
	List<Card> hand = new LinkedList<>();
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void describe() {
		System.out.println(name + " has this in their opening hand: " );
		for (Card card : hand) {
			card.describe();
		}
		
	}

	public void draw(Deck deck) {
		for (int i = 1; 1 <= 26; i++) {
			Card card = deck.draw();
			hand.add(card);
		}
		
	}
	
	
	public void incrementScore() {
    score = getScore() + 1;
    
  }
public int getScore() {
    return score;
  }
	
	public Card flip() {
		Card topdeck = hand.get(0);
		hand.remove(0);
		return topdeck;
	}
	}

	 

 
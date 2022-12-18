package warGame;

 

public class App {

	
	//this is the main string, i have a run method to kick off the game
	
	public static void main(String[] args) {
	new App().run();
	}
	 
		public void run() {
			Player player1 = new Player("The Crying Lions");
			Player player2 = new Player("The Hunting Wolves");
			 
			// here we see player1.name is the names we entered in the string above
			
			System.out.println(player1.name + " is going to war with " + player2.name);
			System.out.println();
			
			// this is where we build the deck and shuffle
			Deck deck = new Deck();
			deck.shuffle();
		 
			
			// here we make the players hands, the deck is split in 2 for a even 26, the cards are added to player1 and 2 which are objects that hold the cards and a score
			for (int x = 1; x <= 26; x++) {
			player1.hand.add(deck.draw());
			player2.hand.add(deck.draw());
		}
		
			// here we print out the hands
			
			 player1.describe();
			 System.out.println();
			 player2.describe();
			 System.out.println();
			 
			 
			 //here we set the turns, when the counter hits 26 the game ends which is good cause we'd run out of cards after that
			 for (int counter = 1; counter <= 26; counter++ ) {
				 Card player1Hand = player1.flip();
				 Card player2Hand = player2.flip();
				 
			 
			 //here we add players score up
			 if (player1Hand.getCardvalue() > player2Hand.getCardvalue()) {
				 player1.incrementScore();
				 
			 } else if (player2Hand.getCardvalue() > player1Hand.getCardvalue()) {
				 player2.incrementScore();
				 
			 } 
			 
			 
			 //here we let the players know what happened, it's supposed to say the card but my getCard() method stumped me, I think I need to convert this to a string using toString() but everytime I tried I made things worse
			 if (player1Hand.getCardvalue() > player2Hand.getCardvalue()) {
			   
			        System.out.println(player1.name + " summoned warrior is the " + player1Hand.getCard());
			        System.out.println(player2.name  + " has played the " + player2Hand.getCard());
			      
			        
			        System.out.println(player1.name  +  " has taken this battle!");
			        System.out.println(player1.name + " battles won so far " + player1.score);
			        System.out.println(player2.name + " battles won so far " + player2.score);
			        System.out.println();
			   
			      }
			 
			 else if (player2Hand.getCardvalue() > player1Hand.getCardvalue()) {
				 System.out.println(player1.name + " has sent forth the " + player1Hand.getCard());
				 System.out.println(player2.name + " will meet them with the " + player2Hand.getCard());
				 System.out.println(player2.name  +  " has won this battle!");
			        System.out.println(player1.name + " battles won so far " + player1.score);
			        System.out.println(player2.name + " battles won so far " + player2.score);
			        System.out.println();
			 }
			 
			 else if (player1Hand.getCardvalue() == player2Hand.getCardvalue()) {
			      
			        System.out.println(player1.name  + " has drawn card: " + player1Hand.getCard());
			        System.out.println(player2.name + " has drawn card: " + player2Hand.getCard());
			        System.out.println("There are no winners! Both parties get nothing!");
			        System.out.println(player1.name + " sits idle with " + player1.score);
			        System.out.println(player2.name + " also awaits the next battle, having won " + player2.score);
			        System.out.println();
			    }
			 }
			 
			 
			 //here we let the players know the final score and the winner using simple booleans
			 System.out.println("Player1 has won " + player1.score);
			 System.out.println("But Player2 has won " + player2.score);
			 
			 if (player1.score > player2.score) {
				 System.out.println("Player1 has won the day!");
			 } else if (player1.score < player2.score) {
				 System.out.println("Player2 emerges the winner this day!");
			 } else if (player1.score == player2.score) {
				 System.out.println("This war is for naught! The war has ended, and only the crows are the victors... Both players lose!");
				 
			 
			 
			 }
		
			
			
		 	 
		 
}
}

 
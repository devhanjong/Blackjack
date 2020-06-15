package blackjack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Game {
	
	public void play() {
		ArrayList<User> user = new ArrayList<User>();
		user.add((User) new Dealer());
		user.add((User) new Player());
		
		Carddeck deck = new Carddeck();
		
		Stack<Card> cards = deck.Carddeck();
		System.out.println(cards);
		
		Rule rule = new Rule();
		
		
	}
}

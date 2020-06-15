package blackjack1;

import java.util.Stack;

public class Dealer implements User{
	String name = "";
	
	public Dealer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	

	@Override
	public void checkCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Card go(Stack<Card> cards) {
		Card card = cards.pop();
		return card;
	}

	@Override
	public boolean stop() {
		return false;
	}

	@Override
	public void openCards() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Card getCard(Stack<Card> cards) {
		Card card = cards.pop();
		return card;
		
	}

}

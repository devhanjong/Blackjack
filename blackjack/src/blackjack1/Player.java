package blackjack1;

import java.util.Stack;

public class Player implements User {
	String name = "";
	
	public Player(String name) {
		this.name = name;
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
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
		System.out.println("������ �����ϼ̽��ϴ�.");
		
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

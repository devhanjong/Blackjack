package blackjack1;

import java.util.Stack;

public class Carddeck {
	Suffle suf = new Suffle();
	Stack<Card> cas = new Stack<Card>();

	Card ca = new Card();
	
	//카드덱 생성 
	public Stack<Card> Carddeck() {
		
		int[] deck = new int[52];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		// 셔플
		suf.Suffle(deck);
		
		for (int i = 0; i < deck.length; i++) {
			Card card = new Card();
			card.Card(deck[i]);
			cas.push(card);
		}
		//카드값부여 

		return cas;
	}
}

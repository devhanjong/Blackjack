package blackjack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Carddeck {
	Suffle suf = new Suffle();
	Stack<Card> cas = new Stack<Card>();

	Card ca = new Card();
	
	//ī�嵦 ���� 
	public Stack<Card> Carddeck() {
		
		int[] deck = new int[52];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		// ����
		suf.Suffle(deck);
		System.out.println(Arrays.toString(deck));
		
		for (int i = 0; i < deck.length; i++) {
			Card card = new Card();
			card.Card(deck[i]);
			cas.push(card);
		}
		//ī�尪�ο� 

		return cas;
	}
}

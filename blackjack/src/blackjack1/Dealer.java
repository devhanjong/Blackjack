package blackjack1;

import java.util.List;
import java.util.Stack;

public class Dealer implements User {
	String name = "";

	public Dealer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void checkCard(List<Card> handcards) {
		System.out.println("초보딜러의카드: " + dealercards.get(0).getPatterns() + dealercards.get(0).getPoint() + " 비공개 ");

	}

	@Override // 플레이어 스톱시 딜러드로우 + 룰 입히기
	public void go(Stack<Card> cards) {

		Card card = cards.pop();
		playercards.add(card);
		System.out.print("초보딜러의 카드 : ");
		for (Card cd : dealercards) {
			System.out.printf("%s%s ", cd.Patterns, cd.point);
		}

	}

	@Override
	public boolean stop() {
		return false;
	}

	@Override
	public void openCards() {
		System.out.print("초보딜러의 카드 : ");
		for (Card cd : dealercards) {
			System.out.printf("%s%s ", cd.Patterns, cd.point);
		}
	}

	@Override
	public void getCard(Stack<Card> cards) {
		for (int i = 0; i < 2; i++) {
			Card card = cards.pop();
			dealercards.add(card);
		} // 유저이름으로 바꿀것
		System.out.println("초보딜러의카드: " + dealercards.get(0).getPatterns() + dealercards.get(0).getPoint() + " 비공개 ");
	}

}

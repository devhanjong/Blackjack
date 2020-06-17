package blackjack1;

import java.util.List;
import java.util.Stack;

public class Dealer implements User {
	String name = "";

	public Dealer(String name) {
		this.name = name;
	}

	public void currentValue() {
		int sum = 0;
		for (Card cd : dealercards) {
			sum += cd.value;
		}
		System.out.println();
		System.out.println(" 현재 딜러카드의 합: " + sum);
	}

	public String getName() {
		return name;
	}

	@Override
	public void checkCard(List<Card> handcards) {
		System.out.println("딜러의 카드: " + dealercards.get(0).getPatterns() + dealercards.get(0).getPoint() + " 비공개 ");

	}

	@Override // 플레이어 스톱시 딜러드로우 + 룰 입히기
	public void go(Stack<Card> cards) {

		Card card = cards.pop();
		dealercards.add(card);
		System.out.print("딜러의 카드 : ");
		for (Card cd : dealercards) {
			System.out.printf("%s%s ", cd.Patterns, cd.point);
		}
		currentValue();
	}

	@Override
	public boolean stop() {
		return false;
	}

	@Override
	public boolean openCards() {
		System.out.print("딜러의 카드 : ");
		for (Card cd : dealercards) {
			System.out.printf("%s%s ", cd.Patterns, cd.point);
		}
		if (rule.dealerBlackjack(dealercards.get(0).value, dealercards.get(1).value)) {
			// 딜러블랙잭처리
			return true;
		} else {
			currentValue();
			return false;
		}
	}

	@Override
	public void getCard(Stack<Card> cards) {
		for (int i = 0; i < 2; i++) {
			Card card = cards.pop();
			dealercards.add(card);
		} // 유저이름으로 바꿀것
		System.out.println("딜러의 카드: " + dealercards.get(0).getPatterns() + dealercards.get(0).getPoint() + " 비공개 ");
	}

}

package blackjack1;

import java.util.List;
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
	public void checkCard(List<Card> handcards) {
		// TODO Auto-generated method stub

	}

	@Override
	public void go(Stack<Card> cards) { // ī������̱� //21�Ѵ���üũ ,, ī�� 6������ üũ
		Card card = cards.pop();
		playercards.add(card);
		System.out.print("�÷��̾��� ī�� : ");
		for (Card cd : playercards) {
			System.out.printf("%s%s ", cd.Patterns, cd.point);
		}
		currentValue();
		rule.playerrule3(playercards);
		rule.rule4(playercards);
	}

	@Override
	public boolean stop() {
		System.out.println("������ �����ϼ̽��ϴ�.");
		Game.gamemenu = false;
		return false;
	}

	public boolean blackjackwinstop() {

		return false;
	}

	@Override
	public boolean openCards() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void getCard(Stack<Card> cards) {
		for (int i = 0; i < 2; i++) {
			Card card = cards.pop();
			playercards.add(card);
		}
		System.out.print("�÷��̾��� ī�� : ");

		for (Card cd : playercards) {
			System.out.printf("%s%s ", cd.Patterns, cd.point);
		}

		if (rule.playerblackjack(playercards.get(0).getValue(), playercards.get(1).getValue()) == true) {
//			blackjackwinstop();
		} else {
			currentValue();
		}
	}

	@Override
	public void currentValue() {
		int sum = 0;
		for (Card cd : playercards) {
			sum += cd.value;
		}
		System.out.println();
		System.out.println("���� �÷��̾�ī���� ��: " + sum);

	}

}

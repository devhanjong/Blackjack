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
		System.out.println("�ʺ�������ī��: " + dealercards.get(0).getPatterns() + dealercards.get(0).getPoint() + " ����� ");

	}

	@Override // �÷��̾� ����� ������ο� + �� ������
	public void go(Stack<Card> cards) {

		Card card = cards.pop();
		playercards.add(card);
		System.out.print("�ʺ������� ī�� : ");
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
		System.out.print("�ʺ������� ī�� : ");
		for (Card cd : dealercards) {
			System.out.printf("%s%s ", cd.Patterns, cd.point);
		}
	}

	@Override
	public void getCard(Stack<Card> cards) {
		for (int i = 0; i < 2; i++) {
			Card card = cards.pop();
			dealercards.add(card);
		} // �����̸����� �ٲܰ�
		System.out.println("�ʺ�������ī��: " + dealercards.get(0).getPatterns() + dealercards.get(0).getPoint() + " ����� ");
	}

}

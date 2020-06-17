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
		System.out.println(" ���� ����ī���� ��: " + sum);
	}

	public String getName() {
		return name;
	}

	@Override
	public void checkCard(List<Card> handcards) {
		System.out.println("������ ī��: " + dealercards.get(0).getPatterns() + dealercards.get(0).getPoint() + " ����� ");

	}

	@Override // �÷��̾� ����� ������ο� + �� ������
	public void go(Stack<Card> cards) {

		Card card = cards.pop();
		dealercards.add(card);
		System.out.print("������ ī�� : ");
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
		System.out.print("������ ī�� : ");
		for (Card cd : dealercards) {
			System.out.printf("%s%s ", cd.Patterns, cd.point);
		}
		if (rule.dealerBlackjack(dealercards.get(0).value, dealercards.get(1).value)) {
			// ��������ó��
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
		} // �����̸����� �ٲܰ�
		System.out.println("������ ī��: " + dealercards.get(0).getPatterns() + dealercards.get(0).getPoint() + " ����� ");
	}

}

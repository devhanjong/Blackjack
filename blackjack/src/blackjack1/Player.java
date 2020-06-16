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
	public void go(Stack<Card> cards) {  //카드한장뽑기 //21넘는지체크 ,, 카드 6장인지 체크 
		Card card = cards.pop();
		playercards.add(card);
		System.out.print("플레이어의 카드 : ");
		for (Card cd : playercards) {
			System.out.printf("%s%s ", cd.Patterns, cd.point);
		}
		rule.playerrule3(playercards);
		rule.rule4(playercards);
	}

	@Override
	public boolean stop() {
		System.out.println("게임을 포기하셨습니다.");
		Game.gamemenu = false;
		return false;
	}

	public boolean blackjackwinstop() {

		return false;
	}

	@Override
	public void openCards() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCard(Stack<Card> cards) {
		for (int i = 0; i < 2; i++) {
			Card card = cards.pop();
			playercards.add(card);
		}
		System.out.print("플레이어의 카드 : ");
		for (Card cd : playercards) {
			System.out.printf("%s%s ", cd.Patterns, cd.point);
		}
		if (rule.rule1(playercards.get(0).getValue(), playercards.get(1).getValue()) == true) {
			blackjackwinstop();
		}
	}

}

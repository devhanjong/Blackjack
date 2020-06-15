package blackjack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Game {
	Scanner scan = new Scanner(System.in);

	public void play() {
		ArrayList<User> user = new ArrayList<User>();
		user.add((User) new Dealer("�ʺ�����"));
		user.add((User) new Player("�÷��̾�1")); // �̵������Ұ�

		Carddeck deck = new Carddeck();

		Stack<Card> cards = deck.Carddeck();
		System.out.println(cards);

		Rule rule = new Rule();

		System.out.println("������ �����մϴ�");
		Card dealerCard1 = user.get(0).getCard(cards);
		Card playerCard1 = user.get(1).getCard(cards);
		Card dealerCard2 = user.get(0).getCard(cards);
		Card playerCard2 = user.get(1).getCard(cards);

		System.out.println(user.get(0).getName() + "��ī��: " + dealerCard1.getPatterns() + dealerCard1.getPoint()+" ����� ");
		System.out.println(user.get(1).getName() + "����ī��: " + playerCard1.getPatterns() + playerCard1.getPoint()+ " " + playerCard2.getPatterns() + playerCard2.getPoint());
		
		
		
		int gnum = gamemenu();

		
		if (gnum == 1) { //ī��ޱ� �� ī��ް� ��üũ

		} else if (gnum == 2) {//����� �й�, ���ó�� ,����
			user.get(1).stop();
		
		} else {
			gamemenu();
		}

	}

//���Ӹ��θ޴�
	private int mainmenu() {
		String num = getNum("[1]���ӽ��� [2]�÷��̾������Է� [3]�꼳�� [0]��������");
		try {
			return Integer.parseInt(num);
		} catch (Exception e) {
			getNum("[1]���ӽ��� [2]�÷��̾������Է� [3]�꼳�� [0]��������");
		}
		return 1000;
	}

//���� ����޴�
	private int gamemenu() {
		String num = getNum("[1]ī��ޱ� [2]����");
		try {
			return Integer.parseInt(num);
		}catch(Exception e) {
			getNum("[1]ī��ޱ� [2]����");
		}
		return 1000;
	}
// �޴� �ѹ��������� 
	private String getNum(String str) {
		System.out.println(str);

		return scan.next();
	}
}

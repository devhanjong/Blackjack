package blackjack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Game {
	public static boolean main = true;	//���α׷� ���� ����
	public static boolean gamemenu = true;  //���Ӹ޴� ���� ����
	public static boolean game = true;  //������������ ���� ����
	
	Scanner scan = new Scanner(System.in);

	public void play() {
		ArrayList<User> user = new ArrayList<User>();
		user.add((User) new Dealer("�ʺ�����"));
		user.add((User) new Player("�÷��̾�")); // �̵������Ұ�
		Rule rule = new Rule();
		
//		System.out.println(cards);
 

//		Rule rule = new Rule();
//���ӽ��ۺκ� ���θ޴� ���� 
		int mnum;
		int gnum; 
		while ((mnum = mainmenu()) != 0) {
			Carddeck deck = new Carddeck();
			
			Stack<Card> cards = deck.Carddeck();
			switch (mnum) {
			case 1:
				System.out.println("������ �����մϴ�");
				user.get(1).playercards.clear();
				user.get(0).dealercards.clear();
				//user 0 �� ���� user 1�� �÷��̾�
				user.get(0).getCard(cards);
				user.get(1).getCard(cards);
				System.out.println();
				gamemenu = true;
				// �����������
				while (gamemenu) {
					gnum = gamemenu();
					switch(gnum) {
					case 1: // ī��ޱ� �� ī��ް� >> ��üũ 21�� �Ѵ��� �ƴ��� 21���ٽ� �й� �ƴϸ� ���� 
						user.get(0).checkCard(Dealer.dealercards); 
						user.get(1).go(cards);
						System.out.println();
						break;
					case 2: //ī��׸������� ����ī����� >> �÷��̾���������� >> ����ī�尡 17�����������Ǵ� >> 
						    //��ο�>> ����ī�尡 21�̾ȳѴ��� �Ǵ� >> �����Ǵ� ������Ģ
						user.get(0).openCards();
						while(game) {
							rule.valuecheck(Dealer.dealercards, Player.playercards);
							if(rule.rule5(Dealer.dealercards)) {
								user.get(0).go(cards);
							}
							rule.dealerrule3(Dealer.dealercards);
							rule.wincheck(Dealer.dealercards, Player.playercards);
						}
						break;
					case 3:// ����� �й�, ���ð��ó�� , 
						user.get(1).stop();
						break;
					}

				}
				break;
			case 2:

				break;
			case 3:

				break;
			}
//���ӽ��� 
		}
	}

//���Ӹ��θ޴�
	private int mainmenu() {
		String num = getNum("[1]���ӽ��� [2]�÷��̾����� [3]�꼳�� [0]��������");
		try {
			return Integer.parseInt(num);
		} catch (Exception e) {
			getNum("[1]���ӽ��� [2]�÷��̾����� [3]�꼳�� [0]��������");
		}
		return 1000;
	}

//���� ����޴�
	private int gamemenu() {
		String num = getNum("[1]ī��ޱ� [2]�׸��ޱ� [3]����");
		try {
			return Integer.parseInt(num);
		} catch (Exception e) {
			getNum("[1]ī��ޱ� [2]�׸��ޱ� [3]����");
		}
		return 1000;
	}

// �޴� �ѹ��������� 
	private String getNum(String str) {
		System.out.println(str);

		return scan.next();
	}
}

package blackjack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Game {
	public static boolean main = true;	//프로그램 진행 변수
	public static boolean gamemenu = true;  //게임메뉴 진행 변수
	public static boolean game = true;  //게임종료조건 진행 변수
	
	Scanner scan = new Scanner(System.in);

	public void play() {
		ArrayList<User> user = new ArrayList<User>();
		user.add((User) new Dealer("초보딜러"));
		user.add((User) new Player("플레이어")); // 이따수정할것
		Rule rule = new Rule();
		
//		System.out.println(cards);
 

//		Rule rule = new Rule();
//게임시작부분 메인메뉴 띄우기 
		int mnum;
		int gnum; 
		while ((mnum = mainmenu()) != 0) {
			Carddeck deck = new Carddeck();
			
			Stack<Card> cards = deck.Carddeck();
			switch (mnum) {
			case 1:
				System.out.println("게임을 시작합니다");
				user.get(1).playercards.clear();
				user.get(0).dealercards.clear();
				//user 0 이 딜러 user 1이 플레이어
				user.get(0).getCard(cards);
				user.get(1).getCard(cards);
				System.out.println();
				gamemenu = true;
				// 게임진행시작
				while (gamemenu) {
					gnum = gamemenu();
					switch(gnum) {
					case 1: // 카드받기 시 카드받고 >> 룰체크 21이 넘는지 아닌지 21오바시 패배 아니면 진행 
						user.get(0).checkCard(Dealer.dealercards); 
						user.get(1).go(cards);
						System.out.println();
						break;
					case 2: //카드그만받으면 딜러카드오픈 >> 플레이어벨류가높으면 >> 딜러카드가 17보다작은지판단 >> 
						    //드로우>> 딜러카드가 21이안넘는지 판단 >> 승패판단 루프규칙
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
					case 3:// 포기시 패배, 배팅결과처리 , 
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
//게임시작 
		}
	}

//게임메인메뉴
	private int mainmenu() {
		String num = getNum("[1]게임시작 [2]플레이어정보 [3]룰설명 [0]게임종료");
		try {
			return Integer.parseInt(num);
		} catch (Exception e) {
			getNum("[1]게임시작 [2]플레이어정보 [3]룰설명 [0]게임종료");
		}
		return 1000;
	}

//게임 진행메뉴
	private int gamemenu() {
		String num = getNum("[1]카드받기 [2]그만받기 [3]포기");
		try {
			return Integer.parseInt(num);
		} catch (Exception e) {
			getNum("[1]카드받기 [2]그만받기 [3]포기");
		}
		return 1000;
	}

// 메뉴 넘버가져오기 
	private String getNum(String str) {
		System.out.println(str);

		return scan.next();
	}
}

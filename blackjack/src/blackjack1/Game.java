package blackjack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Game {
	Scanner scan = new Scanner(System.in);

	public void play() {
		ArrayList<User> user = new ArrayList<User>();
		user.add((User) new Dealer("초보딜러"));
		user.add((User) new Player("플레이어1")); // 이따수정할것

		Carddeck deck = new Carddeck();

		Stack<Card> cards = deck.Carddeck();
		System.out.println(cards);

		Rule rule = new Rule();

		System.out.println("게임을 시작합니다");
		Card dealerCard1 = user.get(0).getCard(cards);
		Card playerCard1 = user.get(1).getCard(cards);
		Card dealerCard2 = user.get(0).getCard(cards);
		Card playerCard2 = user.get(1).getCard(cards);

		System.out.println(user.get(0).getName() + "의카드: " + dealerCard1.getPatterns() + dealerCard1.getPoint()+" 비공개 ");
		System.out.println(user.get(1).getName() + "님의카드: " + playerCard1.getPatterns() + playerCard1.getPoint()+ " " + playerCard2.getPatterns() + playerCard2.getPoint());
		
		
		
		int gnum = gamemenu();

		
		if (gnum == 1) { //카드받기 시 카드받고 룰체크

		} else if (gnum == 2) {//포기시 패배, 결과처리 ,공개
			user.get(1).stop();
		
		} else {
			gamemenu();
		}

	}

//게임메인메뉴
	private int mainmenu() {
		String num = getNum("[1]게임시작 [2]플레이어정보입력 [3]룰설명 [0]게임종료");
		try {
			return Integer.parseInt(num);
		} catch (Exception e) {
			getNum("[1]게임시작 [2]플레이어정보입력 [3]룰설명 [0]게임종료");
		}
		return 1000;
	}

//게임 진행메뉴
	private int gamemenu() {
		String num = getNum("[1]카드받기 [2]포기");
		try {
			return Integer.parseInt(num);
		}catch(Exception e) {
			getNum("[1]카드받기 [2]포기");
		}
		return 1000;
	}
// 메뉴 넘버가져오기 
	private String getNum(String str) {
		System.out.println(str);

		return scan.next();
	}
}

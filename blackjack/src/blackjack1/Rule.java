package blackjack1;

import java.util.List;

public class Rule {

	// 플레이어의 첫 두장의 value가 21이면 승리 A값이 1로 설정되있으므로
	// A와 value 10카드조합이면 승리
	public boolean rule1(int value1, int value2) {
		if (value1 + value2 == 11) {
			if (value1 == 1 || value2 == 1) {
				System.out.println("축하합니다 블랙잭입니다");
				Game.gamemenu = false;
				// 승리시 결과처리
				return true;
			}
		}
		// 아무일없음
		return false;

	}

	public void Rule2() {

//		System.out.println("블랙잭은 카드의 숫자합이 21과 가깝게 만드는 게임입니다.");
//		System.out.println("카드합이 21를 초과하는 순간 패배하며 J,Q,K는 숫자 10으로간주합니다.");
//		System.out.println("플레이어는 시작하기전 원하는만큼 배팅을하고 승리시 배팅금액만큼을 얻습니다.");
//		System.out.println("플레이어와 딜러는 각자 2장의 카드를 가지고 시작합니다 이때 딜러의 카드는 첫장만 공개합니다.");
//		System.out.println("플레이어의 첫 두카드가 한장의 A와 한장의 10,J,Q,K이면 블랙잭이며 즉시 승리합니다.");
//		System.out.println("플레이어는 자신의차례에 카드받기 또는 포기를 할수있습니다.");
//		System.out.println("플레이어는 자신의차례에 카드받기 또는 포기를 할수있습니다.");
//		System.out.println("플레이어는 자신의차례에 카드받기 또는 포기를 할수있습니다.");

	}

	// 플레이어의 카드합이 21이 넘어가면 플레이어 패배
	public boolean playerrule3(List<Card> cards) {
		int sum = 0;
		for (Card cd : cards) {
			sum += cd.value;
		}
		if (sum > 21) {
			System.out.println("플레이어의 카드합이 21이 넘었습니다. 게임패배");
			Game.gamemenu = false;
			// 패배시 게임 종료되게 코드작성해야됨
			// 결과처리
			return false;
		} else {
			// 계속진행
			return true;
		}
		// 패배후 동작기능 ?

	}

	// 딜러의 카드합이 21넘으면 승리
	public boolean dealerrule3(List<Card> cards) {
		int sum = 0;
		for (Card cd : cards) {
			sum += cd.value;
		}
		if (sum > 21) {
			System.out.println("딜러의 카드합이 21이 넘었습니다. 게임승리");
			Game.game = false;
			// 승리시 게임 종료되게 코드작성해야됨
			// 결과처리
			return false;
		} else {
			// 계속진행
			return true;
		}
		// 승리후 동작기능 ?

	}

	// 플레이어의 카드가 6장이고 21이 넘어가지않으면 승리
	public void rule4(List<Card> cards) {
		if (cards.size() == 6 && playerrule3(cards)) {
			System.out.println("승리");
			Game.gamemenu = false;
			// 승리시 결과처리
		}
	}

	// 딜러는 플레이어 stop시 카드값이 17미만이면 go 17이상이면 stop 한다
	// 딜러카드가 17보다 작은지 아닌지 ? 판단 //딜러카드가 17~21이면 stop //21 이상이면 플레이어승
	public boolean rule5(List<Card> cards) {
		int sum = 0;
		for (Card cd : cards) {
			sum += cd.value;
		}
		if (sum < 17) {
			// 딜러카드가 17보다 작습니다 드로우로 계속진행
			return true;
		}
		else {
			
			return false;
		}

	}
	
	
	

	// 딜러의 카드합이 21이 넘어가면 플레이어 승리

	// 플레이어가 stop했을시 딜러의 카드합과 비교후 높은쪽이 승리 같으면 무승부
	public boolean wincheck(List<Card> card1, List<Card> card2) {
		int sum1 = 0;
		int sum2 = 0;
		for (Card cd1 : card1) {
			sum1 += cd1.value;
		}
		for (Card cd2 : card2) {
			sum2 += cd2.value;
		}
		if (sum1 > sum2) {
			// 딜러의승리
			System.out.println("딜러의 승리");
			return true;
		} else if (sum1 < sum2) {
			System.out.println("플레이어 승리");
			// 플레이어 승리

			return false;
		} else {
			// 무승부
			System.out.println("무승부 ");
			return true;
		}
	}

	// 서로의 카드값비교 딜러가 카드 1 플레이어가 카드 2
	public void valuecheck(List<Card> card1, List<Card> card2) {
		int sum1 = 0;
		int sum2 = 0;
		for (Card cd1 : card1) {
			sum1 += cd1.value;
		}
		for (Card cd2 : card2) {
			sum2 += cd2.value;
		}
		if (sum1 <= sum2) {
			// 조건에따라 승리 or 계속진행

		} else {
			System.out.println("딜러의 카드가 더높습니다. 패배");
			Game.game = false;
			// 플레이어 패배
		}
	}
}

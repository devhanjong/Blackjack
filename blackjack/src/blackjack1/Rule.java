package blackjack1;

public class Rule {
	
	// 플레이어의 첫 두장의 value가 21이면 승리 A값이 1로 설정되있으므로
	// A와 value 10카드조합이면 승리
	public void Rule1(int value1, int value2) {
		if (value1 +value2 ==11) {
			if(value1==1 || value2== 1) {
				System.out.println("블랙잭입니다");
			}
		}

	}

	// 플레이어의 카드합이 21이 넘어가면 플레이어 패배
	public void Rule2() {
		
		
		System.out.println("블랙잭은 카드의 숫자합이 21과 가깝게 만드는 게임입니다.");
		System.out.println("카드합이 21를 초과하는 순간 패배하며 J,Q,K는 숫자 10으로간주합니다.");
		System.out.println("플레이어는 시작하기전 원하는만큼 배팅을하고 승리시 배팅금액만큼을 얻습니다.");
		System.out.println("플레이어와 딜러는 각자 2장의 카드를 가지고 시작합니다 이때 딜러의 카드는 첫장만 공개합니다.");
		System.out.println("플레이어의 첫 두카드가 한장의 A와 한장의 10,J,Q,K이면 블랙잭이며 즉시 승리합니다.");
		System.out.println("플레이어는 자신의차례에 카드받기 또는 포기를 할수있습니다.");
		System.out.println("플레이어는 자신의차례에 카드받기 또는 포기를 할수있습니다.");
		System.out.println("플레이어는 자신의차례에 카드받기 또는 포기를 할수있습니다.");
		
	}


	// 플레이어의 카드가 6장이고 21이 넘어가지않으면 승리

	// 딜러는 플레이어 stop시 카드값이 17이하면 go 17초과면 stop 한다

	// 딜러의 카드합이 21이 넘어가면 플레이어 승리

	// 플레이어가 stop했을시 딜러의 카드합과 비교후 높은쪽이 승리 같으면 무승부
}

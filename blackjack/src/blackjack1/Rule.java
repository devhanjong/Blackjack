package blackjack1;

import java.util.List;

public class Rule {

	// �÷��̾��� ù ������ value�� 21�̸� �¸� A���� 1�� �����������Ƿ�
	// A�� value 10ī�������̸� �¸�
	public boolean rule1(int value1, int value2) {
		if (value1 + value2 == 11) {
			if (value1 == 1 || value2 == 1) {
				System.out.println("�����մϴ� �����Դϴ�");
				Game.gamemenu = false;
				// �¸��� ���ó��
				return true;
			}
		}
		// �ƹ��Ͼ���
		return false;

	}

	public void Rule2() {

//		System.out.println("������ ī���� �������� 21�� ������ ����� �����Դϴ�.");
//		System.out.println("ī������ 21�� �ʰ��ϴ� ���� �й��ϸ� J,Q,K�� ���� 10���ΰ����մϴ�.");
//		System.out.println("�÷��̾�� �����ϱ��� ���ϴ¸�ŭ �������ϰ� �¸��� ���ñݾ׸�ŭ�� ����ϴ�.");
//		System.out.println("�÷��̾�� ������ ���� 2���� ī�带 ������ �����մϴ� �̶� ������ ī��� ù�常 �����մϴ�.");
//		System.out.println("�÷��̾��� ù ��ī�尡 ������ A�� ������ 10,J,Q,K�̸� �����̸� ��� �¸��մϴ�.");
//		System.out.println("�÷��̾�� �ڽ������ʿ� ī��ޱ� �Ǵ� ���⸦ �Ҽ��ֽ��ϴ�.");
//		System.out.println("�÷��̾�� �ڽ������ʿ� ī��ޱ� �Ǵ� ���⸦ �Ҽ��ֽ��ϴ�.");
//		System.out.println("�÷��̾�� �ڽ������ʿ� ī��ޱ� �Ǵ� ���⸦ �Ҽ��ֽ��ϴ�.");

	}

	// �÷��̾��� ī������ 21�� �Ѿ�� �÷��̾� �й�
	public boolean playerrule3(List<Card> cards) {
		int sum = 0;
		for (Card cd : cards) {
			sum += cd.value;
		}
		if (sum > 21) {
			System.out.println("�÷��̾��� ī������ 21�� �Ѿ����ϴ�. �����й�");
			Game.gamemenu = false;
			// �й�� ���� ����ǰ� �ڵ��ۼ��ؾߵ�
			// ���ó��
			return false;
		} else {
			// �������
			return true;
		}
		// �й��� ���۱�� ?

	}

	// ������ ī������ 21������ �¸�
	public boolean dealerrule3(List<Card> cards) {
		int sum = 0;
		for (Card cd : cards) {
			sum += cd.value;
		}
		if (sum > 21) {
			System.out.println("������ ī������ 21�� �Ѿ����ϴ�. ���ӽ¸�");
			Game.game = false;
			// �¸��� ���� ����ǰ� �ڵ��ۼ��ؾߵ�
			// ���ó��
			return false;
		} else {
			// �������
			return true;
		}
		// �¸��� ���۱�� ?

	}

	// �÷��̾��� ī�尡 6���̰� 21�� �Ѿ�������� �¸�
	public void rule4(List<Card> cards) {
		if (cards.size() == 6 && playerrule3(cards)) {
			System.out.println("�¸�");
			Game.gamemenu = false;
			// �¸��� ���ó��
		}
	}

	// ������ �÷��̾� stop�� ī�尪�� 17�̸��̸� go 17�̻��̸� stop �Ѵ�
	// ����ī�尡 17���� ������ �ƴ��� ? �Ǵ� //����ī�尡 17~21�̸� stop //21 �̻��̸� �÷��̾��
	public boolean rule5(List<Card> cards) {
		int sum = 0;
		for (Card cd : cards) {
			sum += cd.value;
		}
		if (sum < 17) {
			// ����ī�尡 17���� �۽��ϴ� ��ο�� �������
			return true;
		}
		else {
			
			return false;
		}

	}
	
	
	

	// ������ ī������ 21�� �Ѿ�� �÷��̾� �¸�

	// �÷��̾ stop������ ������ ī���հ� ���� �������� �¸� ������ ���º�
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
			// �����ǽ¸�
			System.out.println("������ �¸�");
			return true;
		} else if (sum1 < sum2) {
			System.out.println("�÷��̾� �¸�");
			// �÷��̾� �¸�

			return false;
		} else {
			// ���º�
			System.out.println("���º� ");
			return true;
		}
	}

	// ������ ī�尪�� ������ ī�� 1 �÷��̾ ī�� 2
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
			// ���ǿ����� �¸� or �������

		} else {
			System.out.println("������ ī�尡 �������ϴ�. �й�");
			Game.game = false;
			// �÷��̾� �й�
		}
	}
}

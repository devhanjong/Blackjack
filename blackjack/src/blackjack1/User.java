package blackjack1;

import java.util.Stack;

public interface User {
	
	//�÷��̾� , ������ ������ ��ӹ޴´� 
	String getName();
	Card getCard(Stack<Card> cards);    //ó���� ������ 2�徿 ��������
	void checkCard();  //���� ī�� üũ�ϱ�
	boolean stop();       //���������ϱ�    //�޽��� ���� 
	void openCards();  //��������� ī������ϱ�
	Card go(Stack<Card> cards);   //���� ��ο��ϱ�    //�ߺ������ʳ� ?? getcard��
	
}

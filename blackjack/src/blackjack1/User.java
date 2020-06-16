package blackjack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public interface User {
	List<Card> playercards = new ArrayList<Card>();
	List<Card> dealercards = new ArrayList<Card>();
	Rule rule = new Rule();
	
	
	
	//�÷��̾� , ������ ������ ��ӹ޴´� 
	String getName();
	void getCard(Stack<Card> cards);    //ó���� ������ 2�徿 ��������
	  
	boolean stop();       //���������ϱ�    //�޽��� ���� 
	void openCards();  //��������� ī������ϱ�
	void go(Stack<Card> cards);   //���� ��ο��ϱ�    //�ߺ������ʳ� ?? getcard��
	void checkCard(List<Card> handcards); //���� ī�� üũ�ϱ�
	
	
}

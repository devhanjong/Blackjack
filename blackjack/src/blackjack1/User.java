package blackjack1;

public interface User {
	
	//�÷��̾� , ������ ������ ��ӹ޴´� 
	String getName();
	void getCard();    //ó���� ������ 2�徿 ��������
	void checkCard();  //���� ī�� üũ�ϱ�
	void go();         //���� ��ο��ϱ�
	void stop();       //���������ϱ�
	void openCards();  //��������� ī������ϱ�
}

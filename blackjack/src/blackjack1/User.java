package blackjack1;

public interface User {
	
	//플레이어 , 딜러가 유저를 상속받는다 
	String getName();
	void getCard();    //처음에 덱에서 2장씩 가져오기
	void checkCard();  //나의 카드 체크하기
	void go();         //한장 드로우하기
	void stop();       //게임포기하기
	void openCards();  //게임종료시 카드오픈하기
}

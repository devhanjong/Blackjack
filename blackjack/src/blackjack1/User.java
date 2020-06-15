package blackjack1;

import java.util.Stack;

public interface User {
	
	//플레이어 , 딜러가 유저를 상속받는다 
	String getName();
	Card getCard(Stack<Card> cards);    //처음에 덱에서 2장씩 가져오기
	void checkCard();  //나의 카드 체크하기
	boolean stop();       //게임포기하기    //펄스로 응답 
	void openCards();  //게임종료시 카드오픈하기
	Card go(Stack<Card> cards);   //한장 드로우하기    //중복되지않나 ?? getcard랑
	
}

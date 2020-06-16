package blackjack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public interface User {
	List<Card> playercards = new ArrayList<Card>();
	List<Card> dealercards = new ArrayList<Card>();
	Rule rule = new Rule();
	
	
	
	//플레이어 , 딜러가 유저를 상속받는다 
	String getName();
	void getCard(Stack<Card> cards);    //처음에 덱에서 2장씩 가져오기
	  
	boolean stop();       //게임포기하기    //펄스로 응답 
	void openCards();  //게임종료시 카드오픈하기
	void go(Stack<Card> cards);   //한장 드로우하기    //중복되지않나 ?? getcard랑
	void checkCard(List<Card> handcards); //나의 카드 체크하기
	
	
}

package blackjack1;

public class Card {
	public String Patterns; //무늬 
	public int value;   //실제가치
	public String point;  //눈에보이는 카드이름
	
	
	public void Card(int i) {
		
		if (i >= 0 && i <= 12) {
			setPatterns("스페이드");
		} else if (i >= 13 && i <= 25) {
			setPatterns("다이아");
		} else if (i >= 26 && i < 38) {
			setPatterns("하트");
		} else {
			setPatterns("클로버");
		}
		
		switch (i%13) {
		case 0:
			setValue(1);
			setPoint("A");
			break;
		case 1:
			setValue(2);
			setPoint("2");
			break;
		case 2:
			setValue(3);
			setPoint("3");
			break;
		case 3:
			setValue(4);
			setPoint("4");
			break;
		case 4:
			setValue(5);
			setPoint("5");
			break;
		case 5:
			setValue(6);
			setPoint("6");
			break;
		case 6:
			setValue(7);
			setPoint("7");
			break;
		case 7:
			setValue(8);
			setPoint("8");
			break;
		case 8:
			setValue(9);
			setPoint("9");
			break;
		case 9:
			setValue(10);
			setPoint("10");
			break;
		case 10:
			setValue(10);
			setPoint("J");
			break;
		case 11:
			setValue(10);
			setPoint("Q");
			break;
		case 12:
			setValue(10);
			setPoint("K");
			break;
		}
	}
	
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public String getPatterns() {
		return Patterns;
	}

	public void setPatterns(String patterns) {
		Patterns = patterns;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		
	}

	@Override
	public String toString() {
		return "Card [Patterns=" + Patterns + ", value=" + value + ", point=" + point + "]";
	}
	
	
	
	
	
}

package blackjack1;

public class Suffle {
	
	//¼ÅÇÃ¸Þ¼Òµå
	public void Suffle(int arr[]) {
		for (int i = 0; i < 200; i++) {
			int ran = (int)(Math.random()*52);
			int temp= 0;
			temp = arr[0];
			arr[0] = arr[ran];
			arr[ran] = temp;
		}
		
	}
}

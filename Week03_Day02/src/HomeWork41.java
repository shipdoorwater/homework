import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class HomeWork41 {
//	ArrayList<Integer> cardPick = new ArrayList<Integer>(); 
	int cardPick[];
	int countCard[];
	int run;
	int triplete;
	
	
	public HomeWork41 () {
		cardPick = new int[6];
		countCard = new int[10];
	}
 	
	public void sort(String input) {
		
		for (int i =0; i <6; i++) 
			cardPick[i] = input.charAt(i) - '0'; 
		
		Arrays.sort(cardPick);
	}
	
	public void count() {
		for (int i = 0; i<6; i++) {
			
			int j = cardPick[i];
			
			countCard[j]++;
		}
		
	}
	
	public void measure() {
		// run 체크
		for (int i =0; i<8; i++)		
			if (countCard[i] >=1 && countCard[i+1] >=1 && countCard[i+2] >= 1) {
				run += 1;
				countCard[i]--;
				countCard[i+1]--;
				countCard[i+2]--;
			}
		// triplete 체크
		for (int i =0; i<10; i++) {
			if (countCard[i] == 3) {
				triplete += 1;
				countCard[i] -= 3;
			}		
			if (countCard[i] == 6) {
				triplete += 2;
				countCard[i] -= 6;
			}		
		}
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean yesOrNo = true;
		
		while (yesOrNo) {
			run = 0;
			triplete =0;
			
			System.out.print("Input 6 Numbers: ");
			sort(sc.next());
			count();
			measure();
			
			if (run + triplete >= 2)
				System.out.println("Baby gin!!");
			else 
				System.out.println("Lose");
			
			System.out.println("Play again? (1 - yes / 2- no)");
			switch (sc.nextInt()) {
			case 1: yesOrNo = true; break;
			case 2: yesOrNo = false; break;
			default: yesOrNo = false;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork41 home = new HomeWork41();
		home.start();
	}

}

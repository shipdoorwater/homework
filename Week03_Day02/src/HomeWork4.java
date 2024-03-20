import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Collections;

public class HomeWork4 {
	
	ArrayList<Integer> cardPick = new ArrayList<Integer>(); 
	ArrayList<Integer> runPick = new ArrayList<Integer>(); 
	ArrayList<Integer> tripletePick = new ArrayList<Integer>(); 
	private int run;
	private int triplete;

	public void randomNumber() {
		
		Random random = new Random();
		
		for (int i =0; i<6; i++) {
			cardPick.add(random.nextInt(9));
		}
		
		cardPick.sort(Comparator.naturalOrder());
	}
	
	public void runPick() {
		run =0;
		int stopPoint = -1;
		
		for (int i =0; i <4; i++) {
			int list1 = cardPick.get(i);
			int list2 = cardPick.get(i +1);
			int list3 = cardPick.get(i +2);
			
			if (list1 + 1 == list2 && list2 + 1== list3) {
				run += 1;
				stopPoint = i;
				runPick.add(list1);
				runPick.add(list2);
				runPick.add(list3);
				break;
			}
		}
		
		if (stopPoint== 0) {
			int list4 = cardPick.get(4);
			int list5 = cardPick.get(5);
			int list6 = cardPick.get(6);
			
			if (list4 + 1 == list5 && list5 + 1== list6) 
				run += 1; 
				runPick.add(list4);
				runPick.add(list5);
				runPick.add(list6);
		}	
	}
	
	public void triplete() {
		triplete =0;
		ArrayList<Integer> tmpPick = new ArrayList<Integer>(); 
	
			
		
		tmpPick.addAll(cardPick);
		if (cardPick != null) {
			tmpPick.removeAll(runPick);
		}
		
		int freq = 0;		


		while (true) {
			for (int i : tmpPick) {
				freq = Collections.frequency(tmpPick, tmpPick.get(i));
				if (freq >= 3) {
					triplete += 1;
					do {
						tripletePick.add(tmpPick.get(i));
					} while(false);
					tmpPick.removeAll(tripletePick);
				}
				break;
			}
			break;
		}
	}
	
	
	public void start() {
		randomNumber();
		System.out.println(cardPick.toString());
		runPick();
		System.out.println(runPick.toString());
		System.out.println(run);
		triplete();
		System.out.println(tripletePick.toString());
		System.out.println(triplete);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork4 home = new HomeWork4();
		home.start();

	}

}

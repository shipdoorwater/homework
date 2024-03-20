import java.util.ArrayList;
import java.util.*;

public class HomeWork3 {

	private int num1;
	private int num2;
	private int numberArr[]; // 새로운 번호 들어올때마다 toArray 메소드에서 초기화

	private ArrayList<Integer> passNumArr = new ArrayList<Integer>();

	public HomeWork3() {
		num1 = 0;
		num2 = 0;

	}

	public void toArray(int number) {

		String tmpArr = new String();
		tmpArr = Integer.toString(number);
		numberArr = new int[tmpArr.length()];

		for (int i = 0; i < tmpArr.length(); i++)
			numberArr[i] = tmpArr.charAt(i) - '0';
	}

	// 조건에 맞는 숫자들 제네레이트
	public void generate(int number) {

		toArray(number);
		int tmp;
		boolean chk = true;

		for (int i = 0; i < numberArr.length - 1; i++) {
			if (numberArr[i] >= numberArr[i + 1]) {
				chk = false;
				break;
			}
		}

		if (chk == true) {
			passNumArr.add(number);
		}
	}


	public void start() {
		// 배열 길이만큼 출력
		Scanner sc = new Scanner(System.in);
		int count = 0;

		System.out.print("Input 1st Number :  ");
		num1 = sc.nextInt();

		System.out.print("Input 2nd Number :  ");
		num2 = sc.nextInt();

		for (int i = num1; i <= num2; i++) {
			toArray(i);
			generate(i);
		}
		
		for (int i = 0; i < passNumArr.size(); i++) {
			if (i % 10 ==0)
				System.out.print(passNumArr.get(i) + "\n");
			else;
				System.out.print(passNumArr.get(i) + "\t");
		}
		System.out.println("");
		System.out.println("Count : " + passNumArr.size());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork3 home = new HomeWork3();
		home.start();
	}

}

import java.util.Arrays;

public class HomeWork2 {
	

	private int[] numberArr;
	
	public HomeWork2() {

		numberArr = new int[4];
		
	}
	
	public void toArray(int number) {
		
		String tmpArr = new String();		
		tmpArr = Integer.toString(number);
		
		for (int i =0; i <4; i++) 
			numberArr[i] = tmpArr.charAt(i) - '0'; 
	}
	
	public void sort() {
	
		int tmp;
		int zeroCount = 0;
		
		for (int i = 0; i <4; i++) {
			for (int j = i+1; j <4; j++) {
				if (numberArr[i] > numberArr[j]) {
					tmp = numberArr[i];
					numberArr[i] = numberArr[j];
					numberArr[j] = tmp;
				}
			}
		}
		
		// 첫번쨰 숫자가 0인 경우
		// 0의 개수를 센 뒤 그 다음 숫자를 가장 앞으로
		for (int i = 0; i <4; i++) {
			if (numberArr[i] ==0)
				zeroCount += 1;
		}

		
		if (numberArr[0] ==0) {
			tmp = numberArr[zeroCount];
			numberArr[0] = tmp;
			numberArr[zeroCount] = 0;
		}
	}
	
	public int returnInt() {
		
		int tmp=0;
		
		for (int i = 0; i < 4; i++) {
			tmp *= 10;
			tmp += numberArr[i];
		}
		
		return tmp;
	}
	

	public void start() {
		
		/*
		 *  1. 정렬하기 위해 숫자 데이터를 배열로 바꿈
		 *  2. 배열을 정렬함
		 *    - 내림차순 정렬 후, if 구문 써서 첫째자리수가 0인경우 0 두번째 큰숫자와 바꾸기
		 *  3. 배열을 다시 int 데이터로 바꿈
		 *  
		 *  
		 *  statt에서는 9999번 반복하기 input output 출력
		 */
		for (int i = 1000; i<10000; i++) {
			toArray(i);
			sort();
//			System.out.println(Arrays.toString(numberArr));
			System.out.println(i +  "\t" + returnInt());
		}		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork2 home = new HomeWork2();
		home.start();
	}

}


public class Sort01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {90,78,100,30,55};
		bubbleSort(data);
		
		for (int i:data)
		{
			System.out.print(i + "\t");
		}
	}

	static void bubbleSort(int[] data) {
		int tmp=0;
		int count =0;
		int count2 = 0;
		
		for(int i =0; i < data.length - 1; i++) {
			for (int j =0; j < data.length -1 - i; j++) {
					
				if (data[j] > data[j+1]) {
					tmp = data[j+1];
					data[j+1]	= data[j];
					data[j] = tmp;
					count++;
				}	
				count2++;
			}	
		}
		System.out.println("바꾼횟수 : " + count);		
		System.out.println("반복문 돌린 횟수 : " + count2);
	}
}

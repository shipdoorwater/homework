import java.util.Arrays;
import java.util.Random;

public class Sort02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = new int[1000];
		Random random = new Random();

		for (int i = 0; i < 1000; i++) {
			data[i] = random.nextInt(1000);
		}
//		System.out.println(Arrays.toString(data));

		insertionSort(data, 1000);


		for (int i = 0; i <= 998; i++) {
			if (data[i] > data[i + 1])
				System.out.println("Error");
			System.out.println(data[i]);
		}

	}

	static void insertionSort(int[] data, int n) {

		for (int i = 0; i < 999; i++) {
			if (data[i] <= data[i + 1])
				continue;
			else {
				swap(i, i+1, data);
				for (int j = i; j > 0; j--) {
					if (data[j] < data[j - 1])
						swap(j, j - 1, data);
					else break;
				}
			}
		}
	}

	static void swap(int i, int j, int[] data) {
		int tmp = data[j];
		
		data[j] = data[i];
		data[i] = tmp;
	}

}

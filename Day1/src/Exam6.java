public class Exam6 {

	public static void main(String[] args) {

		int i = 1;
		int temp =0;
		while (i >= 0) {

			int j;
			switch (i) {
			case 1:
				j = 2;
				break;
			case 3:
				j = 1;
				break;
			case 5:
				j = 0;
				break;
			default: j = 0;
			}

			while (j >= 1) {
				System.out.print(" ");
				j--;
			}

			System.out.print("*".repeat(i));

			if (i < 5 && temp == 0) {
				i += 2;
			} else {
				i -= 2;
			}
			
			if (i == 5) {
				temp = 1;			
			}

			System.out.println();
		}

	}

}

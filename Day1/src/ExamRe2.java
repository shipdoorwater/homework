
public class ExamRe2 {
	public static void main(String[] args) {

		int space = 2;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				int num = Math.abs(j - 3);

				if (num > 2 - space) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();

			if (i <= 2) {
				space--;
			} else {
				space++;
			}
		}
	}

}

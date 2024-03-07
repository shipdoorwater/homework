
public class Exam4 {

	public static void main(String[] args) {

		String a = "*";

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j - i <= 2 ; j++) {
				if (i + j <=3  ) {
					System.out.print(" ");
				} else {
					System.out.print(a);
				}
			}
			System.out.println();
		}
	}
}

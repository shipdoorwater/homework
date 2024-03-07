
public class Exam3_new {

	public static void main(String[] args) {

		String a = "*";

		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= 1; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print(a);
				}
			}
			System.out.println();
		}
	}
}

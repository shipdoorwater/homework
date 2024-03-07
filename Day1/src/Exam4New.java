
public class Exam4New {

	public static void main(String[] args) {

		String a = "*";

		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j > i ; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2 -1; j++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}

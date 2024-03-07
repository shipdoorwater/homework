import java.util.Scanner;

public class ExamRe {

	public static void main(String[] args) {

		Scanner sc;
		sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("홀수만 입력");
		} else {

			for (int i = 1; i <= num / 2 + 1; i++) {
				for (int j = num / 2; j >= i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = 1; i <= num / 2; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = num - 2 * i; j >= 1; j--) {
					System.out.print("*");
				}
				System.out.println();
			}

		}

	}

}

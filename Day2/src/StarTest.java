import java.util.Scanner;

public class StarTest {

	public static void main(String[] args) {

		// 입력: 1~5 숫자 / 계속하시겠습니까 char

		Scanner sc = new Scanner(System.in);
		StarTest starTest = new StarTest();

		char que;

		do {
			int num;

			System.out.print("숫자 1 ~ 5 중 입력하세요");
			num = starTest.inputNum(sc);

			switch (num) {
			case 1:
				starTest.star1();
				break;
			case 2:
				starTest.star2();
				break;
			case 3:
				starTest.star3();
				break;
			case 4:
				starTest.star4();
				break;
			case 5:
				starTest.star5();
				break;
			default:
				System.out.println("입력오류");
			}

			System.out.println("계속 하시겠습니까?");
			que = starTest.inputChar(sc);

		} while (que == 'Y' || que == 'y');

		System.out.println("종료되었습니다");
	}

	// 입력함수
	public int inputNum(Scanner sc) {
		int num = sc.nextInt();
		return num;
	}

	public char inputChar(Scanner sc) {
		char que = sc.next().charAt(0);
		return que;
	}

	// 별함수 1 ~5

	public void star1() {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star2() {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star3() {

		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= 1; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void star4() {

		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star5() {

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

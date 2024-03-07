import java.util.Scanner;

public class CalculaterUp {

	public static void main(String[] args) {

		System.out.print("첫 번째 수 :");
		int num1 = CalculaterUp.inputNum1();

		System.out.print("기호 :");
		char cal = CalculaterUp.inputCal();

		System.out.print("두 번째 수 :");
		int num2 = CalculaterUp.inputNum2();

		System.out.print("결과 :");
		CalculaterUp.output(cal, num1, num2);

	}

	public static int inputNum1() {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		return num1;
	}

	public static int inputNum2() {
		Scanner sc = new Scanner(System.in);
		int num2 = sc.nextInt();

		return num2;
	}

	public static char inputCal() {
		Scanner sc = new Scanner(System.in);
		char cal = sc.next().charAt(0);

		return cal;
	}

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiple(int num1, int num2) {
		return num1 * num2;
	}

	public static double divide(int num1, int num2) {
		return ((double)num1 / num2);
	}

	public static void output(char cal, int num1, int num2) {
		switch (cal) {
		case '+':
			System.out.println(CalculaterUp.plus(num1, num2));
			break;
		case '-':
			System.out.println(CalculaterUp.minus(num1, num2));
			break;
		case '*':
			System.out.println(CalculaterUp.multiple(num1, num2));
			break;
		case '/':
			System.out.println(CalculaterUp.divide(num1, num2));
			break;
		default:
			System.out.println("입력오류");
		}

	}
}

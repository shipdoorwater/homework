import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {

		double result = 0;
		char que;

		Scanner sc = new Scanner(System.in);

		Calculater calculater = new Calculater();
		
		do {
		// 입력함수
		int num1 = calculater.inputNum(sc);
		char cal = calculater.inputCal(sc);
		int num2 = calculater.inputNum(sc);

		// 연산함수 호출
		switch (cal) {
		case '+':
			result = calculater.plus(num1, num2);
			break;
		case '-':
			result = calculater.minus(num1, num2);
			break;
		case '*':
			result = calculater.multiple(num1, num2);
			break;
		case '/':
			result = calculater.divide(num1, num2);
			break;
		}

		// 출력함수 호출
		calculater.output(cal, num1, num2, result);
		
		System.out.println("계산을 계속하시겠습니까?");
		que = calculater.inputCal(sc);
		} while (que == 'y' || que == 'Y');
		
		System.out.println("종료되었습니다");
	}

	public int inputNum(Scanner sc) {
		int num = sc.nextInt();
		return num;
	}

	public char inputCal(Scanner sc) {
		char cal = sc.next().charAt(0);
		return cal;
	}

	public double plus(int num1, int num2) {
		return num1 + num2;
	}

	public double minus(int num1, int num2) {
		return num1 - num2;
	}

	public double multiple(int num1, int num2) {
		return num1 * num2;
	}

	public double divide(int num1, int num2) {
		return (double)num1 / num2;
	}

	public void output(char cal, int num1, int num2, double result) {
		if (result%1 != 0) {
			System.out.println(num1 + "" + cal + "" + num2 + "=" + result);
		} else {
			System.out.println(num1 + "" + cal + "" + num2 + "=" + (int) result);
		}
	}

}

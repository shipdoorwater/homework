import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char q;
		do {
			int num1 = sc.nextInt();
			System.out.println("첫 번째 수 입력 : " + num1);

			char cal = sc.next().charAt(0);
			System.out.println("연산 입력 : " + cal);

			int num2 = sc.nextInt();
			System.out.println("두 번째 수 입력 : " + num2);

			switch (cal) {
			case '+': System.out.println(num1 + num2); break;
			case '-':  System.out.println(num1 - num2); break;
			case '*': System.out.println(num1 * num2); break;
			case '/':	System.out.println((double) num1 / num2);break;
			default:	System.out.println("잘못된 입력");
			}
			System.out.println("다시 계산합니까?");
			q = sc.next().charAt(0);
		} while (q == 'y' || q == 'Y');

		System.out.println("종료되었습니다");

	}
}

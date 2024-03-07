import java.util.Scanner;

public class TestIF2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		String cal = sc.next();
		int num2 = sc.nextInt();

		if (cal.equals("+")) {
			System.out.println(num1 + "" + cal + "" + num2 + "=" + (num1 + num2));
		} else if (cal.equals("-")) {
			System.out.println(num1 + "" + cal + "" + num2 + "=" + (num1 - num2));
		} else if (cal.equals("*")) {
			System.out.println(num1 + "" + cal + "" + num2 + "=" + (num1 * num2));
		} else if (cal.equals("/")) {
			System.out.println(num1 + "" + cal + "" + num2 + "=" + ((double) num1 / num2));
		} else {
			System.out.println("잘못된 입력");
		}

	}

}

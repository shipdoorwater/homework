import java.util.Scanner;

public class Class_Calculator {

	// 필드;
	private int num1;
	private int num2;
	private String op;
	private double result;

	Scanner sc = new Scanner(System.in);

	// 생성자;

	public Class_Calculator() {
	
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Class_Calculator cal = new Class_Calculator();
		char que;

		do {
			cal.input();
			cal.calculate();
			cal.disp();

			System.out.println("계속 하시겠습니까?");
			que = sc.next().charAt(0);
		} while (que == 'y' || que == 'Y');
		System.out.println("종료되었습니다");
	}

	public void input() {
		
		System.out.print("첫번째 숫자: ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();
		System.out.print("기호 :");
		op = sc.next();
	}

	public void calculate() {
		
		switch (op) {
		case "+":
			result = (double) num1 + num2;
			break;
		case "-":
			result = (double) num1 - num2;
			break;
		case "*":
			result = (double) num1 * num2;
			break;
		case "/":
			result = (double) num1 / num2;
			break;
		default:
			System.out.println("기호를 잘못 입력하였습니다");
		}
	}

	public void disp() {

		if (result % 1 == 0) {
			System.out.println(num1 + op + num2 + "의 결과는" + (int) result + "입니다");
		} else {
			System.out.println(num1 + op + num2 + "의 결과는" + result + "입니다");
		}
	}

//	public Scanner getSc() {
//		return sc;
//	}
//
//	public void setSc(Scanner sc) {
//		this.sc = sc;
//	}
//	
//	

}

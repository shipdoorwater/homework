
import java.util.Scanner;

public class TestSwitch {

	public static void main (String []args) {
		
		/* 사칙연산계산기 ( + , - , * , /)
		 * 3 + 4 = 7
		 */
		Scanner sc;
		sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		char cal = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		System.out.println("첫 번째 수 입력 : " + num1);
		System.out.println("연산 입력 : " + cal);
		System.out.println("두 번째 수 입력 : " + num2);		
		
		
		switch (cal) {
			case '+' : 
				System.out.println(num1 + num2);
				break;
			case '-' :
				System.out.println(num1 - num2);
				break;
			case '*' :
				System.out.println(num1 * num2);
				break;
			case '/' :
				System.out.println((double)num1 / num2);
				break;
			default:
				System.out.println("잘못된 입력");
		}
		
				
					
		}
		
}


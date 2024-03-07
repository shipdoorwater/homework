
import java.util.Scanner;

public class TestIF {
	public static void main (String []args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println(a + "가 크다");
		} else if (a < b) {
			System.out.println(b + "가 크다");
		} else {
			System.out.println(a + "과 " + b + "는 같다");
		}
		
		
	}
	
	
}

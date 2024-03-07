// 패키지
// 임포트
// import java.lang.*; default

import java.util.Scanner;

public class Hello {
	public static void main(String []args) {  // 프로그램을 시작해주고 끝내줌

		Scanner sc;
		sc = new Scanner(System.in);
		
//		System.out.println("Hello");
//		System.out.println(333);
//		
//		System.out.print("Hello" + 333);
//		System.out.print(333);
		
		String str = sc.next();
		int num = sc.nextInt();
		
		System.out.println(str);
		System.out.println(num);
	}
}

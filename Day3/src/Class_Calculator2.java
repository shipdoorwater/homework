import java.util.Scanner;

public class Class_Calculator2 {

	// 필드;
	private int num1, num2;
	private char op;
	private char ans;

	// 생성자;

	public Class_Calculator2() {
	
	}
	
	public Class_Calculator2(int n1, char c, int n2) {
		this.num1 = n1;
		this.op = c;
		this.num2 = n2;
	}

	
	// Setter
	public void setNum1 (int n) {
		num1 = n;
	}
	public void setNum2 (int n) {
		num2 = n;
	}
	public void setOp (char c) {
		op = c;
	}
	public void setAns (char c) {
		ans = c;
	}
	
	// Getter
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	public int getOp() {
		return op;
	}
	public int getAns() {
		return ans;
	}
	
	// 사칙연산
	public void plus(int n1, int n2) {
		System.out.println(n1 + n2); 
	}
	public void minus(int n1, int n2) {
		System.out.println(n1 - n2); 
	}
	public void multiple(int n1, int n2) {
		System.out.println(n1 * n2); 
	}
	public void divide(int n1, int n2) {
		System.out.println((double)n1 / n2); 
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Class_Calculator2 calc = new Class_Calculator2();
		
		do {
			calc.setNum1(sc.nextInt());
			calc.setOp(sc.next().charAt(0));
			calc.setNum2(sc.nextInt());
			
			switch (calc.getOp()) {
			case '+' : calc.plus(calc.getNum1(), calc.getNum2()); break;
			case '-' : calc.minus(calc.getNum1(), calc.getNum2()); break;
			case '*' : calc.multiple(calc.getNum1(), calc.getNum2()); break;
			case '/' : calc.divide(calc.getNum1(), calc.getNum2()); break;
			default : System.out.println("기호를 잘못 입력하였습니다");
			}
			System.out.print("계속하시겠습니까?");
			calc.setAns(sc.next().charAt(0));
		} while (calc.getAns() == 'y' || calc.getAns() == 'Y' );
		
		System.out.println("종료되었습니다");
	}

}

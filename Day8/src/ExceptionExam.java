import java.util.*;

public class ExceptionExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try { // 예상되는 예외를 인식

			int num = sc.nextInt();
			System.out.println(3 / num);
			
		} catch (ArithmeticException ae) { // 예외처리
			ae.printStackTrace();
		} catch (InputMismatchException in) {  // 예외처리를 여러개 쓴다
			System.out.println("제대로 입력해");
			return;  // OS로 돌아간다 (종료)
		} catch (Exception in2) {  // 모든 예외처리의 조상, 에외처리의 가장 마지막에 와야함
			System.out.println("제대로 입력해2"); 
		} finally {  // return이 있어도 finally 블록은 실행
			System.out.println("Bye"); 
		}
	}
}


public class ArithmeticExceptionTest {
	public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            // 0으로 나누려고 할 때 ArithmeticException이 발생합니다.
            int result = dividend / divisor; // 여기서 ArithmeticException이 발생합니다.
            System.out.println("나눈 결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException이 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

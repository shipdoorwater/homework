
public class IllegalArgumentExceptionTest {
	 public static void main(String[] args) {
	        try {
	            // 잘못된 인수를 전달하여 메소드를 호출합니다.
	            int result = divide(-10, 0); // 여기서 IllegalArgumentException이 발생합니다.
	            System.out.println("나눈 결과: " + result);
	        } catch (IllegalArgumentException e) {
	            System.out.println("IllegalArgumentException이 발생했습니다: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	    // 두 정수를 나누는 메소드입니다.
	    public static int divide(int dividend, int divisor) {
	        if (divisor == 0) {
	            // 0으로 나누는 경우에는 IllegalArgumentException을 던집니다.
	            throw new IllegalArgumentException("나누는 수는 0이 될 수 없습니다.");
	        }
	        return dividend / divisor;
	    }
}

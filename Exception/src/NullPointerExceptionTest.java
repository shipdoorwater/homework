
public class NullPointerExceptionTest {
	public static void main(String[] args) {
        String str = null;
        try {
            // null인 문자열 객체의 길이를 구하려고 할 때 NullPointerException이 발생합니다.
            int length = str.length(); // 여기서 NullPointerException이 발생합니다.
            System.out.println("문자열의 길이: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException이 발생했습니다.");
            e.printStackTrace();
        }
    }
}

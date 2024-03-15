
public class FormatException {
	public static void main(String[] args) {
        String str = "ABC";

        try {
            // 숫자로 변환할 수 없는 문자열을 정수로 변환하려고 할 때 NumberFormatException이 발생합니다.
            int number = Integer.parseInt(str); // 여기서 NumberFormatException이 발생합니다.
            System.out.println("숫자: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException이 발생했습니다.");
            e.printStackTrace();
        }
    }
}

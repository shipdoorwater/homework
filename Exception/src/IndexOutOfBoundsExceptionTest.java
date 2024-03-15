
public class IndexOutOfBoundsExceptionTest {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};

	        try {
	            // 배열의 인덱스를 벗어나는 값을 접근하려고 할 때 IndexOutOfBoundsException이 발생합니다.
	            int value = arr[5]; // 여기서 IndexOutOfBoundsException이 발생합니다.
	            System.out.println("배열의 다섯 번째 값: " + value);
	        } catch (IndexOutOfBoundsException e) {
	            System.out.println("IndexOutOfBoundsException이 발생했습니다.");
	            e.printStackTrace();
	        }
	    }
}

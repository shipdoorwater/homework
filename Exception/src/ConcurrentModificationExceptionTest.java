
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // 컬렉션을 순회하면서 동시에 수정을 시도합니다.
        new Thread(() -> {
            try {
                Iterator<Integer> iterator = numbers.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                    // 컬렉션을 순회하면서 값을 추가합니다.
                    numbers.add(4); // ConcurrentModificationException 발생 예정
                }
            } catch (Exception e) {
                System.out.println("예외가 발생했습니다: " + e.getMessage());
            }
        }).start();
    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionTest {
    public static void main(String[] args) {
        try {
            // 파일을 읽어오기 위한 BufferedReader를 생성합니다.
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            // 파일에서 한 줄씩 읽어와 출력합니다.
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // BufferedReader를 닫습니다.
            br.close();
        } catch (IOException e) {
            // IOException이 발생할 경우 예외 처리합니다.
            System.out.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

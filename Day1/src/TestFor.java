
public class TestFor {

	public static void main(String[] args) {

		int num = 0; // 접은횟수
		int i = 1; // 사각형개수

		for (i = 1; i < 500; i *= 2) {
			num++;
		}

		System.out.println("접은 횟수 : " + num);
		System.out.println("사각형 개수 : " + i);

	}
}

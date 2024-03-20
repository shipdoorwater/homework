import java.util.Random;
import java.util.*;

public class BaseBall01 {

	private int gameNum;
	private int strike;
	private int ball;
	private int count; // 몇 번만에 성공
	private String inputNumber; // 내 숫자 입력
	private int[] myNumber; // 내가 공격하는 숫자배열
	private int[] comNumber; // 컴퓨터가 방어하는 숫자배열

	public BaseBall01() {
		gameNum = 0;
		strike = 0;
		ball = 0;
		count = 0;
		inputNumber = new String();
		myNumber = new int[3];
		comNumber = new int[3];
	}

	public int[] comNumberSetting() {
		Random random = new Random();
		boolean chk;
		int temp[] = new int[3];

		for (int i = 0; i < 3; i++) {

			while (true) {
				temp[i] = random.nextInt(9);
				chk = false;

				// 중복되는 경우
				for (int j = 0; j < i; j++) {
					if (temp[i] == temp[j]) {
						chk = true;
						break;
					}

					// 중복되지 않는 경우
					if (temp[i] != temp[j])
						chk = false;
				}

				if (chk == false)
					break;
			}
		}
		return temp;
	}

	public void myNumberSetting(String s) {

		for (int i = 0; i < 3; i++) {
			myNumber[i] = s.charAt(i) - '0';
		}
	}

	public void countStrike() {
		strike = 0;

		for (int i = 0; i < 3; i++) {
			if (myNumber[i] == comNumber[i])
				strike += 1;
		}
	};

	public void countBall() {
		ball = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (myNumber[i] == comNumber[j] && i != j)
					ball += 1;
			}
		}
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);

		System.out.println("몇 게임 하실래요?");
		gameNum = sc.nextInt();

		for (int i = 0; i < gameNum; i++) {

			// 1. 컴퓨터가 방어하는 숫자 셋팅
			comNumber = comNumberSetting();
			System.out.println(Arrays.toString(comNumber));
			// 2. 게임 식작
			// 스트라이크가 세번 될 때 까지 게임은 끝나지 않음

			int perCount = 0;

			while (strike != 3) {
				// 내가 공격하는 숫자 셋팅
				System.out.println("Input three number :");
				myNumberSetting(sc.next());

				// 숫자 맟추기
				countStrike();
				countBall();

				System.out.println("Strike : " + strike + " / Ball : " + ball);
				perCount += 1;

				if (strike == 3) {
					System.out.println("성공 : " + perCount + "번만에 성공하셨습니다.");
					count += perCount;
				}
			}
			strike = 0; // 스트라이크 초기화
		}
		System.out.println("평균성공횟수 : " + count / gameNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseBall01 game = new BaseBall01();
		game.start();

	}
}

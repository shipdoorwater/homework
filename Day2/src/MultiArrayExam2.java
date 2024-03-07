
/*
 * 세 사람 성적처리프로그램
 * 입력: 이름, 국, 영, 수
 * 연산: 총점, 평균
 * 출력: 이름, 국, 영, 수, 총, 평
 */
import java.util.Scanner;

public class MultiArrayExam2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] name = new String[3];
		int[][] score = new int[3][4]; // 국, 영, 수, 총
		float[] avg = new float[3]; // 평균

		// 입력: 이름, 국, 영, 수

		for (int i = 0; i < 3; i++) {
			name[i] = sc.next();
			for (int j = 0; j < 3; j++) {
				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j]; // score[0][3] = score[0][3] + score[0][0]
			}

			avg[i] = score[i][3] / 3.f;
		}

		// 출력: 이름, 국, 영, 수, 총, 평

		for (int student = 0; student < 3; student++) {
			System.out.print("학생: " + name[student] + "\t");
			for (int sco : score[student]) {
				System.out.print(sco + "\t");
			}
			System.out.print("평균:" + avg[student] + "\n");

		}

	}

}

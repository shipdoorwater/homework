
/*
 * 세 사람 성적처리프로그램
 * 입력: 이름, 국, 영, 수
 * 연산: 총점, 평균
 * 출력: 이름, 국, 영, 수, 총, 평
 */
import java.util.Scanner;

public class TestF {

	public static void main(String[] args) {

		TestF testF = new TestF();
		Scanner sc = new Scanner(System.in);

		System.out.println("몇 명의 성적을 관리합니까?");

		int num = testF.inputInt(sc);

		String[] name = new String[num];
		int[][] score = new int[num][4]; // 국, 영, 수, 총
		float[] avg = new float[num]; // 평균

		// 출력: 이름, 국, 영, 수, 총, 평

		name = testF.outName(num, sc, name);
		score = testF.outScore(num, sc, score);
		avg = testF.outAvg(num, score, avg);
		
//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//
//		System.out.println(score[0][2]);
//
//		System.out.println(score[0][3]);


		for (int student = 0; student < num; student++) {
			System.out.print("학생: " + name[student] + "\t");
			for (int sco : score[student]) {
				System.out.print(sco + "\t");
			}
			System.out.print("평균:" + avg[student] + "\n");
		}		

	}

	public int inputInt(Scanner sc) {

		return sc.nextInt();
	}

	public String inputString(Scanner sc) {

		return sc.next();

	}

	public String[] outName(int num, Scanner sc, String[] name) {

		for (int i = 0; i < num; i++) {
			name[i] = sc.next();
			
		}
		return name;
	}

	public int[][] outScore(int num, Scanner sc, int[][] score) {

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < 3; j++) {
				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j];
				
			}
		}
		return score;	
	}

	public float[] outAvg(int num, int[][] score, float[] avg) {

		for (int i = 0; i < num; i++) {
			avg[i] = score[i][3] / 3.f;
		}

		return avg;
	}
}

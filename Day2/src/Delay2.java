import java.util.Scanner;

public class Delay2 {
	public static void main(String[] args) {
		System.out.println("몇 명의 성적을 관리합니까?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] name = new String[num];
		int[][] score = new int[num][4]; // 국, 영, 수, 총
		float[] avg = new float[num]; // 평균
		
		inputStudent(sc, num, name, score, avg);
		disp(num, name, score, avg);
	}

	// 학생들의 이름, 국, 영, 수 정보 입력
	// 평균은 총점 / 3
	public static void inputStudent(Scanner sc, int num, String[] name, int[][] score, float[] avg) {
		for (int i = 0; i < num; i++) {
			name[i] = sc.next();
			for (int j = 0; j < 3; j++) {
				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j];
			}
			avg[i] = (score[i][3]) / 3.f;
		}
	}

	// 출력
	public static void disp(int num, String[] name, int[][] score, float[] avg) {
		for (int student = 0; student < num; student++) {
			System.out.print("학생: " + name[student] + "\t");
			for (int sco : score[student]) {
				System.out.print(sco + "\t");
			}
			System.out.print("평균:" + avg[student] + "\n");
		}
	}

}

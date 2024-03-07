/*
 * 한 사람 성적처리프로그램
 * 입력: 이름, 국, 영, 수
 * 연산: 총점, 평균
 * 출력: 이름, 국, 영, 수, 총, 평
 */

import java.util.Scanner;

public class ArrayExamTeacher {
	
	public static void main(String[] args) {
	
		String name;
		int score[] = new int[4]; // 국, 영, 수, 총
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		// 입력: 이름, 국, 영, 수
		name = sc.next();
		
		for (int i = 0 ; i < 3 ; i++) {
			score[i] = sc.nextInt();
			score[3] += score[i];
		}
		
		// 연산: 총점, 평균
		
//		for (int i = 0; i < 3; i++) {
//			score[3] += score[i];
//		}

//		avg = (float) score[3] / 3;
		avg = score[3] / 3.f;
		
		// 출력 : 이름, 국어, 영어, 수학, 총점, 평균
		
		System.out.println("이름: " + name);
//		System.out.println("국어: " + score[0] +" / 영어: " + score[1] + " / 수학:" + score[2] + " / 총점: " + score[3] + "/ 평균: " + avg);
		for (int j:score) {
			System.out.println(j);
		}
		System.out.print(avg);
	}
}

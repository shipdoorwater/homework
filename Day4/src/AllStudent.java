import java.util.*;

public class AllStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생은 몇 명입니까?");
		int num = sc.nextInt();
		

		HasACalc[] stu = new HasACalc[num];
		
		// 사람 이름 입력
		for (int i = 0; i < num; i++) {
			stu[i] = new HasACalc();
			
			System.out.println("이름을 입력하세요:");
			stu[i].setName(sc.next());		
			
			System.out.println("국어점수를 입력하세요:");
			stu[i].setKor(sc.nextInt());
			
			System.out.println("수학점수를 입력하세요:");
			stu[i].setMat(sc.nextInt());
			
			System.out.println("영어점수를 입력하세요:");
			stu[i].setEng(sc.nextInt());
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print("이름 : " + stu[i].getName() + "\t");
			System.out.print("국어 : " + stu[i].getKor() + "\t");
			System.out.print("수학 : " + stu[i].getMat() + "\t");
			System.out.print("영어 : " + stu[i].getEng() + "\t");
			System.out.print("총점 : " + stu[i].getTotal() + "\t");
			System.out.print("평균 : " + stu[i].getAvg() + "\n");
		}		
	}
}

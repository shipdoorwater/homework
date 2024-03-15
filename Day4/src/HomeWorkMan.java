import java.util.Scanner;

public class HomeWorkMan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice; // 메뉴선택
		int num; // 학생번호선택
		String nameSubject; // 과목선택
		String nameStudent; // 학생이름선택
		int modScore; // 점수 입력
		String yesOrNO; // 계속선택
		System.out.println("몇 명의 성적을 관리합니까");
		Homework[] master = new Homework[sc.nextInt()];
		do {
			System.out.println("메뉴를 입력하세요");
			System.out.println("1. 성적 입력 \t 2. 성적수정 \t 3. 성적 검색 \t 4. 성적출력");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // 성적 입력 클래스
				for (int i = 0; i < master.length; i++) {
					master[i] = new Homework();
					System.out.print("이름 입력:");
					master[i].setName(sc.next());
					System.out.print("국어 입력:");
					master[i].setKor(sc.nextInt());
					System.out.print("수학 입력:");
					master[i].setMat(sc.nextInt());
					System.out.print("영어 입력:");
					master[i].setEng(sc.nextInt());
					master[i].setTotal();
					master[i].setAvg();
				}
				;
				break;
			case 2: // 성적 수정 클래스
				System.out.println("어떤 학생을 수정합니까? (숫자입력)");
				for (int i = 0; i < master.length; i++) {
					System.out.print((i + 1) + "번." + master[i].getName() + "\n");
				}
				;
				num = sc.nextInt();
				System.out.println("국어 / 수학 / 영어 중 입력하세요");
				nameSubject = sc.next();
				System.out.println("점수를 재입력하세요");
				modScore = sc.nextInt();
				switch (nameSubject) {
				case "국어":
					master[num - 1].setKor(modScore);
					break;
				case "수학":
					master[num - 1].setKor(modScore);
					break;
				case "영어":
					master[num - 1].setKor(modScore);
					break;
				}
				master[num - 1].setTotal();
				master[num - 1].setAvg();
				System.out.println("수정완료");
				break;
			case 3: // 성적 검색 클래스
				System.out.println("1번. 학생이름검색 /  2번. 평균점수검색");
				num = sc.nextInt();
				switch (num) {
				case 1:
					System.out.println("어떤 학생을 검색합니까? (이름입력)");
					nameStudent = sc.next();
					for (int i = 0; i < master.length; i++) {
						if (master[i].getName().equals(nameStudent)) {
							System.out.print((i + 1) + "번 학생 : " + master[i].getName() + "\t");
							System.out.print("국어 : " + master[i].getKor() + "\t");
							System.out.print("수학 : " + master[i].getMat() + "\t");
							System.out.print("영어 : " + master[i].getEng() + "\t");
							System.out.print("총점 : " + master[i].getTotal() + "\t");
							System.out.print("평균 : " + master[i].getAvg() + "\n");
						}
					}
					;
					break;
				case 2:
					System.out.println("평균점수 몇 점 이상을 검색합니까? (점수입력)");
					modScore = sc.nextInt();
					for (int i = 0; i < master.length; i++) {
						if (master[i].getAvg() >= (double) modScore) {
							System.out.print((i + 1) + "번 학생 : " + master[i].getName() + "\t");
							System.out.print("국어 : " + master[i].getKor() + "\t");
							System.out.print("수학 : " + master[i].getMat() + "\t");
							System.out.print("영어 : " + master[i].getEng() + "\t");
							System.out.print("총점 : " + master[i].getTotal() + "\t");
							System.out.print("평균 : " + master[i].getAvg() + "\n");
						}
					}
					break;
				}
				break;
			case 4: // 성적 출력 클래스
				for (int i = 0; i < master.length; i++) {
					System.out.print((i + 1) + "번 학생 : " + master[i].getName() + "\t");
					System.out.print("국어 : " + master[i].getKor() + "\t");
					System.out.print("수학 : " + master[i].getMat() + "\t");
					System.out.print("영어 : " + master[i].getEng() + "\t");
					System.out.print("총점 : " + master[i].getTotal() + "\t");
					System.out.print("평균 : " + master[i].getAvg() + "\n");
				}
				break;
			default:
				System.out.println("1~4 중 하나를 입력하세요");
			}
			System.out.println("계속 하시겠습니까?");
			yesOrNO = sc.next();
		} while (yesOrNO.equals("Y") || yesOrNO.equals("y"));
		System.out.println("종료되었습니다");
	}

}

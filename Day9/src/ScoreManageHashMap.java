import java.util.*;

public class ScoreManageHashMap {

	private HashMap<String, StudentScoreMap> stuMap = new HashMap<String, StudentScoreMap>();

	public static void main(String[] args) {

		ScoreManageHashMap sml = new ScoreManageHashMap();

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1.성적입력 \t 2. 성적수정 \t 3.성적삭제 \t 4.성적출력");
			System.out.println("----------------------------------------------------");

			switch (sc.nextInt()) {

			case 1:
				try {
					sml.inputStudent();
					break;
				} catch (InputMismatchException e) {
				}
				break;

			case 2:
				System.out.println("1. 국어성적 \t 2. 수학성적 \t 3. 영어성적");
				System.out.println("--------------------------------------------------");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("변경하고자하는 이름과 수정점수를 입력하세요");
					sml.modifyKor(sc.next(), sc.nextInt());
					;
					break;
				case 2:
					System.out.println("변경하고자하는 이름과 수정점수를 입력하세요");
					sml.modifyMat(sc.next(), sc.nextInt());
					break;
				case 3:
					System.out.println("변경하고자하는 이름과 수정점수를 입력하세요");
					sml.modifyEng(sc.next(), sc.nextInt());
					break;
				}
				break;

			case 3:
				System.out.println("이름 검색하여 삭제");
				System.out.println("----------------");
				try {
					sml.stuMap.remove(sc.next());
				} catch (InputMismatchException e) {
					System.out.println("잘못 입력하였습니다");
				}
				break;

			case 4:
				System.out.println("1.전체 출력 \t 2.검색 출력");
				System.out.println("-------------------------");
				switch (sc.nextInt()) {
				case 1:
					sml.dispStudent();
					break;
				case 2:
					sml.dispStudent(sc.next());
					break;
				}
				break;
			}
		} while (true);
	}

	void inputStudent() {

		Scanner sc = new Scanner(System.in);

		String name = new String();
		StudentScoreMap score = new StudentScoreMap();
		System.out.print("이름 입력 : ");
		name = sc.next();

		System.out.print("국어점수 입력 : ");
		score.setKor(sc.nextInt());
		System.out.print("수학점수 입력 : ");
		score.setMat(sc.nextInt());
		System.out.print("영어점수 입력 : ");
		score.setEng(sc.nextInt());
		score.setTotal();
		score.setAvg();

		stuMap.put(name, score);
	}

	// 성적 수정 -> 국어, 수학, 영어
	void modifyKor(String name, int scoreChange) {
		StudentScoreMap score = new StudentScoreMap();
		score = stuMap.get(name);
		score.setKor(scoreChange);
		score.setTotal();
		score.setAvg();

		stuMap.replace(name, score);
	}

	void modifyMat(String name, int scoreChange) {
		StudentScoreMap score = new StudentScoreMap();
		score = stuMap.get(name);
		score.setMat(scoreChange);
		score.setTotal();
		score.setAvg();

		stuMap.replace(name, score);
	}

	void modifyEng(String name, int scoreChange) {
		StudentScoreMap score = new StudentScoreMap();
		score = stuMap.get(name);
		score.setEng(scoreChange);
		score.setTotal();
		score.setAvg();

		stuMap.replace(name, score);
	}
	
	
	// 전체 학생 출력 및 검색
	void dispStudent() {
		for (Map.Entry<String, StudentScoreMap> entry : stuMap.entrySet()) {
			String key = entry.getKey();
			StudentScoreMap value = entry.getValue();
			System.out.println("이름 : " + key + "\t" + value.toString());
		}
	}
	
	void dispStudent(String name) {
		StudentScoreMap score = stuMap.get(name);
		System.out.print("이름 : \t" + name + "\t");
		System.out.print("국어 : \t" + score.getKor() + "\t");
		System.out.print("수학 : \t" + score.getMat() + "\t");
		System.out.print("영어 : \t" + score.getEng() + "\t");
		System.out.print("총점 : \t" + score.getTotal() + "\t");
		System.out.print("평균 : \t" + score.getAvg() + "\n");
	}
}

import java.util.*;

public class ScoreManageSet {

	private HashSet<StudentDataSet> stuSet = new HashSet<StudentDataSet>(10);

	public static void main(String[] args) {

		ScoreManageSet sml = new ScoreManageSet();

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
				System.out.println("1. 이름 \t 2. 국어성적 \t 3. 수학성적 \t 4. 영어성적");
				System.out.println("--------------------------------------------------");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("변경하고자하는 이름과 변경할 이름을 입력하세요");
					sml.modifyName(sc.next(), sc.next());
					break;
				case 2:
					System.out.println("변경하고자하는 이름과 수정점수를 입력하세요");
					sml.modifyKor(sc.next(), sc.nextInt());
					;
					break;
				case 3:
					System.out.println("변경하고자하는 이름과 수정점수를 입력하세요");
					sml.modifyKor(sc.next(), sc.nextInt());
					break;
				case 4:
					System.out.println("변경하고자하는 이름과 수정점수를 입력하세요");
					sml.modifyKor(sc.next(), sc.nextInt());
					break;
				}

				break;

			case 3:
				System.out.println("이름 검색하여 삭제");
				System.out.println("----------------");
				try {
					sml.deleteStudent(sc.next());
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
		// 원하는 인덱스에 데이터를 입력한다
		// 입력하고자 하는 인덱스가 없는 경우

		Scanner sc = new Scanner(System.in);

		StudentDataSet tmpStu = new StudentDataSet();
		System.out.print("이름 입력 : ");
		tmpStu.setName(sc.next());
		System.out.print("국어점수 입력 : ");
		tmpStu.setKor(sc.nextInt());
		System.out.print("수학점수 입력 : ");
		tmpStu.setMat(sc.nextInt());
		System.out.print("영어점수 입력 : ");
		tmpStu.setEng(sc.nextInt());
		tmpStu.setTotal();
		tmpStu.setAvg();

		stuSet.add(tmpStu);
	}

	void modifyName(String name, String nameChange) {
		// 이름에 맞는 데이터를 찾는다.
		Iterator<StudentDataSet> it = stuSet.iterator();
		while (it.hasNext()) {
			StudentDataSet stu = (StudentDataSet) it.next();
			if (stu.getName().equals(name))
				stu.setName(nameChange);
		}
	}

	void modifyKor(String name, int scoreChange) {
		// 이름에 맞는 데이터를 찾는다.
		Iterator<StudentDataSet> it = stuSet.iterator();
		while (it.hasNext()) {
			StudentDataSet stu = (StudentDataSet) it.next();
			if (stu.getName().equals(name))
				stu.setKor(scoreChange);
			stu.setTotal();
			stu.setAvg();
		}
	}

	void modifyMat(String name, int scoreChange) {
		// 이름에 맞는 데이터를 찾는다.
		Iterator<StudentDataSet> it = stuSet.iterator();
		while (it.hasNext()) {
			StudentDataSet stu = (StudentDataSet) it.next();
			if (stu.getName().equals(name))
				stu.setMat(scoreChange);
			stu.setTotal();
			stu.setAvg();
		}
	}

	void modifyEng(String name, int scoreChange) {
		// 이름에 맞는 데이터를 찾는다.
		Iterator<StudentDataSet> it = stuSet.iterator();
		while (it.hasNext()) {
			StudentDataSet stu = (StudentDataSet) it.next();
			if (stu.getName().equals(name)) {
				stu.setEng(scoreChange);
				stu.setTotal();
				stu.setAvg();
			}
		}
	}

	void deleteStudent(String name) {

		Iterator<StudentDataSet> it = stuSet.iterator();
		while (it.hasNext()) {
			if (it.next().getName().equals(name)) {
				it.remove();
			}
		}
	}

	void disp(StudentDataSet stu) {
		System.out.print("이름 : \t" + stu.getName() + "\t");
		System.out.print("국어 : \t" + stu.getKor() + "\t");
		System.out.print("수학 : \t" + stu.getMat() + "\t");
		System.out.print("영어 : \t" + stu.getEng() + "\t");
		System.out.print("총점 : \t" + stu.getTotal() + "\t");
		System.out.print("평균 : \t" + stu.getAvg() + "\n");
	}

	void dispStudent() {
		for (StudentDataSet stu : stuSet) {
			disp(stu);
		}
	}

	void dispStudent(String name) {
		// 이름 검색 출력 선택출력
		Iterator<StudentDataSet> it = stuSet.iterator();
		while (it.hasNext()) {
			StudentDataSet stu = (StudentDataSet) it.next();
			if (stu.getName().equals(name))
				disp(stu);
		}

	}

}

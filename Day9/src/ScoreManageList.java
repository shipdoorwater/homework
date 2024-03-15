import java.util.*;

public class ScoreManageList {

	private ArrayList<StudentData> stuList = new ArrayList<StudentData>(10);
	
	// 1. 학생 입력
	//		1-1. 학생 이름과 성적을 입력 : InputStudent : StudentData 타입의 객체를 만들어서 ArrayList로 넣는다
	//			1-1-1. 맨마지막 입력 overriding
	//			1-1-2. index 수정 입력 overriding : ArrayList의 add 메서드를 써서 원하는 곳에 넣는다.
	//		
	// 2. 학생 성적 수정 : ModifyStudent : 기존 ArrayList에서 찾는데, 인덱스로 찾을 수 있고, 이름으로 찾을 수 있다.  -> 검색 메소드를 공통 사용할 수 있게 만들어서 수정, 출력, 삭제에 사용하자
	//		2-1. 선택 학생 수정    -------------------------------- 공통점: 선택 -> FindStudent :이름으로 찾기
	// 3. 학생 정보 삭제 : DeleteStudent 
	//		3-1. 선택 학생 출력 overriding ---------------------- 공통점: 선택
	// 4. 학생 성적 출력
	//		4-1. 전체 학생 출력 overriding ---------------------- 공통점: 선택
	//		4-2. 선택 학생 출력 overriding
	
	public static void main(String[] args) {
		
		ScoreManageList sml = new ScoreManageList();
		
		
		Scanner sc = new Scanner(System.in);
						
		do {
			System.out.println("1.성적입력 \t 2. 성적수정 \t 3.성적삭제 \t 4.성적출력");
			System.out.println("----------------------------------------------------");
			
			switch (sc.nextInt()) {
			
			case 1 : 
				System.out.println("1.마지막에 입력 \t 2.인덱스 입력");
				System.out.println("--------------------------------------");
				try {
					switch (sc.nextInt()) {
					case 1: sml.inputStudent(); break;
					case 2: sml.inputStudent(sc.nextInt()); break;
					default : System.out.println("잘못 입력하였습니다");
					} break;
				} catch(InputMismatchException e) {	
				}
				
					
			case 2 : 
				System.out.println("1. 이름 \t 2. 국어성적 \t 3. 수학성적 \t 4. 영어성적");
				System.out.println("--------------------------------------------------");
				sml.modifyStudent(sc.nextInt()); 
				break;
				
			case 3 :
				System.out.println("1.이름 검색하여 수정 \t 2.인덱스 수정");
				System.out.println("-----------------------------------");
				switch (sc.nextInt()) {
				case 1: sml.deleteStudent(sc.next()) ; break;
				case 2: sml.deleteStudent(sc.nextInt()); break;
				default : System.out.println("잘못 입력하였습니다");
				}
				break;
				
			case 4 :
				System.out.println("1.전체 출력 \t 2.검색 출력");
				System.out.println("-------------------------");
				switch (sc.nextInt()) {
				case 1: sml.dispStudent(); break;
				case 2:
					System.out.println("1.이름 검색하여 출력 \t 2.인덱스 출력");
					System.out.println("---------------------------------- ");
					switch(sc.nextInt()) {
					case 1: sml.dispStudent(sc.next()); break;
					case 2: sml.dispStudent(sc.nextInt()); break;
					} break;
				}
			}
		} while(true);
			
		
		
	}

	void inputStudent() {
		// 가장 마지막에 데이터를 입력한다
		int index= stuList.size();
		inputStudent(index);
	}
	
	void inputStudent(int index) {
		// 원하는 인덱스에 데이터를 입력한다
		// 입력하고자 하는 인덱스가 없는 경우
		if (index > stuList.size())
			System.out.println("학생 수가 그만큼 되지 않습니다.");
		else {
		Scanner sc = new Scanner(System.in);
		StudentData tmpStu = new StudentData();
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
		
		stuList.add(index, tmpStu);
		}
	}
//	
	int findStudent(String name) {
		// 이름에 맞는 인덱스를 검색한다
		
		for (StudentData stu : stuList) {
			if (stu.getName().equals(name))
					return stuList.indexOf(stu);
		}

		return -1;
	}
	
	StudentData duplicateStudent(int index) {
		// 학생정보를 복사한다
		StudentData tmpStu = new StudentData();
		
		tmpStu.setName(stuList.get(index).getName());
		tmpStu.setKor(stuList.get(index).getKor());
		tmpStu.setMat(stuList.get(index).getMat());
		tmpStu.setEng(stuList.get(index).getEng());
		tmpStu.setTotal();
		tmpStu.setAvg();
		
		return tmpStu;
	}
	
	void modifyName(int index, String name) {
		StudentData tmpStu = duplicateStudent(index);
	
		tmpStu.setName(name);
		stuList.set(index, tmpStu);
	}
	
	void modifyKor(int index, int score) {
		StudentData tmpStu = duplicateStudent(index);
		
		tmpStu.setKor(score);
		tmpStu.setTotal();
		tmpStu.setAvg();
		stuList.set(index, tmpStu);
	}
	
	void modifyMat(int index, int score) {
		StudentData tmpStu = duplicateStudent(index);
		
		tmpStu.setMat(score);
		tmpStu.setTotal();
		tmpStu.setAvg();
		stuList.set(index, tmpStu);
	}

	void modifyEng(int index, int score) {
		StudentData tmpStu = duplicateStudent(index);
		
		tmpStu.setEng(score);
		tmpStu.setTotal();
		tmpStu.setAvg();
		stuList.set(index, tmpStu);
	}
	
	void modifyStudent(int index) {
	
		int i =0;
		String name = "name";
		int score = 0;
		switch (i) {
		case 1 : modifyName(index, name); break;
		case 2 : modifyKor(index, score); break;
		case 3 : modifyMat(index, score); break;
		case 4 : modifyEng(index, score); break;
		default: System.out.println("잘못입력하였습니다");
		}	
	}
	
	void modifyStudent(String name) {
		int index = findStudent(name);
		
//		String message = (findStudent(name)<0)?"검색 된 결과가 없습니다":modifyStudent(index);
		modifyStudent(index);
	}
	
	void deleteStudent(int index) {
		stuList.remove(index);
	}

	void deleteStudent(String name) {
		int index = this.findStudent(name);
		deleteStudent(index);
	}
	
	void disp(StudentData stu) {
		System.out.print("이름 : \t" + stu.getName() + "\t");
		System.out.print("국어 : \t" + stu.getKor() + "\t");
		System.out.print("수학 : \t" + stu.getMat() + "\t");
		System.out.print("영어 : \t" + stu.getEng() + "\t");
		System.out.print("총점 : \t" + stu.getTotal() + "\t");
		System.out.print("푱균 : \t" + stu.getAvg() + "\n");
	}
	
	void dispStudent() {
		for (StudentData stu : stuList) {
			disp(stu);
		}
	}
	
	void dispStudent(int index) {
	// 선택출력	
		StudentData stu = stuList.get(index);
		disp(stu);
	}
	
	void dispStudent(String name) {
		// 이름 검색 출력 선택출력	
		int index = findStudent(name);
		
		StudentData stu = stuList.get(index);
		disp(stu);
	}
	
}


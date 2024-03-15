import java.util.*;

public class FullTime {

	private static int indexFull; // 전체 인덱스

	private int findIndex; // 검색용 인덱스

	private PersonalInfo[] personalInfo;
	private SalaryInfo[][] salaryInfo;

	Scanner sc = new Scanner(System.in);

	public FullTime() {
		// 초기화
		indexFull = 0;
		findIndex = 0;
		personalInfo = new PersonalInfo[100];
		salaryInfo = new SalaryInfo[100][12];
	}

	public void inputEmployInfo() {

		Scanner sc = new Scanner(System.in);

		System.out.println("몇 명의 정보를 입력합니까?");
		int tmp = sc.nextInt();
		int tmpIndex = indexFull;

		for (int i = tmpIndex; i < tmpIndex + tmp; i++) {
			personalInfo[i] = new PersonalInfo();

			System.out.print("이름 입력: ");
			personalInfo[i].setName(sc.next());

			System.out.print("직원번호 입력: ");
			personalInfo[i].setId(sc.next());

			System.out.print("직급 입력: ");
			personalInfo[i].setGrade(sc.next());

//			System.out.print("계약형태 입력(1: 정규직/2. 비정규직): ");
			personalInfo[i].setType("1");

			System.out.print("급여은행 입력: ");
			personalInfo[i].setBank(sc.next());

			System.out.print("급여계좌 입력: ");
			personalInfo[i].setAccount(sc.next());

			System.out.print("부서 입력: ");
			personalInfo[i].setDept(sc.next());

			System.out.print("성과등급 입력: ");
			personalInfo[i].setPerformGrade(sc.next());

			System.out.print("입사일 입력: ");
			personalInfo[i].setStartDate(sc.next());

			int change = Integer.parseInt(personalInfo[i].getStartDate().substring(0, 3));
			personalInfo[i].setWorkYear(2024 - change); // 근속연수 자동 입력

			personalInfo[i].setExitDate("9999-12-31"); // 퇴사일 자동 입력

			System.out.println("직원 기본정보 입력이 완료되었습니다.");

			indexFull++;
		}

		;
	}

//	public void printIndex() {
//		System.out.println(indexFull);
//	}

	public void inputSalaryInfo() {

		Scanner sc = new Scanner(System.in);

		findIndex();
		int i = findIndex;

		System.out.println("몇월 급여 정보를 입력합니까? (01 ~ 12 사이 입력)");
		String tmpMonth = sc.next();
		int monthDays = 0;
		int monthNumber = 0; // 0 ~ 11: 1월 ~ 12월

		switch (tmpMonth) {
		case "01":
			monthDays = 31;
			monthNumber = 0;
			break;
		case "02":
			monthDays = 28;
			monthNumber = 1;
			break;
		case "03":
			monthDays = 31;
			monthNumber = 2;
			break;
		case "04":
			monthDays = 30;
			monthNumber = 3;
			break;
		case "05":
			monthDays = 31;
			monthNumber = 4;
			break;
		case "06":
			monthDays = 30;
			monthNumber = 5;
			break;
		case "07":
			monthDays = 31;
			monthNumber = 6;
			break;
		case "08":
			monthDays = 31;
			monthNumber = 7;
			break;
		case "09":
			monthDays = 30;
			monthNumber = 8;
			break;
		case "10":
			monthDays = 31;
			monthNumber = 9;
			;
		case "11":
			monthDays = 30;
			monthNumber = 10;
			break;
		case "12":
			monthDays = 31;
			monthNumber = 11;
			break;
		default:
			System.out.println("다시 입력해주세요");
		}

		salaryInfo[i][monthNumber] = new SalaryInfo();

		System.out.println(
				"Index : " + (i + 1) + " / ID :  " + personalInfo[i].getId() + " / 직원명 : " + personalInfo[i].getName());

		salaryInfo[i][monthNumber].setId(personalInfo[i].getId()); // id 자동입력

		salaryInfo[i][monthNumber].setMonth(tmpMonth); // 근무월 자동입력

		System.out.println("휴가일자 입력 : ");
		salaryInfo[i][monthNumber].setVacDay(sc.nextInt());

		salaryInfo[i][monthNumber].setWorkDay(monthDays - salaryInfo[i][monthNumber].getVacDay()); // 근무일자: 월수 - 휴가일자

		System.out.println("시간외근무 입력 : ");
		salaryInfo[i][monthNumber].setOverTime(sc.nextInt());

		if (salaryInfo[i][monthNumber].getWorkDay() >= 10) {
			salaryInfo[i][monthNumber].setLunch("Y");
			salaryInfo[i][monthNumber].setTraffic("Y");
		} else {
			salaryInfo[i][monthNumber].setLunch("N");
			salaryInfo[i][monthNumber].setTraffic("N");
		}

	}

	public void findIndex() {

		for (int i = 0; i < indexFull; i++) {
			System.out.println("ID : " + personalInfo[i].getId() + " / 직원명 : " + personalInfo[i].getName());
		}

		System.out.println("ID를 입력하세요");
		String findName = sc.next(); // id임

		for (int j = 0; j < indexFull; j++) {
			if (personalInfo[j].getId().equals(findName)) {
				findIndex = j;
				break;
			}
		}
	}

	public void modifyPerson() {

		findIndex();

		int i = findIndex;

		System.out.println("어떤 정보를 수정합니까?");
		System.out.print("1번. 직원명" + "\t");
		System.out.print("2번. 직급" + "\t");
		System.out.print("3번. 급여은행" + "\t");
		System.out.print("4번. 급여계좌" + "\n");
		System.out.print("5번. 부서" + "\t");
		System.out.print("6번. 입사일자" + "\t");
		System.out.print("7번. 퇴사일자" + "\t");
		System.out.print("8번. 성과등급" + "\t");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			personalInfo[i].setName(sc.next());
			break;
		case 2:
			personalInfo[i].setGrade(sc.next());
			break;
		case 3:
			personalInfo[i].setBank(sc.next());
			break;
		case 4:
			personalInfo[i].setAccount(sc.next());
			break;
		case 5:
			personalInfo[i].setDept(sc.next());
			break;
		case 6:
			personalInfo[i].setStartDate(sc.next());
			break;
		case 7:
			personalInfo[i].setExitDate(sc.next());
			break;
		case 8:
			personalInfo[i].setPerformGrade(sc.next());
			break;
		default:
			;
		}
		System.out.println("수정이 종료되었습니다");
	}

	public void modifySalary() {

		dispEmploy2(); // 직원 안내

		findIndex();

		int i = findIndex;

		System.out.println("몇월 급여 정보를 입력합니까? (01 ~ 12 사이 입력)");
		String tmpMonth = sc.next();
		int monthDays = 0;
		int monthNumber = 0; // 0 ~ 11: 1월 ~ 12월

		switch (tmpMonth) {
		case "01":
			monthDays = 31;
			monthNumber = 0;
			break;
		case "02":
			monthDays = 28;
			monthNumber = 1;
			break;
		case "03":
			monthDays = 31;
			monthNumber = 2;
			break;
		case "04":
			monthDays = 30;
			monthNumber = 3;
			break;
		case "05":
			monthDays = 31;
			monthNumber = 4;
			break;
		case "06":
			monthDays = 30;
			monthNumber = 5;
			break;
		case "07":
			monthDays = 31;
			monthNumber = 6;
			break;
		case "08":
			monthDays = 31;
			monthNumber = 7;
			break;
		case "09":
			monthDays = 30;
			monthNumber = 8;
			break;
		case "10":
			monthDays = 31;
			monthNumber = 9;
			;
		case "11":
			monthDays = 30;
			monthNumber = 10;
			break;
		case "12":
			monthDays = 31;
			monthNumber = 11;
			break;
		default:
			System.out.println("다시 입력해주세요");
		}

		System.out.println("수정하고 싶은 데이터를 입력하세요.");
		System.out.println("1. 휴가일수");
		System.out.println("2. 시간외근무시간");
		System.out.println("이 외 데이터는 자동 수정됩니다.");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			int tmpVac = sc.nextInt();
			salaryInfo[i][monthNumber].setVacDay(tmpVac);
			salaryInfo[i][monthNumber].setWorkDay(monthDays - tmpVac);
			break;
		case 2:
			int tmpOver = sc.nextInt();
			salaryInfo[i][monthNumber].setOverTime(tmpOver);
			break;
		}
	}

	public void dispEmploy() {

		// 전직원 출력
		for (int i = 0; i < indexFull; i++) {
			System.out.print("Index: " + (i + 1) + "\t");
			System.out.print("ID: " + personalInfo[i].getId() + "\t");
			System.out.print("이름: " + personalInfo[i].getName() + "\t");
			System.out.print("직급: " + personalInfo[i].getGrade() + "\t");
			System.out.print("고용형태: " + personalInfo[i].getType() + "\t");
			System.out.print("급여은행: " + personalInfo[i].getBank() + "\n");
			System.out.print("급여계좌: " + personalInfo[i].getAccount() + "\t");
			System.out.print("부서: " + personalInfo[i].getDept() + "\t");
			System.out.print("입사일: " + personalInfo[i].getStartDate() + "\t");
			System.out.print("근속연수: " + personalInfo[i].getWorkYear() + "\t");
			System.out.print("퇴사일: " + personalInfo[i].getExitDate() + "\t");
			System.out.print("성과등급: " + personalInfo[i].getPerformGrade() + "\n");
		}
	}

	public void dispEmploy2() {

		findIndex();

		int i = findIndex;

		// 선택 출력

		System.out.println("Index: " + (i + 1));
		System.out.println("ID: " + personalInfo[i].getId());
		System.out.println("이름: " + personalInfo[i].getName());
		System.out.println("직급: " + personalInfo[i].getGrade());
		System.out.println("고용형태: " + personalInfo[i].getType());
		System.out.println("급여은행: " + personalInfo[i].getBank());
		System.out.println("급여계좌: " + personalInfo[i].getAccount());
		System.out.println("부서: " + personalInfo[i].getDept());
		System.out.println("입사일: " + personalInfo[i].getStartDate());
		System.out.println("근속연수: " + personalInfo[i].getWorkYear());
		System.out.println("퇴사일: " + personalInfo[i].getExitDate());
		System.out.println("성과등급: " + personalInfo[i].getPerformGrade());
	}

	public void dispSalary() {

		findIndex();

		// 해당인덱스의 월별 급여정보 출력
		System.out.println("ID : " + personalInfo[findIndex].getId() + " / 직원명 : " + personalInfo[findIndex].getName());
		for (int i = 0; i < 12; i++) {
			if (salaryInfo[findIndex][i] != null) {
				System.out.print(salaryInfo[findIndex][i].getMonth() + "월 " + "\t");
				System.out.print("근무일수 : " + salaryInfo[findIndex][i].getWorkDay() + "\t");
				System.out.print("휴가일수 : " + salaryInfo[findIndex][i].getVacDay() + "\t");
				System.out.print("시간외근무시간 : " + salaryInfo[findIndex][i].getOverTime() + "\t");
				System.out.print("중식대지급여부 : " + salaryInfo[findIndex][i].getLunch() + "\t");
				System.out.print("교통비지급여부 : " + salaryInfo[findIndex][i].getTraffic() + "\n");
				System.out.print("기본급 : " + salaryInfo[findIndex][i].getBasicPay() + "\t");
				System.out.print("직무급 : " + salaryInfo[findIndex][i].getGradePay() + "\t");
				System.out.print("성과급 : " + salaryInfo[findIndex][i].getPerformancePay() + "\t");
				System.out.print("시긴외수당 : " + salaryInfo[findIndex][i].getOverTimePay() + "\t");
				System.out.print("월급 : " + salaryInfo[findIndex][i].getTotalPay() + "\n");
			}
		}
	}

	public void calulation() {

		String s = new String(); // 직급
		String p = new String(); // 성과등급
		int t = 0; // 근속연수

		for (int i = 0; i < personalInfo.length; i++) {

			for (int j = 0; j < 12; j++) {
				if (salaryInfo[i][j] != null) {

					s = personalInfo[i].getGrade();
					p = personalInfo[i].getPerformGrade();
					// 직무급 계산

					switch (s) {
					case "L0":
						salaryInfo[i][j].setGradePay(100000);
						break;
					case "L1":
						salaryInfo[i][j].setGradePay(200000);
						break;
					case "L2":
						salaryInfo[i][j].setGradePay(300000);
						break;
					case "L3":
						salaryInfo[i][j].setGradePay(400000);
						break;
					case "L4":
						salaryInfo[i][j].setGradePay(500000);
						break;
					}
					// 기본급 계산

					t = personalInfo[i].getWorkYear();
					switch (t) {
					case 0:
					case 1:
						salaryInfo[i][j].setBasicPay(100000);
						break;
					case 2:
						salaryInfo[i][j].setBasicPay(200000);
						break;
					case 4:
						salaryInfo[i][j].setBasicPay(300000);
						break;
					case 5:
						salaryInfo[i][j].setBasicPay(400000);
						break;
					case 6:
						salaryInfo[i][j].setBasicPay(500000);
						break;
					case 7:
						salaryInfo[i][j].setBasicPay(600000);
						break;
					case 8:
						salaryInfo[i][j].setBasicPay(700000);
						break;
					case 9:
						salaryInfo[i][j].setBasicPay(800000);
						break;
					case 10:
						salaryInfo[i][j].setBasicPay(900000);
						break;
					default:
						salaryInfo[i][j].setBasicPay(1000000);
					}

					// 성과급 계산
					switch (p) {
					case "1":
						salaryInfo[i][j].setPerformancePay(salaryInfo[i][j].getBasicPay() * 8 / 12);
						break;
					case "2":
						salaryInfo[i][j].setPerformancePay(salaryInfo[i][j].getBasicPay() * 7 / 12);
						break;
					case "3":
						salaryInfo[i][j].setPerformancePay(salaryInfo[i][j].getBasicPay() * 6 / 12);
						break;
					case "4":
						salaryInfo[i][j].setPerformancePay(salaryInfo[i][j].getBasicPay() * 5 / 12);
						break;
					case "5":
						salaryInfo[i][j].setPerformancePay(salaryInfo[i][j].getBasicPay() * 4 / 12);
						break;
					case "6":
						salaryInfo[i][j].setPerformancePay(salaryInfo[i][j].getBasicPay() * 3 / 12);
						break;
					case "7":
						salaryInfo[i][j].setPerformancePay(salaryInfo[i][j].getBasicPay() * 2 / 12);
						break;
					}

					// 시간외수당 계산 : 시간당 2만원
					salaryInfo[i][j].setOverTimePay(salaryInfo[i][j].getOverTime() * 20000);

					// 중식비 계산 : 월 32만원
					if (salaryInfo[i][j].getLunch().equals("Y")) {
						salaryInfo[i][j].setLunchPay(320000);
					}

					// 교통비 계산 : 월 20만원
					if (salaryInfo[i][j].getTraffic().equals("Y")) {
						salaryInfo[i][j].setTrafficPay(200000);
					}

					// 월급 계산

					salaryInfo[i][j].setTotalPay(salaryInfo[i][j].getBasicPay() + salaryInfo[i][j].getGradePay()
							+ salaryInfo[i][j].getPerformancePay() + salaryInfo[i][j].getOverTimePay()
							+ salaryInfo[i][j].getLunchPay() + salaryInfo[i][j].getTrafficPay());

				}

			}
		}
	} // calculation
}

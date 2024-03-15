import java.util.*;
import java.time.*;

public class PartTime {

	private static int indexPart; // 전체 인덱스

	private int findIndex; // 검색용 인덱스

	private PersonalInfo[] personalInfo;
	private SalaryInfo[][] salaryInfo;

	Scanner sc = new Scanner(System.in);

	public PartTime() {
		// 초기화
		indexPart = 0;
		findIndex = 0;
		personalInfo = new PersonalInfo[100];
		salaryInfo = new SalaryInfo[100][12];
	}

	public void inputEmployInfo() {

		Scanner sc = new Scanner(System.in);

		System.out.println("몇 명의 정보를 입력합니까?");
		int tmp = sc.nextInt();
		int tmpIndex = indexPart;

		for (int i = tmpIndex; i < tmpIndex + tmp; i++) {
			personalInfo[i] = new PersonalInfo();

			System.out.print("이름 입력: ");
			personalInfo[i].setName(sc.next());

			System.out.print("직원번호 입력: ");
			personalInfo[i].setId(sc.next());

//			System.out.print("직급 입력: ");
			personalInfo[i].setGrade("-");

//			System.out.print("계약형태 입력(1: 정규직/2. 비정규직): ");
			personalInfo[i].setType("2");

			System.out.print("급여은행 입력: ");
			personalInfo[i].setBank(sc.next());

			System.out.print("급여계좌 입력: ");
			personalInfo[i].setAccount(sc.next());

			System.out.print("부서 입력: ");
			personalInfo[i].setDept(sc.next());

			personalInfo[i].setPerformGrade("-");

			personalInfo[i].setStartDate("-");

			personalInfo[i].setWorkYear(0); // 근속연수 자동 입력

			personalInfo[i].setExitDate(""); // 퇴사일 자동 입력

			System.out.println("직원 기본정보 입력이 완료되었습니다.");

			indexPart++;
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

		System.out.println("근무일자 입력 : ");
		salaryInfo[i][monthNumber].setWorkDay(sc.nextInt());

//		salaryInfo[i][monthNumber].setWorkDay(monthDays - salaryInfo[i][monthNumber].getVacDay()); // 근무일자: 월수 - 휴가일자

//		System.out.println("시간외근무 입력 : ");
		salaryInfo[i][monthNumber].setOverTime(0);
		salaryInfo[i][monthNumber].setLunch("N");
		salaryInfo[i][monthNumber].setTraffic("N");
//		if (salaryInfo[i][monthNumber].getWorkDay() >= 10) {
//			salaryInfo[i][monthNumber].setLunch("Y");
//			salaryInfo[i][monthNumber].setTraffic("Y");
//		} else {
//			salaryInfo[i][monthNumber].setLunch("N");
//			salaryInfo[i][monthNumber].setTraffic("N");
//		}

	}

	public void findIndex() {

		for (int i = 0; i < indexPart; i++) {
			System.out.println("ID : " + personalInfo[i].getId() + " / 직원명 : " + personalInfo[i].getName());
		}

		System.out.println("ID를 입력하세요");
		String findName = sc.next(); // id임

		for (int j = 0; j < indexPart; j++) {
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
//		System.out.print("2번. 직급" + "\t");
		System.out.print("2번. 급여은행" + "\t");
		System.out.print("3번. 급여계좌" + "\n");
		System.out.print("4번. 부서" + "\t");
		System.out.print("5번. 입사일자" + "\t");
		System.out.print("6번. 퇴사일자" + "\t");
//		System.out.print("8번. 성과등급" + "\t");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			personalInfo[i].setName(sc.next());
			break;
		case 2:
			personalInfo[i].setBank(sc.next());
			break;
		case 3:
			personalInfo[i].setAccount(sc.next());
			break;
		case 4:
			personalInfo[i].setDept(sc.next());
			break;
		case 5:
			personalInfo[i].setStartDate(sc.next());
			break;
		case 6:
			personalInfo[i].setExitDate(sc.next());
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

		System.out.println("근무일자를 수정하세요.");

		int tmpWork = sc.nextInt();
		salaryInfo[i][monthNumber].setWorkDay(tmpWork);

	}

	public void dispEmploy() {

		// 전직원 출력
		for (int i = 0; i < indexPart; i++) {
			System.out.print("Index: " + (i + 1) + "\t");
			System.out.print("ID: " + personalInfo[i].getId() + "\t");
			System.out.print("이름: " + personalInfo[i].getName() + "\t");
			System.out.print("고용형태: " + personalInfo[i].getType() + "\n");
			System.out.print("급여은행: " + personalInfo[i].getBank() + "\t");
			System.out.print("급여계좌: " + personalInfo[i].getAccount() + "\t");
			System.out.print("부서: " + personalInfo[i].getDept() + "\n");

		}
	}

	public void dispEmploy2() {

		findIndex();

		int i = findIndex;

		// 선택 출력

		System.out.print("Index: " + (i + 1) + "\t");
		System.out.print("ID: " + personalInfo[i].getId() + "\t");
		System.out.print("이름: " + personalInfo[i].getName() + "\t");
		System.out.print("고용형태: " + personalInfo[i].getType() + "\n");
		System.out.print("급여은행: " + personalInfo[i].getBank() + "\t");
		System.out.print("급여계좌: " + personalInfo[i].getAccount() + "\t");
		System.out.print("부서: " + personalInfo[i].getDept() + "\t");
	}

	public void dispSalary() {

		findIndex();

		// 해당인덱스의 월별 급여정보 출력
		System.out.println("ID : " + personalInfo[findIndex].getId() + " / 직원명 : " + personalInfo[findIndex].getName());
		for (int i = 0; i < 12; i++) {
			if (salaryInfo[findIndex][i] != null) {
				System.out.print(salaryInfo[findIndex][i].getMonth() + "월 " + "\t");
				System.out.print("근무일수 : " + salaryInfo[findIndex][i].getWorkDay() + "\t");
				System.out.print("중식대지급여부 : " + salaryInfo[findIndex][i].getLunch() + "\t");
				System.out.print("교통비지급여부 : " + salaryInfo[findIndex][i].getTraffic() + "\n");
				System.out.print("기본급 : " + salaryInfo[findIndex][i].getBasicPay() + "\t");
				System.out.print("월급 : " + salaryInfo[findIndex][i].getTotalPay() + "\n");
			}
		}
	}

	public void calulation() {

		int d = 0; // 근무일수

		for (int i = 0; i < personalInfo.length; i++) {

			for (int j = 0; j < 12; j++) {
				if (salaryInfo[i][j] != null) {

					salaryInfo[i][j].setBasicPay(salaryInfo[i][j].getWorkDay());

				}

				// 중식비 계산 : 월 32만원
				if (salaryInfo[i][j].getLunch().equals("Y")) {
					salaryInfo[i][j].setLunchPay(320000);
				}

				// 교통비 계산 : 월 20만원
				if (salaryInfo[i][j].getTraffic().equals("Y")) {
					salaryInfo[i][j].setTrafficPay(200000);
				}

				salaryInfo[i][j].setTotalPay(salaryInfo[i][j].getBasicPay() + salaryInfo[i][j].getLunchPay()
						+ salaryInfo[i][j].getTrafficPay());

			}

		}
	}
	// calculation
}

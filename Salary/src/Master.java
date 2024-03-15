import java.util.Scanner;

public class Master {

	private static int indexFull; // 정직원 인덱스
	private static int indexPart; // 비정규직 인덱스

	public static void main(String[] args) {

		System.out.println("1: 정규직 관리 / 2: 비정규직 관리");
		Scanner sc = new Scanner(System.in);

		FullTime fullTime = new FullTime();
		PartTime partTime = new PartTime();

		int fullOrPart;

		int choice;
		String yesOrNo;

		fullOrPart = sc.nextInt();

		if (fullOrPart == 1) {
			do {
				System.out.println("원하는 메뉴를 입력하세요");
				System.out.println("1번: 신규 직원정보 입력" + "\t" + "2번: 신규 급여정보(월) 입력" + "\t" + "3번: 기존 직원정보 수정" + "\n"
						+ "4번: 기존 급여정보(월) 수정" + "\t" + "5번: 직원정보 출력" + "\t" + "6번: 급여정보 출력");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					fullTime.inputEmployInfo();
					break;//
				case 2:
					fullTime.inputSalaryInfo();
					break;//
				case 3:
					fullTime.modifyPerson();
					break;
				case 4:
					fullTime.modifySalary();
					break;
				case 5:

					System.out.println("1번: 전직원출력");
					System.out.println("2번: 개별직원출력");

					switch (sc.nextInt()) {
					case 1:
						fullTime.dispEmploy();
						break;
					case 2:
						fullTime.dispEmploy2();
						break;
					}

					break;
				case 6:
					fullTime.dispSalary();
					break;
				}

				fullTime.calulation();

				System.out.println("계속 하시겠습니까");
				yesOrNo = sc.next();
			} while (yesOrNo.equals("y") || yesOrNo.equals("Y"));

			System.out.println("종료되었습니다");
		} else if (fullOrPart == 2) {
			do {
				System.out.println("원하는 메뉴를 입력하세요");
				System.out.println("1번: 신규 직원정보 입력" + "\t" + "2번: 신규 급여정보(월) 입력" + "\t" + "3번: 기존 직원정보 수정" + "\n"
						+ "4번: 기존 급여정보(월) 수정" + "\t" + "5번: 직원정보 출력" + "\t" + "6번: 급여정보 출력");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					partTime.inputEmployInfo();
					break;//
				case 2:
					partTime.inputSalaryInfo();
					break;//
				case 3:
					partTime.modifyPerson();
					break;
				case 4:
					partTime.modifySalary();
					break;
				case 5:

					System.out.println("1번: 전직원출력");
					System.out.println("2번: 개별직원출력");

					switch (sc.nextInt()) {
					case 1:
						partTime.dispEmploy();
						break;
					case 2:
						partTime.dispEmploy2();
						break;
					}

					break;
				case 6:
					partTime.dispSalary();
					break;
				}

				partTime.calulation();

				System.out.println("계속 하시겠습니까");
				yesOrNo = sc.next();
			} while (yesOrNo.equals("y") || yesOrNo.equals("Y"));

			System.out.println("종료되었습니다");

		} else {
			System.out.println("종료되었습니다.");
		}
		;

	}

}

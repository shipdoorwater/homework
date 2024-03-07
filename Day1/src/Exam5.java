
public class Exam5 {




public static void main(String[] args) {

	String a = "*";

	for (int i = 1; i <= 3; i++) {
		for (int j = 3; j >= 1; j--) {
			if (i < j) {
				System.out.print(" ");
			} else {
				System.out.print(a);
			}
		}
		for (int j = 4; j <= 5; j++) {
			if (j - i >= 3) {
				System.out.print(" ");
			} else {
				System.out.print(a);
			}
		}
		System.out.println();
	}
	for (int i = 4; i <=5; i++) {
		for (int j = 3; j >=1; j--) {
			if (i <= j*2) {
				System.out.print(" ");
			} else {
				System.out.print(a);
			}
		}
		for (int j = 4; j <= 5; j++) {
			if (i >= j) {
				System.out.print(a);
			}
		}
		System.out.println();
	}
}
}
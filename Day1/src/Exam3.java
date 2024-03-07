
public class Exam3 {

	public static void main (String []args) {
		
		String a = "*";
		
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=3; j++) {
				if (i + j > 3) {
					System.out.print(a);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

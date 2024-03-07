
public class StringExam {

	public static void main (String[] args) {
		
		String str1 = new String("Superman");
		String str2 = new String("Superman");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if (str1 == str2) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
		
		if (str1.equals(str2)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
		
		String str3 = "Batman";
		String str4 = "Batman";
		
		System.out.println(str3);
		System.out.println(str4);
		
		if (str3 == str4) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
		
		if (str3.equals(str4)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
	
	}
}

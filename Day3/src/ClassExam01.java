
public class ClassExam01 {

	private int a;
	private char s;
	private float c;
	
	public static void main(String[] args) {
		
		ClassExam01 ce = new ClassExam01();  // 생성자 호출
		
		ce.output(1,2);
		ce.output(3.4);
		ce.output(11);
		ce.output();
	}
		
	// 오버로딩
	public void output(int a, int b) {
		System.out.println("a,b");
	}
	
	public void output(int a) {
		System.out.println("a");
	}
	
	public void output(double a) {
		System.out.println("int a");
	}
	
	public void output() {
		System.out.println("nothing");
	}
 }

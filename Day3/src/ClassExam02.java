
public class ClassExam02 {
	
	// field
	private int a;

	
	//constructor
	public ClassExam02() { // default 생성자
		System.out.println("디폴트생성자");
	}
	public ClassExam02(int aa) { // default 생성자
		System.out.println("디폴트생성자2");
		a = aa;
	}
	
	//method
	// setter
	public void setA(int num) {  // 필드명: a를 set 뒤에 쓴다
		a = num;
	}
	
	//getter
	public int getA() {
		return a;
	}
	
	
	public static void main(String[] args) {
		
		ClassExam02 ce2= new ClassExam02();

		ClassExam02 ce3= new ClassExam02(10);
		
		ClassExam02 ce4= new ClassExam02(2000);
		
		
		ce2.setA(500); // ce.a = 500; 사용하면 안됨 (외부에서 a 접근 못한다)
		System.out.println(ce2.getA());    // (ce2.a);
		System.out.println(ce3.a);
		System.out.println(ce4.a);
		
		
	}

}

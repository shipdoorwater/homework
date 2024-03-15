
class a {
	
	public a() {
		System.out.println("super");
	}
	
	public void disp() {
		System.out.println("I am A");
	}
}

public class IsAExam01 extends a{

	public IsAExam01() {
		// 여기서 부모의 생성자를 호출
		// super();  <- 코딩되어 있음
		System.out.println("sub");
	}
	
	public static void main(String[] args) {

		
		IsAExam01 isa = new IsAExam01();
		
	}

}

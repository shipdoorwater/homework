
public class InterExam01 implements CCC {

	public static void main(String[] args) {
//		InterExam01 inter = new InterExam01();
		CCC inter = new InterExam01();
		
		inter.disp();
		inter.disp2();
//		inter.disp3();  // 에러 발생(동적바인딩이므로 CCC가 알고있는것만 실행 가능)
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("disp");
	}

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("disp2");
	}

	
	public void disp3() {
		System.out.println("disp3");
	}
}

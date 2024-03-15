
public class InnerClassExam01 {
	
	private int a;
	private static int b;
	
	// 1. Member inner class
	class Test {
		public void disp() {
			System.out.println(a);
			System.out.println(b);
		}
	}
	
	// 2. Static inner class : static변수만 제한적으로 사용 가능, 다른 이너클래스는 제한 없음
	static class Test2 {
		public void disp() {
//			System.out.println(a); <- static 변수만 사용 가능함
			System.out.println(b);
		}
	}

	// 3. Local inner class
	public void dispLocal() {
		
		class Test3 {
			public void disp() {
				System.out.println(a);
				System.out.println(b);
			}
		}
		
		Test3 test3 = new Test3();
		test3.disp();
	}
	
	
	public static void main(String[] args) {
		
		// 1. Member inner class
//		1-1.
//		Test test = new Test(); <- 외부 필드에 생성후
//		InnerClassExam01 inner1 = new InnerClassExam01();
//		inner1.test.disp();
//		1-2.
//		InnerClassExam01 inner1 = new InnerClassExam01();
//		InnerClassExam01.Test test = inner1.new Test();
//		test.disp();
//		1-3.
//		InnerClassExam01.Test test = new InnerClassExam01().new Test();
		
		
		// 3. Local innere class
		InnerClassExam01 inner1 = new InnerClassExam01();
		inner1.dispLocal();
	}

}

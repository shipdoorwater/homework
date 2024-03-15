
public class InnerClassExam02 {

	private int a;
	
	// 4. Anonymous inner class
	public void dispInter() {
		new AAA() {

			@Override
			public void disp() {
				System.out.println(a);
			}
			
			
		}.disp();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassExam02 inter = new InnerClassExam02();
		inter.dispInter();
	}

}

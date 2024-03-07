
public class Explain {

	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public Explain getObject() {
		return this;
	}
	
	public static void main(String[] args) {
		Explain th = new Explain();
		
		th.setA(100) ;
		
		System.out.println(th.getA());
		
		Explain th2 = th.getObject();
		
		System.out.println(th);
		System.out.println(th2);
	}
}

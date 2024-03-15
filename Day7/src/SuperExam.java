
class AA {
	private int a;
	
	public int getA() {
		return a;
	}
	
	public AA(int a) {
		this.a = a;
	}
	
	
}

class BB extends AA {
	private int b;
	
	public int getB() {
		return b;
	}
	
	public BB(int a, int b) {
		super(a);
		this.b = b;
	}

}

class CC extends BB {
	private int c;
	
	public int getC() {
		return c;
	}
	
	public CC(int a, int b, int c) {
		super(a, b);
		this.c = c;	
	}
}
public class SuperExam {
	
	public static void main(String[] args) {
		CC cc  = new CC(10,20,30);
		
		System.out.println(cc.getA()); //10
		System.out.println(cc.getB()); //20
		System.out.println(cc.getC()); //30
	}
}

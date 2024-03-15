class AA {
	int aa;

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}
}

class BB {
	int aa;

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}
}

class CC {
	int aa;

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}
}


public class HasA2 {

	private AA aa;
	private BB bb;
	private CC cc;
	
	public void setAA(AA aa) {
		this.aa = aa;
	}
	
	public static void main(String[] args) {
		
		HasA2 hasa2 = new HasA2() ;
		AA a = new AA();
		
		hasa2.setAA(a) ;// hasa2.aa = a;
		
		
	}
}

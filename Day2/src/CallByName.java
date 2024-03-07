
public class CallByName {

	public static void main (String[] args) {
		
		System.out.println("----------call by name----------");
		
		CallByName.disp2();
		
		CallByName cbn = new CallByName();
		cbn.disp();
		cbn.disp2();
		
		int num = 100;
		
		
		System.out.println("----------call by value----------");
		
		cbn.disp3(num);	
		System.out.println(num);
		
		num = cbn.disp4(num);	
		System.out.println(num);
		
		
		System.out.println("----------call by reference----------");
		
		String str = new String("Superman");
				
		cbn.disp5(str);
	}
	
	
	public void disp() {  // call by name
		System.out.println("call by name 1");
	}
	
	public static void disp2() {  // call by name
		System.out.println("call by name 2");
	}
	
	public void disp3(int num) {  // call by value
		
		System.out.println(num);
		num++;
		System.out.println(num);
	}

	public int disp4(int num) {  // call by value
		
		System.out.println(num);
		num++;
		System.out.println(num);
		
		return num;
	}
	
	public void disp5(String s) { // call by reference
		System.out.println(s);
	}
}

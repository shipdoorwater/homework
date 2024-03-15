
public class GenericEx01Main {

	public static void main(String[] args) {
		GenericEx01<String> t = new GenericEx01<String>();
		
		String[] ss = {"애","아","서" };
		t.set(ss);
		t.print();
		
		GenericEx01 t1 = new GenericEx01();

		Integer[] s = {1,2,3};
		t1.set(s);
		t1.print();
		
		GenericEx01<Integer> t2 = new GenericEx01<Integer>();
		
		t2.set(s);
		t2.print();
	}
}

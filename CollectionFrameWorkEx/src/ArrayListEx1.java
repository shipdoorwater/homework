import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		System.out.println("list1.containsall(list2) : " + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		list2.set(3, "AA");
		System.out.println(list2.toString());
		
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));  // list2와 공통된 것만 남기고 나머지는 삭제
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		// list2에서 list1이 포함된 객체들을 삭제
		for (int i = list2.size()-1; i>=0; i--) {
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		}
		System.out.println(list1.toString());
		System.out.println(list2.toString());
	}

}

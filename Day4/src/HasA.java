class A {

	private int a;
	
	public A() {
		System.out.println("A");
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
}


public class HasA {

	private String name;
	private A age;
	
	public HasA() {
		System.out.println("HasA");
		name = "";
		age = new A() ;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age.setA(age);   //this.age = age
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return this.age.getA();
	}
	
	
	public static void main(String[] args) {
		
		HasA has = new HasA() ;
		
		has.setName("Superman");
		has.setAge(1000);
		
		System.out.println(has.getName());
		System.out.println(has.getAge());
	
	}
}

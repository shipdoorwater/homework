// 성적 처리 클래스

public class HasACalc2Teacher {

	// 이름은 Name 클래스
	// 과목은 Subject 클래스
	// 총점, 평군
	private Name name;
	private Subject kor;
	private Subject mat;
	private Subject eng;

	
	public HasACalc2Teacher() {
		name = new Name();
		kor =new Subject();
		mat = new Subject();
		eng = new Subject();		
	}
	
	public HasACalc2Teacher(Name name, Subject kor, Subject mat, Subject eng) {
		name = new Name();
		kor =new Subject();
		mat = new Subject();
		eng = new Subject();		
	}
	
	public void setName(String name) {
		this.name.setName(name);
	}
	
	public void setKor(int kor) {
		this.kor.setSubject(kor);
	}
	
	public void setMat(int mat) {
		this.mat.setSubject(mat);
	}
	
	public void setEng(int eng) {
		this.eng.setSubject(eng);
	}
	
	
	public String getName() {
		return this.name.getName();
	}
	
	public int getKor() {
		return this.kor.getSubject();
	}
	
	public int getMat() {
		return this.mat.getSubject();
	}
	
	public int getEng() {
		return this.eng.getSubject();
	}
	
	public int getTotal() {
		return getKor() + getMat() + getEng();
	}
	
	public double getAvg() {
		return (double)getTotal() / 3;
	}
	
	
	public static void main (String[] args) {
		
		HasACalc2Teacher stu = new HasACalc2Teacher() ;
		stu.setName("Superman");
		stu.setKor(90);
		stu.setMat(100);
		stu.setEng(70);
		
		System.out.println(stu.getName());
		System.out.println(stu.getKor());
		System.out.println(stu.getMat());
		System.out.println(stu.getEng());
		System.out.println(stu.getTotal());
		System.out.println(stu.getAvg());
	}

}

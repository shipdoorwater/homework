
public class Homework {
	// 이름은 Name 클래스
	// 과목은 Subject 클래스
	// 총점, 평군
	private Name name;
	private Subject kor;
	private Subject mat;
	private Subject eng;
	private Subject total;
	private Subject avg;

	
	public Homework() {
		name = new Name();
		kor =new Subject();
		mat = new Subject();
		eng = new Subject();	
		total = new Subject();	
		avg = new Subject();	
		

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
	
	public void setTotal() {
		this.total.setSubject(getKor() + getMat() + getEng());
	}
	
	
	public void setAvg() {
		this.avg.setSubject(getTotal()/3);
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

}

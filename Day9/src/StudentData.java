import java.util.Scanner;

public class StudentData {
	// 이름은 Name 클래스
	// 과목은 Subject 클래스
	// 총점, 평군
	private String name;
	private int kor;
	private int mat;
	private int eng;
	private int total;
	private double avg;
	

	public StudentData() {
		name = new String("");
		kor = 0;
		mat = 0;
		eng = 0;
		total = 0;
		avg = 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setTotal() {
		this.total = getTotal();
	}

	public void setAvg() {
		this.avg = getAvg();
	}

	public int getTotal() {
		return getKor() + getMat() + getEng();
	}

	public double getAvg() {
		return (double) getTotal() / 3;
	}
	
}

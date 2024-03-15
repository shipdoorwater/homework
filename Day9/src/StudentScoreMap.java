
public class StudentScoreMap {
	// 과목은 Subject 클래스
	// 총점, 평군

	private int kor;
	private int mat;
	private int eng;
	private int total;
	private double avg;
	

	public StudentScoreMap() {
		
		kor = 0;
		mat = 0;
		eng = 0;
		total = 0;
		avg = 0;
	}
	
	public String toString() {
		return 
		"국어 : " + kor + "\t 수학 : " + mat + "\t 영어 : " + eng + "\t 총점 : " + total + "\t 평균 : " + avg
		;
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

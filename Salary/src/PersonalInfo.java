
public class PersonalInfo {

	private String name;
	private String id;
	private String grade;
	private String type;
	private String bank;
	private String account;
	private String dept;
	private String startDate;
	private int workYear;
	private String exitDate;
	private String performGrade;

	
	
	public PersonalInfo() {
		name = new String();
		id = new String();
		grade = new String();
		type = new String();
		bank = new String();
		account = new String();
		dept = new String();
		startDate = new String();
		workYear = 0;
		exitDate = new String();
		performGrade = new String();

		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	public String getBank() {
		return bank;
	}


	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getExitDate() {
		return exitDate;
	}


	public void setExitDate(String exitDate) {
		this.exitDate = exitDate;
	}


	public int getWorkYear() {
		return workYear;
	}


	public void setWorkYear(int workYear) {
		this.workYear = workYear;
	}


	public String getPerformGrade() {
		return performGrade;
	}


	public void setPerformGrade(String performGrade) {
		this.performGrade = performGrade;
	}

}


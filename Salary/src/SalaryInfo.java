
public class SalaryInfo {

	private String id;
	private String month;
	private int workDay;
	private int vacDay;
	private int overTime;
	private String lunch;
	private String traffic;
	private int basicPay;
	private int gradePay;
	private int performancePay;
	private int overTimePay;
	private int lunchPay;
	private int trafficPay;
	private int totalPay;
	
	
	public SalaryInfo() {
		
		id = new String();
		month = new String(); 
		workDay = 0;
		vacDay = 0;
		overTime = 0;
		lunch = new String(); // Y OR N -> workday가 10일 이상인 경우는 Y
		traffic = new String();	// Y OR N -> workday가 10일 이상인 경우는 Y
		basicPay = 0;
		gradePay = 0;
		performancePay = 0;
		overTimePay = 0;
		lunchPay = 0;
		trafficPay = 0;
		totalPay = 0;		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public int getWorkDay() {
		return workDay;
	}


	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}


	public int getVacDay() {
		return vacDay;
	}


	public void setVacDay(int vacDay) {
		this.vacDay = vacDay;
	}


	public int getOverTime() {
		return overTime;
	}


	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}


	public String getLunch() {
		return lunch;
	}


	public void setLunch(String lunch) {
		this.lunch = lunch;
	}


	public String getTraffic() {
		return traffic;
	}


	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}


	public int getBasicPay() {
		return basicPay;
	}


	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}


	public int getGradePay() {
		return gradePay;
	}


	public void setGradePay(int gradePay) {
		this.gradePay = gradePay;
	}


	public int getPerformancePay() {
		return performancePay;
	}


	public void setPerformancePay(int performancePay) {
		this.performancePay = performancePay;
	}


	public int getTotalPay() {
		return totalPay;
	}


	public void setTotalPay(int totalPay) {
		this.totalPay = totalPay;
	}


	public int getOverTimePay() {
		return overTimePay;
	}


	public void setOverTimePay(int overTimePay) {
		this.overTimePay = overTimePay;
	}


	public int getLunchPay() {
		return lunchPay;
	}


	public void setLunchPay(int lunchPay) {
		this.lunchPay = lunchPay;
	}


	public int getTrafficPay() {
		return trafficPay;
	}


	public void setTrafficPay(int trafficPay) {
		this.trafficPay = trafficPay;
	}
}

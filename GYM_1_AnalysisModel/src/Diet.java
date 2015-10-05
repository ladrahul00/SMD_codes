
public class Diet {
	private Days day;
	private String dietPlan;

	public Diet(Days day, String dietPlan){
		this.day = day;
		this.dietPlan = dietPlan;
	}
	
	public Days getDay() {
		return day;
	}
	public void setDay(Days day) {
		this.day = day;
	}
	public String getDietPlan() {
		return dietPlan;
	}
	public void setDietPlan(String dietPlan) {
		this.dietPlan = dietPlan;
	}
}

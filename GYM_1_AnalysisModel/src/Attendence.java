
public abstract class Attendence {
	private int no_of_days_attended;
	private int total_no_of_days;
	
	public Attendence(int days_attended, int total_days){
		this.no_of_days_attended = days_attended;
		this.total_no_of_days = total_days;
	}
	
	public int getNo_of_days_attended() {
		return no_of_days_attended;
	}
	public void setNo_of_days_attended(int no_of_days_attended) {
		this.no_of_days_attended = no_of_days_attended;
	}
	public int getTotal_no_of_days() {
		return total_no_of_days;
	}
	public void setTotal_no_of_days(int total_no_of_days) {
		this.total_no_of_days = total_no_of_days;
	}	
}

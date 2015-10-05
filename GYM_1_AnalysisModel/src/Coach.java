import java.util.Date;


public class Coach extends Person {

	private double salary;
	private Date date_of_joining;
	private Date date_of_leaving;
	private String qualifcation;
	
	public Coach(Name n, Address addr, Gender g, int ag, double salary,
			Date date_of_joining, Date date_of_leaving, String qualifcation) {
		super(n, addr, g, ag);
		this.salary = salary;
		this.date_of_joining = date_of_joining;
		this.date_of_leaving = date_of_leaving;
		this.qualifcation = qualifcation;
	}


	public void suggestDietPlan(int memberID, Days day, String dietPlan){
		
	}
	
	public void getUserDetails(int memberID){
		
	}
	
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Date getDate_of_joining() {
		return date_of_joining;
	}


	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}


	public Date getDate_of_leaving() {
		return date_of_leaving;
	}


	public void setDate_of_leaving(Date date_of_leaving) {
		this.date_of_leaving = date_of_leaving;
	}


	public String getQualifcation() {
		return qualifcation;
	}


	public void setQualifcation(String qualifcation) {
		this.qualifcation = qualifcation;
	}


	
	
	public Coach(Name n, Address addr, Gender g, int ag) {
		super(n, addr, g, ag);
		// TODO Auto-generated constructor stub
	}

}

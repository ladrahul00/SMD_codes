import java.util.Date;


public class Member extends Person {
	private int memberID;
	private Date dateOfJoining;
	private int membership;
	private int days_attended;
	private int days_completed;
	private int coachID;
	private double weight;
	private double height;
	private String [] allergies = new String [10];
	private Diet [] diet = new Diet [7];
	
	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getMembership() {
		return membership;
	}

	public void setMembership(int membership) {
		this.membership = membership;
	}

	public int getDays_attended() {
		return days_attended;
	}

	public void setDays_attended(int days_attended) {
		this.days_attended = days_attended;
	}

	public int getDays_completed() {
		return days_completed;
	}
	
	public void setDays_completed(int days_completed) {
		this.days_completed = days_completed;
	}

	public int getCoachID() {
		return coachID;
	}

	public void setCoachID(int coachID) {
		this.coachID = coachID;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String[] getAllergies() {
		return allergies;
	}

	public void setAllergies(String[] allergies) {
		this.allergies = allergies;
	}
	
	public Diet[] getDiet() {
		return diet;
	}

	public void setDiet(Diet[] diet) {
		this.diet = diet;
	}
	public Member(Name n, Address addr, Gender g, int ag, int memberID,
			Date dateOfJoining, int membership, int days_attended,
			int days_completed, int coachID, double weight, double height,
			String[] allergies, Diet[] diet) {
		super(n, addr, g, ag);
		this.memberID = memberID;
		this.dateOfJoining = dateOfJoining;
		this.membership = membership;
		this.days_attended = days_attended;
		this.days_completed = days_completed;
		this.coachID = coachID;
		this.weight = weight;
		this.height = height;
		this.allergies = allergies;
		this.diet = diet;
	}
	
}


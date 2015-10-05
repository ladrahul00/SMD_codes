
import java.util.Date;

public class Instruments {
	private int instrumentsID;
	private Date dateOfPurchace;
	private int modelNo;
	private double cost;
	private Date dateOfMaintainence;
	
	public Instruments(int instrumentID, Date dateOfPurchace, int modelNo, double cost, Date dateOfMaintainence){
		this.instrumentsID = instrumentID;
		this.dateOfMaintainence = dateOfMaintainence;
		this.dateOfPurchace = dateOfPurchace;
		this.cost=cost;
		this.modelNo = modelNo;
	}
	
	public int getInstrumentsID() {
		return instrumentsID;
	}
	public void setInstrumentsID(int instrumentsID) {
		this.instrumentsID = instrumentsID;
	}
	public Date getDateOfPurchace() {
		return dateOfPurchace;
	}
	public void setDateOfPurchace(Date dateOfPurchace) {
		this.dateOfPurchace = dateOfPurchace;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Date getDateOfMaintainence() {
		return dateOfMaintainence;
	}
	public void setDateOfMaintainence(Date dateOfMaintainence) {
		this.dateOfMaintainence = dateOfMaintainence;
	}
	
	public boolean checkMaintainence(){
		Date today = new Date();
		if(today.after(dateOfMaintainence))
			return false;
		return true;
	}
	
	
	
}


public class Accounts {

	private double totalAmount;
	
	public Accounts(double totalAmount){
		this.totalAmount = totalAmount;
	}
	
	public boolean paySalary(int coachID,double salary){
		if(salary<=totalAmount){
			this.totalAmount-=salary;
			return true;
		}
		return false;
	}

	public boolean buy_instruments(int instrumentID,double cost){
		if(cost<=totalAmount){
			this.totalAmount-=cost;
			return true;
		}
		return false;
	}
	
	public boolean pay_for_maintainence(int instrumentID,double cost){
		if(cost<=totalAmount){
			this.totalAmount-=cost;
			return true;
		}
		return false;
	}
	
	public boolean creditfee(int memberID,double fee){
		this.totalAmount+=fee;
		return true;
	}
	
	public boolean sell_instruments(int instrumentID,double amount){
		this.totalAmount+=amount;
		return true;
	}
	
}

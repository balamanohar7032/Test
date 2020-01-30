package Collections;

public class BankAccount {
	 public double Accno;
	 public double amount;
	public BankAccount(double accno, double amount) {
		super();
		Accno = accno;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BankAccount [Accno=" + Accno + ", amount=" + amount + "]";
	}
	 

}

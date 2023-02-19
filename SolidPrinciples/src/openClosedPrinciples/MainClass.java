package openClosedPrinciples;

public class MainClass {

	public static void main(String[] args) {
		Loan l1=new GoldLoan();//closed for modification
		l1.customer();//java GoldenRule
		Loan l2=new VehicleLoan();
		l2.customer();	

	}

}

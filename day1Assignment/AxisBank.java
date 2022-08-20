package Week3.day1Assignment;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		super.deposit();
		System.out.println("Deposit Amount =2000");
	}
	
	public static void main(String[] args)
	{
		AxisBank Bank=new AxisBank();
		Bank.deposit();
		
	}


}

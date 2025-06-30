import java.lang.*;
public class Account 
{
	private String accNo;
	private double accBalance;
	public Account() { }
	public Account(String accNo, double accBalance)
	{
		this.accNo = accNo;
		this.accBalance = accBalance;
	}
	public void setAccNo(String accNo)
	{
		this.accNo = accNo;
	}
	public void setAccBalance(double accBalance)
	{
		this.accBalance = accBalance;
	}
	public String getAccNo() { return accNo; }
	public double getAccBalance() { return accBalance; }
}
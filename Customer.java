import java.lang.*;
public class Customer 
{
	private int nid;
	private String name;
	private Account acc[]; // = new Account[100]; //if size is mentioned
	public Customer() { }
	public Customer(int nid, String name, int size) 
	{
		this.nid = nid;
		this.name = name;
		acc = new Account[size]; 
	}
	public void setNid(int nid)
	{
		this.nid = nid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getNid() { return nid; }
	public String getName() { return name; }
	
	public void addAccount(Account a)
	{
		boolean flag = false;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i] == null)
			{
				acc[i] = a;
				flag = true;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Account inserted!");
		}
		else 
		{
			System.out.println("Account can't insert!");
		}
	}
	public void removeAccount(Account a)
	{
		int flag = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i] == a)
			{
				acc[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Account deleted!");
		}
		else 
		{
			System.out.println("Account doesn't exist!");
		}
	}
	public void showAllAccounts()
	{
		System.out.println("NID: "+nid);
		System.out.println("Name: "+name);
		for(int i = 0; i<acc.length; i++)
		{
			System.out.println("Index: "+i);
			if(acc[i] != null)
			{
				System.out.println("Account number: "+acc[i].getAccNo());
				System.out.println("Account balance: "+acc[i].getAccBalance());
				System.out.println();
			}
			else 
			{
				System.out.println("Nothing to show!");
				System.out.println();
			}
		}
	}
}
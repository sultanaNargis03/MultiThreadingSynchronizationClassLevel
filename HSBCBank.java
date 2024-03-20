package thread.synchronization.classlevel;

public class HSBCBank 
{
	
	static int accountBal; //using static to achieve class level locking
	String name="Nargis";

	synchronized static public void withdraw(int withdrawlAmount)
	{
		accountBal=accountBal-withdrawlAmount;		
	}
	
	synchronized static public void deposit(int depositAmount)
	{
		accountBal=accountBal+depositAmount;
	}
	
	synchronized static public void checkbalance()
	{
		System.out.println("Account balance is: "+accountBal);
	}
	
	public void editingProfile(String name)
	{
		this.name=name;
		System.out.println("Name changed to "+name);
	}
	
}

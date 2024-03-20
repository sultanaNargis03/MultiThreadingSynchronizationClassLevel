package thread.synchronization.classlevel;

public class LaunchBankApp 
{
	public static void main(String[] args) 
	{

		HSBCBank alienAccount=new HSBCBank();
		
		ATMThread atm=new ATMThread();
		atm.setName("ATM");
		
		GooglePayThread gpay=new GooglePayThread();
		atm.setName("GPay");
		
//		PhonePayThread ppay=new PhonePayThread();
//		atm.setName("PPay");
	
		atm.start();
		gpay.start();
//		ppay.start();
		
	}
}

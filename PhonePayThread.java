package thread.synchronization.classlevel;

public class PhonePayThread extends Thread
{
	@Override
	public void run()
	{
		HSBCBank.checkbalance();
	}
}

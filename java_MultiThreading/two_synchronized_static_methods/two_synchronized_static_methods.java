


package MUltiThreading;

public class two_synchronized_static_methods {

	public static synchronized void m1() throws InterruptedException
	{
		for(int i=1;i<=20;i++)
		{
			System.out.print(i);
			Thread.sleep(20);
		}
	}
	
	public static synchronized void m2() throws InterruptedException
	{
		for(char c='a';c<='z';c++)
		{
			System.err.print(c);
			Thread.sleep(20);
		}
	}
}

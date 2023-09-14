package MUltiThreading;


//it is irregular output
//this is because the m1() method is static Synchronized  so uses CLASS LEVEL LOCK
//and the m2() method is non-static SYNCHRONIZED and it uses OBJECT LEVEL LOCK
// as both LOCKS are  DIFFERENT we will IRREGULAR OUTPUT

//OUTPUT: THE OUTPUT IS IRREGULAR
//a1b2c3d4e5f6g7h8i9j10k11l12m13n14o15p16q17r18s19t20uvwxyz

public class One_Static_Synchronized_One_nonStatic_Synchronized {
	public static synchronized void m1() throws InterruptedException
	{
		for(int i=1;i<=20;i++)
		{
			System.out.print(i);
			Thread.sleep(20);
		}
	}
	
	public  synchronized  void m2() throws InterruptedException
	{
		for(char c='a';c<='z';c++)
		{
			System.err.print(c);
			Thread.sleep(20);
		}
	}

}

package MUltiThreading;


//produces irregular output because the m1() is Sychronized static method so it requires CLASS LEVEL LOCK  to work
//m2() is non-static and non-synchronized method so it requires no lock so it might come in middle and exicue


//output:	THE OUTPUR IS IRREGULAR
//	a12bc3d45e6fg78h9ij10k11l12m13n14o1516p17qr1819st20uvwxyz

public class One_synchronized_static_one_nonSynchronized_nonStatic_menthods {
	
	public static synchronized void m1() throws InterruptedException
	{
		for(int i=1;i<=20;i++)
		{
			System.out.print(i);
			Thread.sleep(20);
		}
	}
	
	public void m2() throws InterruptedException
	{
		for(char c='a';c<='z';c++)
		{
			System.err.print(c);
			Thread.sleep(20);
		}
	}

}

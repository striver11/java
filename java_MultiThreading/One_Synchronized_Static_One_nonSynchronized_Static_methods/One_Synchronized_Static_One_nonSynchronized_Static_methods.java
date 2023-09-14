package MUltiThreading;

//the output is irregular 
//because m1() is static synchronized method it requires CLASS LEVEL LOCK
//where as m2() is static non-Synchronized method it requires NO LOCK
//so m2() will exicute in between so the output is irregular



//OUTPUT:  THE OUTPUT IS IRREGULAR
//a1b2c34d5ef6g78h9ij10k1112lm1314no1516pq17r18s1920tuvwxyz

public class One_Synchronized_Static_One_nonSynchronized_Static_methods {
	public static synchronized void m1() throws InterruptedException
	{
		for(int i=1;i<=20;i++)
		{
			System.out.print(i);
			Thread.sleep(20);
		}
	}
	
	public static void m2() throws InterruptedException
	{
		for(char c='a';c<='z';c++)
		{
			System.err.print(c);
			Thread.sleep(20);
		}
	}
}

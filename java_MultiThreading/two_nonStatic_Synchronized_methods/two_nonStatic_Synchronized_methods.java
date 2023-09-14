package MUltiThreading;

//the output is regular 

//Mutual Exclusion: The synchronized keyword ensures that only one thread can execute a synchronized method at a time.
//When one thread enters a synchronized method, any other thread trying to
//access any synchronized method on the same object will be blocked until the first thread finishes its execution. 
//This guarantees that the methods won't interfere with each other, leading to consistent output.

// the m1() method is non-static synchronized it will use OBJECT LEVEL KEY
//THE m2() method is also non-static synchronized it will also use its OWN OBJECT LEVEL KEY which is different from m1()
//so you might think that both have different KEYS SO THEY SHOULD execute at same time by they are BELONG TO SAME OBJECT
//READ IN MUTUAL EXLUSION YOU WILL UNDERSTAND

//OUTPUT: THE OUTPUT IS REGULAR
//abcdefghijklmnopqrstuvwxyz1234567891011121314151617181920
//OR
//1234567891011121314151617181920abcdefghijklmnopqrstuvwxyz

public class two_nonStatic_Synchronized_methods {
	public synchronized void m1() throws InterruptedException
	{
		for(int i=1;i<=20;i++)
		{
			System.out.print(i);
			Thread.sleep(20);
		}
	}
	
	public synchronized  void m2() throws InterruptedException
	{
		for(char c='a';c<='z';c++)
		{
			System.err.print(c);
			Thread.sleep(20);
		}
	}
}

package MUltiThreading;

//the output is regular 

//Mutual Exclusion: The synchronized keyword ensures that only one thread can execute a synchronized method at a time.
//When one thread enters a synchronized method, any other thread trying to
//access any synchronized method on the same object will be blocked until the first thread finishes its execution. 
//This guarantees that the methods won't interfere with each other, leading to consistent output.

// the m1() method is static synchronized it will use CLASS LEVEL KEY
//THE m2() method is also static synchronized iT will have same CLASS LEVEL KEY AS m1()
//even thought i am calling with different objects(which is not recommended because we should access static methods 
//by className or directly) it does not show any impact they exicute in sequence


//OUTPUT: THE OUTPUT IS REGULAR
//abcdefghijklmnopqrstuvwxyz1234567891011121314151617181920


public class two_Static_Synchronized_methods_DIRFFERENT_OBJECTS_accessing_throught_objects {
	public static synchronized void m1() throws InterruptedException
	{
		for(int i=1;i<=20;i++)
		{
			System.out.print(i);
			Thread.sleep(20);
		}
	}
	
	public static synchronized  void m2() throws InterruptedException
	{
		for(char c='a';c<='z';c++)
		{
			System.err.print(c);
			Thread.sleep(20);
		}
	}
}

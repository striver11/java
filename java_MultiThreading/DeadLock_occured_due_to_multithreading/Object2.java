package MUltiThreading;

public class Object2 {

	public synchronized void m3(Object1 o)
	{
		System.err.println(Thread.currentThread().getName()+"thread : m3 method of Object2 :called");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		o.m2();
	}
	
	public synchronized void m4()
	{
		System.out.println("this is my m4 method of object2");
	}
}

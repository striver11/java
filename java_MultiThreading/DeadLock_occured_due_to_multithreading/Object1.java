package MUltiThreading;

public class Object1 {

	public synchronized void m1(Object2 o)
	{
		System.out.println(Thread.currentThread().getName()+"thread : m3 method of Object2 :called");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		o.m4();
	}
	
	public synchronized void m2()
	{
		System.out.println("this is my m4 method of object2");
	}
}

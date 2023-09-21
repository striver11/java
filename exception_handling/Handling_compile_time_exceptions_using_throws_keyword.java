package exception_handling;

//throws will ignore the exception from the particular area and gives it back to caller


public class Handling_compile_time_exceptions_using_throws_keyword {

	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub
		System.out.println("program start");
		
		
		m1();
		System.out.println("program ends");

	}
	
	public static void m1()throws InterruptedException
	{
		m2();
		System.out.println("hello");
	}
	
	public static void m2() throws InterruptedException
	{
		m3();
		System.out.println("hi");
	}
	public static void m3() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	

}

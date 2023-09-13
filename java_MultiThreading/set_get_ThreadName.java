package MUltiThreading;

public class set_get_ThreadName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1=()->
		{
			
		};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		System.out.println("Name of t1 Thread  : "+t1.getName());
		System.out.println("Name of main Thread : "+Thread.currentThread().getName());
		t1.setName("t1 Thread");
		Thread.currentThread().setName("Main thread Changed");
		System.out.println("Name of t1 Thread after changed : "+t1.getName());
		System.out.println("Name of main Thread after chnaged : "+Thread.currentThread().getName());
		Thread t2=new Thread(r1,"t2 Thread");
		System.out.println("Name of t2 Thread after changed : "+t2.getName());
		int a[]= {1,2,3};
		System.out.println(a[5]);
		

	}

}



//
//output:
//	Name of t1 Thread  : Thread-0
//	Name of main Thread : main
//	Name of t1 Thread after changed : t1 Thread
//	Name of main Thread after chnaged : Main thread Changed
//	Name of t2 Thread after changed : t2 Thread
//	Exception in thread "Main thread Changed" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
//		at MultiThreading/MUltiThreading.set_get_ThreadName.main(set_get_ThreadName.java:25)


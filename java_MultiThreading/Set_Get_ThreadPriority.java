package MUltiThreading;

public class Set_Get_ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1=()->
		{
			for(int i=0;i<=10;i++)
			{
				System.out.print(i);
			}
		};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		
	System.out.println("default priority of main Thread  "+Thread.currentThread().getPriority());
	System.out.println("Default priority of t1 thread  "+t1.getPriority()); 
	System.out.println();
//	System.out.println("Name of t1 thread   :"+t1.getName());
//	System.out.println("Name of the main tread   :"+Thread.currentThread().getName());
	System.out.println();
	Thread.currentThread().setPriority(7);//highest priority
	t1.setPriority(3);
	
	System.out.println("priority of main Thread after changing  "+Thread.currentThread().getPriority());
	System.out.println("priority of t1 thread after changing "+t1.getPriority()); 
	
	
	System.out.println();
	
	for(char i='a';i<='g';i++)
	{
		System.out.print(i);
	}
	}

}

//
//output:
//	default priority of main Thread  5
//	Default priority of t1 thread  5
//	012345678910
//
//	priority of main Thread after changing  7
//	priority of t1 thread after changing 3
//
//	abcdefg

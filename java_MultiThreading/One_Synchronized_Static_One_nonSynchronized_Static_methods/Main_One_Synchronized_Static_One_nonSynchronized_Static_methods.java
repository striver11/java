package MUltiThreading;

public class Main_One_Synchronized_Static_One_nonSynchronized_Static_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		One_Synchronized_Static_One_nonSynchronized_Static_methods ob=new One_Synchronized_Static_One_nonSynchronized_Static_methods();
		
		Runnable r1,r2;
		
		r1=()->{
			try {
				One_Synchronized_Static_One_nonSynchronized_Static_methods.m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		r2=()->{
			try {
				ob.m2();//we can call static method with object also 
				//static methods can be called in 3 ways directly,through class name,with the help of the object
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();

	}


}

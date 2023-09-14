package MUltiThreading;

public class Main_One_Static_Synchronized_One_nonStatic_Synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		One_Static_Synchronized_One_nonStatic_Synchronized ob=new One_Static_Synchronized_One_nonStatic_Synchronized();
		
		//One_Static_Synchronized_One_nonStatic_Synchronized ob2=new One_Static_Synchronized_One_nonStatic_Synchronized();
		Runnable r1,r2;
		
		r1=()->{
			try {
			
				One_Static_Synchronized_One_nonStatic_Synchronized.m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		r2=()->{
			try {
				
				ob.m2();
				
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

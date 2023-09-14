package MUltiThreading;



public class Main_One_synchronized_static_one_nonSynchronized_nonStatic_menthods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		One_synchronized_static_one_nonSynchronized_nonStatic_menthods ob=new One_synchronized_static_one_nonSynchronized_nonStatic_menthods();
		
		
		Runnable r1,r2;
		r1=()->{
			try {
				One_synchronized_static_one_nonSynchronized_nonStatic_menthods.m1();
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

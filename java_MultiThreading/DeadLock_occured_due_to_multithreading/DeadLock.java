package MUltiThreading;

public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object1 o1= new Object1();
		Object2 o2= new Object2();
		
		Runnable r1=()->o1.m1(o2);
		Runnable r2=()->o2.m3(o1);
		
		Thread t1=new Thread(r1,"first thread");
		Thread t2=new Thread(r2,"second thread");
		
		t1.start();
		t2.start();

	}

}

package MUltiThreading;

public class Main_two_nonStatic_Synchronized_methods_DIRFFERENT_OBJECTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		two_nonStatic_Synchronized_methods_for_DIFFERENT_OBJECTS ob=new two_nonStatic_Synchronized_methods_for_DIFFERENT_OBJECTS();
		
		two_nonStatic_Synchronized_methods_for_DIFFERENT_OBJECTS ob2=new two_nonStatic_Synchronized_methods_for_DIFFERENT_OBJECTS();
		Runnable r1,r2;
		
		r1=()->{
			try {
				//one object
				ob.m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		r2=()->{
			try {
				//second object
				ob2.m2();//we can call static method with object also 
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

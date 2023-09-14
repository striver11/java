package MUltiThreading;

public class Main1_two_Static_Synchronized_methods_DIRFFERENT_OBJECTS_accessing_throught_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		two_Static_Synchronized_methods_DIRFFERENT_OBJECTS_accessing_throught_objects ob=new two_Static_Synchronized_methods_DIRFFERENT_OBJECTS_accessing_throught_objects();
		
		two_Static_Synchronized_methods_DIRFFERENT_OBJECTS_accessing_throught_objects ob2=new two_Static_Synchronized_methods_DIRFFERENT_OBJECTS_accessing_throught_objects();
		Runnable r1,r2;
		
		r1=()->{
			try {
				//one object
				ob.m1();//not recomended
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		r2=()->{
			try {
				//second object
				ob2.m2();//not recomended
				//we can call static method with object also 
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

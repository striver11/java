
//Singleton Class:
//	1.the class which allows only one object creation that class is considered as singleton class
//						or
//	1.Singleton class is a java class design pattern which allows only one object creation
//	
//	Things needed to create Singleton Class
//		1.static classType variable intialized with null
//		2.private constructor
//		3.static method with classType returnType
//		4.control statement or decisition making statement
//		
//		
		
class SingletonClass
{
	static SingletonClass instance=null;		//1.static classType variable intialized with null
	private SingletonClass()					//2.private constructor
	{
		System.out.println("these are the elements present inside the SingletonClass Private constructor");
	}
	
	public static SingletonClass getInstance()	//3.static method with classType returnType
	{
		if(instance==null)						//4.control statement or decisition making statement
		{
			instance=new SingletonClass();
		}
		return instance;
	}
}


public class SingletonClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SingletonClass.getInstance());
		System.out.println(SingletonClass.getInstance());
		
		SingletonClass ref=SingletonClass.getInstance();
		SingletonClass ref2=SingletonClass.getInstance();
		System.out.println(ref);
		System.out.println(ref2);
		

	}

}


//output:
//these are the elements present inside the SingletonClass Private constructor
//PhoneBook.SingletonClass@52cc8049
//PhoneBook.SingletonClass@52cc8049
//PhoneBook.SingletonClass@52cc8049
//PhoneBook.SingletonClass@52cc8049

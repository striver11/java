package PhoneBook;

class SingletonClass
{
	static SingletonClass instance=null;
	private SingletonClass()
	{
		System.out.println("these are the elements present inside the SingletonClass Private constructor");
	}
	
	public static SingletonClass getInstance()
	{
		if(instance==null)
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

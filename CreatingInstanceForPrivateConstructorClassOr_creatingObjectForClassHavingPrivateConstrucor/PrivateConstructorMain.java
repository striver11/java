package PhoneBook;


class PrivateConstructor
{
	private PrivateConstructor()
	{
		System.err.println("These are the elements present in the PrivateConstructor");
	}
	
	public static PrivateConstructor staticMethodForCreatingAndReturningInstance()
	{
		return new PrivateConstructor();
	}
}

public class PrivateConstructorMain {

	public static void main(String [] args)
	{
		System.out.println("program starts");
		PrivateConstructor.staticMethodForCreatingAndReturningInstance();
		System.out.println("program ends");
	}

}


//here output may vary due to multithreading:
//	
//	output 1:
//	program starts
//	These are the elements present in the PrivateConstructor
//	program ends
//
//	output 2:
//	program starts
//	program ends
//	These are the elements present in the PrivateConstructor

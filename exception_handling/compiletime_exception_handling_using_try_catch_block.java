package exception_handling;

public class compiletime_exception_handling_using_try_catch_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program starts");
		
		try {
			Thread.sleep(2000);
			}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		System.out.println("exicution ends");

	}

}


//output:
//program starts
//exicution ends


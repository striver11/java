package exception_handling;
import java.util.*;
public class Real_time_example_for_customized_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to shaadi.com");
		System.out.println("here you can find perfect partner");
		System.out.println("==================================");
		System.out.println("enter your phone number");
		long ph=sc.nextLong();
		System.out.println("enter your age");
		int age=sc.nextInt();
		
		if(age<21)
		{
			throw new TooYoungException("babu pakkaku velli aduko");
		}
		else if(age>45)
		{
			throw new TooOldException("thathayya control ayya");
		}
		else
		{
			System.out.println("successfully registered");
		}
	}

}



// output:1
// welcome to shaadi.com
// here you can find perfect partner
// ==================================
// enter your phone number

// 5454654646
// enter your age
// 55
// Exception in thread "main" exception_handling.TooOldException: thathayya control ayya
// 	at exception_handling/exception_handling.Real_time_example_for_customized_exception.main(Real_time_example_for_customized_exception.java:22)



// output:2
// welcome to shaadi.com
// here you can find perfect partner
// ==================================
// enter your phone number
// 654654
// enter your age
// 16
// Exception in thread "main" exception_handling.TooYoungException: babu pakkaku velli aduko
// 	at exception_handling/exception_handling.Real_time_example_for_customized_exception.main(Real_time_example_for_customized_exception.java:18)

// ouput:3
// welcome to shaadi.com
// here you can find perfect partner
// ==================================
// enter your phone number
// 65464654
// enter your age
// 44
// successfully registered


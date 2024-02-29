
import java.util.*;
public class Fibonnaci {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int a=0;
		int b=1;
		int t=0;
		for(int i=1;i<=n;i++)
	 {
		System.out.println(a);
		t=a+b;
		a=b;
		b=t;
		
	 } 

	}
}


// enter no of elements
// 5
// 0
// 1
// 1
// 2
// 3

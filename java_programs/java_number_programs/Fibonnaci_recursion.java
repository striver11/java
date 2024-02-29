
import java.util.Scanner;
public class Fibonnaci_recursion {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int a=0;
        int b=1;
        int c=0;
        fibonnaci(a,b,c,n);
    }
    private static void fibonnaci(int a, int b, int c, int n)
    {
        System.out.println(a);
        int t=a+b;
        a=b;
        b=t;
        c++;
        if(c<=n)
        {
            fibonnaci(a,b,c,n);
        }
      
        
    }
}

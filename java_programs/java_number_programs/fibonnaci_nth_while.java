
import java.util.Scanner;
public class fibonnaci_nth_while {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        int t=0;
        int c=0;
        while(c<n-1)
        {
             t=n1+n2;
            n1=n2;
            n2=t;
            c++;
            
            
             
        }
        System.out.println(n1);
       

    
}
}

//output
// 3
// 1

package numbers;
import java.util.*;

public class Prime_Nth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
	        int p=1;
	        int v=0;
	        int c=0;
	        while(c!=n)
	        {
	            
	            int g=0;
	            for(int i=1;i<=p;i++)
	            {
	                if(p%i==0)
	                {
	                    g++;
	                }

	            }
	            if(g==2)
	            {
	                c++;
	                v=p;
	            }
	            p++;
	        }
	        System.out.println(v);

	}

}

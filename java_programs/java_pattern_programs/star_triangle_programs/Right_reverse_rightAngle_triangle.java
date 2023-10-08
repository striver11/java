package star_triangle_patterns;
import java.util.*;

//8
//* * * * * * * * 
//  * * * * * * * 
//    * * * * * * 
//      * * * * * 
//        * * * * 
//          * * * 
//            * * 
//              * 

public class Right_reverse_rightAngle_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=j)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		

	}

}

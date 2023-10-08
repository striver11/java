package star_triangle_patterns;

//8
//              * 
//	      * * * 
//          * * * * * 
//        * * * * * * * 
//      * * * * * * * * * 
//    * * * * * * * * * * * 
//  * * * * * * * * * * * * * 
//* * * * * * * * * * * * * * *



import java.util.*;
public class Triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int m=1;m<=n-i;m++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		

	}

}

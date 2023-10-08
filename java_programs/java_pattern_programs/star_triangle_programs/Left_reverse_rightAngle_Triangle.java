package star_triangle_patterns;

//8
//* * * * * * * * 
//* * * * * * *   
//* * * * * *     
//* * * * *       
//* * * *         
//* * *           
//* *             
//*          

import java.util.*;
public class Left_reverse_rightAngle_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(i+j<=n+1)
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

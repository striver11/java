package star_triangle_patterns;


//enter no of row
//8
//      * 
//    * * * 
//  * * * * * 
//* * * * * * * 
//  * * * * * 
//    * * * 
//      *


import java.util.*;

public class Diamond_star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        
	        System.out.println("enter no of row");
	        
	        int r=scan.nextInt();
	        
	        int space=(r-1)/2;
	        int star=1;
	        for (int i=1; i<=r ; i++)
	    
	        {
//	        	System.out.println(i);
	            for(int j=1;j<=space;j++)
	            {
	                System.out.print(" "+" ");
	            }
	            for(int k=1;k<=star;k++)
	            {   
	                System.out.print("*"+" ");
	            }
	            System.out.println();
	           
	             if(i<(r+1)/2)
	            {
	                space--;
	                star+=2;
	            }
	            else
	            {
	                space++;
	                star-=2;
	            }
	        }

	}

}

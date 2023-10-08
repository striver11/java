package star_triangle_patterns;

//8
//* * * * * * * * * * * * * * * 
//  * * * * * * * * * * * * * 
//    * * * * * * * * * * * 
//      * * * * * * * * * 
//        * * * * * * * 
//          * * * * * 
//            * * * 
//              *

import java.util.*;
public class Reverse_triagnle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		for (int i = row; i >= 1; i--) {
			   for (int k = 1; k <= row - i; k++) { //first always print space in triagle
			        System.out.print(" " + " ");
			    }
		    for (int j = 1; j <= 2 * i - 1; j++) {
		        System.out.print("*" + " ");
		    }
		 
		    System.out.println();
		}
			
	}

}

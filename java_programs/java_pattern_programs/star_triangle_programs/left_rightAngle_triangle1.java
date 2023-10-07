package star_triangle_patterns;
import java.util.*;

//8
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * * * 
//* * * * * * * 
//* * * * * * * * 

public class left_rightAngle_triangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
	}

}

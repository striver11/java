package arraysa;
import java.util.*;

public class MutildimensionalArray_with_new_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int[] i:a)
		{
//			System.out.println(i);
			for(int j:i)
			{
				System.out.println(j);
			}
		}
		

	}

}

// output:
// 4
// 5
// 5
// 6
// 6
// 6
// 4
// 5
// 5
// 6
// 6
// 6


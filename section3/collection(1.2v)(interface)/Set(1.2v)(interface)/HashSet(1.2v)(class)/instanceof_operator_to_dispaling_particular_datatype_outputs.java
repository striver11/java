package package2;
import java.util.*;
public class instanceof_operator_to_dispaling_particular_datatype_outputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add('c');
		hs.add("Mohan");
		hs.add(true);
		hs.add(null);
		hs.add(null);
		hs.add(50.34d);
		hs.add("raj");
		hs.add(10);
		
		System.out.println("enter 1 to print only interger, \nenter 2 to print only character,\nenter 3 to print only string,\nenter 4 to print only boolean,\n enter 5 to print only double");
		System.out.println("-----------------------------");
		int b=3;
		
	
		for(Object a:hs)
		{
			
			if(b==1)
			{
			if(a instanceof Integer)
			{
				System.out.println(a);
			}
			}
			else if(b==2)
			{
				if(a instanceof Character)
				{
					System.out.println(a);
				}
			}
			else if(b==3)
			{
				if(a instanceof String)
				{
					System.out.println(a);
				}
			}
			else if(b==4)
			{
				if(a instanceof Boolean)
				{
					System.out.println(a);
				}
			}
			else if(b==5)
			{
				if(a instanceof Double)
				{
					System.out.println(a);
				}
			}
			
			
		}
		

	}

}


// output:
// enter 1 to print only interger, 
// enter 2 to print only character,
// enter 3 to print only string,
// enter 4 to print only boolean,
//  enter 5 to print only double
// -----------------------------
// Mohan
// raj

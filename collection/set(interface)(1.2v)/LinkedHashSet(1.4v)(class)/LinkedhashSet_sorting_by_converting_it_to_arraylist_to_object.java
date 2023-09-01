package gpay;
import java.util.*;
public class LinkedhashSet_sorting_by_converting_it_to_arraylist_to_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		System.out.println("learn why are making LinkedHashSet as generic by adding <Integer>");
		
		lhs.add(50);
		lhs.add(10);
		lhs.add(74);
		lhs.add(20);
		lhs.add(10);
		lhs.add(40);
		System.out.println(lhs);
		
		
		   // Create a copy of lhs
        ArrayList<Integer> al = new ArrayList<>(lhs);

        // Sort the ArrayList using Collections.sort
        //Collections.sort(al);

        // Print the sorted ArrayList
        //System.out.println(al);

        // Convert lhs to an Object array
        
        
        System.out.println("why we are converting it to Object array");
        Object[] o = lhs.toArray();
		for(int i=0;i<o.length;i++)
		{
			for(int j=1;j<o.length-i;j++)
			{
				if((Integer)o[j-1]>(Integer)o[j])
				{
					Integer k=(Integer)o[j-1];
					o[j-1]=o[j];
					o[j]=k;
				}
			}
		}
		
		System.out.println("why it is printing address not object array"+o.toString());
		
		for(Object k:o)
		{
			System.out.println(k+" ");
		}
		 // Create a new ArrayList from the sorted Object array
        ArrayList<Integer> ha = new ArrayList<>();
        for (Object obj : o) {
            ha.add((Integer) obj);
        }

        // Print the ArrayList ha
        System.out.println("sorted ArrayList after converting :"+ha);
		
		
	}

}

//output:
//learn why are making LinkedHashSet as generic by adding <Integer>
//[50, 10, 74, 20, 40]
//[50, 10, 74, 20, 40]
//why we are converting it to Object array
//why it is printing address not object array[Ljava.lang.Object;@5b6f7412
//10
//20 
//40 
//50 
//74 
//sorted ArrayList after converting :[10, 20, 40, 50, 74]



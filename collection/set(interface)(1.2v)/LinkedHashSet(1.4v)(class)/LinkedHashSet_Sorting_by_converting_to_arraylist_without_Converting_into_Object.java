

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSet_Sorting_by_converting_to_arraylist_without_Converting_into_Object {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(50);
		lhs.add(10);
		lhs.add(74);
		lhs.add(20);
		lhs.add(10);
		lhs.add(40);
		System.out.println(lhs);
		
		ArrayList<Integer> al=new ArrayList<Integer>(lhs);
		System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);
		
//		Object[] o=lhs.toArray();
		for(int i=0;i<al.size();i++)
		{
		for(int j=i+1;j<al.size();j++)
		{
			if(al.get(i)>al.get(j))
				{
					Integer k=al.get(i);
					al.set(i, al.get(j));
					al.set(j, k);
				}
			}
		}
		
		
		for(Object k:al)
		{
			System.out.println(k+" ");
		}
		
		System.out.println("sorted ArrayList "+al);
//		
	}

}

//OUtput:
//[50, 10, 74, 20, 40]
//[50, 10, 74, 20, 40]
//10 
//20 
//40 
//50 
//74 



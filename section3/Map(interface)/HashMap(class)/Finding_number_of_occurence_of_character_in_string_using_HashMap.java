package HashMap3;
import java.util.*;

public class Finding_number_of_occurence_of_character_in_string_using_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//taking a string
		String s="hello this is a string";
		
		//converting string to char array
		char cha[]=s.toCharArray();
		
		//creating HashMap
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		//iterating over  array c
		 for(char c:cha)
		 {
			 if(map.containsKey(c))
			 {
				 map.put(c,map.get(c)+1);
				 //we can use the replace here
				  //map.replace(c,map.get(c)+1);
			 }
			 else
			 {
				 map.put(c, 1);
			 }
		 }
		 
		 //printing map after updating it
		 System.err.println(map);
		
		

	}

}


//output:
//{ =4, a=1, r=1, s=3, t=2, e=1, g=1, h=2, i=3, l=2, n=1, o=1}

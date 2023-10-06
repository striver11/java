package HashMap3;
import java.util.*;
//did not understand it properly
public class Synchronized_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Creating the HashMap 
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
       //adding elements in HashMap
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("hello", 5454);
        map.put("raj", 654654);
        map.put("z", 646);
        System.out.println(map);
        
        //synchronizing the HashMap
        Map<String, Integer> syncMap = Collections.synchronizedMap(map);
        syncMap.put("eagle", 5);
        syncMap.put("fotk",6);
        syncMap.put("g", 7);
        syncMap.put("h", 8);
        System.out.println(syncMap);
        
        

	}

}


//
//output:
//{a=1, b=2, c=3, d=4, raj=654654, z=646, hello=5454}
//{fotk=6, a=1, b=2, c=3, d=4, g=7, eagle=5, h=8, raj=654654, z=646, hello=5454}

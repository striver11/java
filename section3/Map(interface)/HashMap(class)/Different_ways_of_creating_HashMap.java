package HashMap3;
import java.util.*;

public class Different_ways_of_creating_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.creating HashMap with default capacity and load factor
		HashMap<String,Integer> map1=new HashMap<String,Integer>();
		
		//2.creating HashMap with with capacity 30 and default load factor
		HashMap<String,Integer> map2=new HashMap<String,Integer>(30);
		
		
		//3.creating HashMap with with capacity 30 and 0.5 as the load factor
		HashMap<String,Integer> map3=new HashMap<String,Integer>(30,0.5f);
		
		//4.creating HashMap from another Hashmap
		
		HashMap<String,Integer> map4=new HashMap<String,Integer>(map1);
		
		
		
		
		
		//

	}

}

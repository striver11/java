package HashMap3;

//importing util as all the collection are present in it
import java.util.*;
import java.util.Map.Entry;

public class Adding_key_value_paris_into_if_they_are_not_already_preasent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating HashMap
		HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
		
		//adding the elements into the HashMap
		map1.put('a', 1);
		map1.put('b', 2);
		map1.put('c', 3);
		
		System.err.println("printing the HashMap");
		System.out.println(map1);
		System.out.println();
		
		//adding the elements into the HashMap if they are not already present
		System.err.println("adding the elements into the HashMap if they are not already present");
		
		map1.putIfAbsent('d', 4);
		map1.putIfAbsent('e', 5);
		//adding the same key value
		map1.putIfAbsent('a', 1);
		//adding the same key and different value
		map1.putIfAbsent('b', 3);
		//adding different key and same value
		map1.putIfAbsent('f',2);
		System.out.println();
		System.err.println("from the above code we were able to say that it mainly depends on key not value");
		System.out.println("printing updated HashMap");
		System.out.println(map1);
		
		
		//iterating using key value pair
		for(Map.Entry<Character, Integer> m:map1.entrySet())
		{
			System.out.println(m.getKey()+"====>"+m.getValue());
		}
		
		System.out.println();
		
		//creating to Set to store the object of the Map.Entry<K, V>  interface which i don't know how it works
		
		Set<Entry<Character,Integer>> entrySet=map1.entrySet();
		
		for(Entry<Character,Integer> m:map1.entrySet())
		{
			System.err.println(m.getKey()+"--->"+m.getValue());
		}
		
		
		
	}

}


//output:
//	printing the HashMap
//	{a=1, b=2, c=3}
//
//	adding the elements into the HashMap if they are not already present
//
//	from the above code we were able to say that it mainly depends on key not value
//	printing updated HashMap
//	{a=1, b=2, c=3, d=4, e=5, f=2}
//	a====>1
//	b====>2
//	c====>3
//	d====>4
//	e====>5
//	f====>2
//
//	a--->1
//	b--->2
//	c--->3
//	d--->4
//	e--->5
//	f--->2


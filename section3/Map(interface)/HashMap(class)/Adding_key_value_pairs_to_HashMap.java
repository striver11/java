package HashMap3;
import java.util.*;

// if we don't write the below import it will raise the error at line 40 and 41 why	
import java.util.Map.Entry;



public class Adding_key_value_pairs_to_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//creating Generic HashMap
		HashMap<String,Integer> map1=new HashMap<String,Integer>();
		
		
		//adding the key values into in HashMap
		
		map1.put("java", 65);
		map1.put("c", 40);
		map1.put("python", 80);
		map1.put("sql", 60);
		map1.put("javascript", 30);
		
		
		//printing the HashMap
		System.err.println("pinting the HashMap");
		System.out.println(map1);
		System.out.println();
		System.out.println();
		//printing the HashMap as key value pair using foreach loop
		System.err.println("printing the HashMap as key value pair using foreach loop");
		
		System.err.println("learn more about Entry and Map.Entry interface");
		for(Map.Entry<String, Integer> m:map1.entrySet())
		{
			System.out.println(m.getKey()+"----->"+m.getValue());
		}
		
		
		System.out.println("creating Set to store the values of represented as instances of Map.Entry<String, Integer>.");
		 Set<Entry<String, Integer>> entrySet = map1.entrySet();
		 
		 System.err.println("printing entrySet");
		 System.out.println(entrySet);
		 
		 System.out.println();
		 for (Entry<String, Integer> entry : entrySet) 
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
	         
		
		
		//creating another HashMap
		HashMap<String,Integer> map2=new HashMap<String,Integer>();
		
		map2.put("react", 20);
		map2.put("ruby", 0);
	
		//putting map1 into the map2
		map2.putAll(map1);
		System.out.println();
		//printing the map2
		System.err.println("printing the map2");
		System.out.println(map2);
		
		

	}

}

//output:
//pinting the HashMap
//{python=80, java=65, c=40, javascript=30, sql=60}
//
//
//printing the HashMap as key value pair using foreach loop
//learn more about Entry and Map.Entry interface
//python----->80
//java----->65
//c----->40
//javascript----->30
//sql----->60
//creating Set to store the values of represented as instances of Map.Entry<String, Integer>.
//printing entrySet
//[python=80, java=65, c=40, javascript=30, sql=60]
//
//python : 80
//java : 65
//c : 40
//javascript : 30
//sql : 60
//
//printing the map2
//{python=80, java=65, c=40, react=20, javascript=30, ruby=0, sql=60}

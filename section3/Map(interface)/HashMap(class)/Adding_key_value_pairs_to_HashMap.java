package HashMap3;
import java.util.*;

public class Adding_key_value_pairs_to_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map1=new HashMap<String,Integer>();
		
		map1.put("java", 60);
		map1.put("c",40);
		map1.put("javascript", 40);
		map1.put("sql", 70);
		map1.put("python", 80);
		
		System.err.println("printing the HashMap as whole");
		System.out.println(map1);
		
		System.out.println();
		
		System.err.println("printing the HashMap with key value pair");
		for(Map.Entry<String, Integer> m:map1.entrySet())
		{
			System.out.println(m.getKey()+"---->"+m.getValue());
		}
		

	}

}

//
//output:
//	printing the HashMap as whole
//	{python=80, java=60, c=40, javascript=40, sql=70}
//
//	printing the HashMap with key value pair
//	python---->80
//	java---->60
//	c---->40
//	javascript---->40
//	sql---->70

package Collection1;
import java.util.*;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "java");
		hm.put(2, "web");
		hm.put(3, "sql");
		hm.put(4, "java");
		hm.put(6, "hello");
		
		for(Map.Entry<Integer,String> m:hm.entrySet())
		{
			if(m.getKey()%2==0)
			{
				System.out.println(m.getValue());
			}
			
		}
		
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		for(Map.Entry<Integer,String> m:hm.entrySet())
		{
			
				System.out.println(m.getKey()+" - "+m.getValue());
			
		}
		
		//display only keys
		for(Integer i:hm.keySet())
		{
			System.out.println(i);
		}
		//display only values
		for(String s:hm.values())
		{
			System.out.println(s);
		}
		
		Iterator<Map.Entry<Integer, String>> i=hm.entrySet().iterator();
		while(i.hasNext())
		{
			Map.Entry<Integer,String> x=i.next();
			System.out.println(x.getKey()+"----->"+x.getValue());
		}
		
	}

}


// output:
// web
// java
// hello
// [1, 2, 3, 4, 6]
// [java, web, sql, java, hello]
// 1 - java
// 2 - web
// 3 - sql
// 4 - java
// 6 - hello
// 1
// 2
// 3
// 4
// 6
// java
// web
// sql
// java
// hello
// 1----->java
// 2----->web
// 3----->sql
// 4----->java
// 6----->hello


package HashMap3;

import java.util.HashMap;

public class Check_wether_keyORvalue_exists_SizeOfHashMap_remove_KeyValuePair_remove_keyvaluePair_clearHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creting HashMap
				HashMap<String,Integer> map1=new HashMap<String,Integer>();
				//we are getting error because we did not import HashMap which is in uitl package
				
				//adding elements in to HashMap
				map1.put("a", 1);
				map1.put("b", 2);
				map1.put("c", 3);
				map1.put("d", 4);
				
				//getting value associated with the key
				int value=map1.get("c");
				
				
				System.out.println("the value associate with the key \"c\" is :"+value);
				
				//check whether the key is present or not
				
				System.out.println();
				System.err.println("check whether the key is present or not");
					System.out.println("contains given key "+map1.containsKey("a"));
					
					System.out.println();
				//checking whether the value is present or not
					System.err.println("checking whether the value is present or not");
					System.out.println("contains given value "+map1.containsValue(3));
					
					System.out.println();
					//finding the size of the HashMap
					System.err.println("finding the size of the HashMap");
					System.out.println(map1.size());
					
					
					System.err.println("removing key value from The HashMap");
					System.out.println(map1.remove("a", map1));
					System.out.println(map1.remove("c"));
					
					
					//clearing the HashMap
					
					//System.out.println(map1.clear());
					map1.clear();
					System.out.println("the size of HashMap after clearing the HashMap for the reuse :"+map1.size());
					
					

	}

}


//output:
//	the value associate with the key "c" is :3
//	check whether the key is present or not
//
//	contains given key true
//
//	checking whether the value is present or not
//	contains given value true
//
//	finding the size of the HashMap
//	4
//	removing key value from The HashMap
//	false
//	3
//	the size of HashMap after clearing the HashMap for the reuse :0



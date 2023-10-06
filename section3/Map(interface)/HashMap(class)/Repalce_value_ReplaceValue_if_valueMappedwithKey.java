package HashMap3;

import java.util.HashMap;

public class Repalce_value_ReplaceValue_if_valueMappedwithKey {

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
		
		//replacing value 
		map1.replace("a", 10);
		System.out.println("HasMap after updation :"+map1);
		System.out.println();
		
		map1.replace("b",2,25454);
		map1.replace("c", 45, 34);
		System.out.println("HashMap after updating only when value mapped"+map1);

	}

}

//output:
//	HasMap after updation :{a=10, b=2, c=3, d=4}
//
//	HashMap after updating only when value mapped{a=10, b=25454, c=3, d=4}

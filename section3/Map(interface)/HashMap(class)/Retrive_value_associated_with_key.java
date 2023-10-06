package HashMap3;
import java.util.*;

//in this program we are goint to retrive value associated with key



public class Retrive_value_associated_with_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creting HashMap
		HashMap<String,Integer> map1=new HashMap<String,Integer>();
		//we are getting error because we did not import HashMap which is in uitl package
		
		//adding elements in to HashMap
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		
		//getting value associated with the key
		int value=map1.get("c");
		
		
		System.out.println("the value associate with the key \"c\" is :"+value);
		
		

	}

}


//output:
//	the value associate with the key "c" is :3

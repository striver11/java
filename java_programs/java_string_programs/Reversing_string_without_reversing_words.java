package Stringp;
import java.util.*;
public class Reversing_string_without_reversing_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String g="this is advanced java class";
		 String a[]=g.split(" ");
		 String h="";
		 for(String b:a)
		 {
			 h=b+" "+h;
		 }
		 System.out.println(h);
		
		
	}

}


//output:
//	class java advanced is this 

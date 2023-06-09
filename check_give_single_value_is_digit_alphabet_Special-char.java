package jspiders_anupama_mam;
import java.util.Scanner;
public class Prime {
	

public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
 System.out.println("please enter a single value :");
	char j=	scan.next().charAt(0);
	int k=(int) j;
if((k>=65&&k<=90)||((k>=97)&&(k<=122)))
		{
	System.out.println("alphabet");
		}
else if(k>=48&&k<=57)
{
	System.out.println("digit");
}
else
{
	System.out.println("Special character");
}
}

}

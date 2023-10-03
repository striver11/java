package Collection1;
import java.util.*;
public class FacultyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator sortByEmpId=(o1,o2)->
		{
			Faculty f1=(Faculty)o1;
			Faculty f2=(Faculty)o2;
			
			if(f1.emp_id<f2.emp_id)
				return -454;
			else if(f1.emp_id==f2.emp_id)
				return 0;
			else
				return 64654;
						
		};
		
		Comparator sortByName=(o1,o2)->
		{
			Faculty f1=(Faculty)o1;
			Faculty f2=(Faculty)o2;
			return f1.name.compareTo(f2.name);
		};
		
		Comparator sortBySub=(o1,o2)->
		{
			Faculty f1=(Faculty)o1;
			Faculty f2=(Faculty)o2;
			return f1.sub.compareTo(f2.sub);
		};
		
		Comparator sortBySalary=(o1,o2)->
		{
			Faculty f1=(Faculty)o1;
			Faculty f2=(Faculty)o2;
			
			if(f1.salary<f2.salary)
				return -454;
			else if(f1.salary==f2.salary)
				return 0;
			else
				return 64654;
						
		};
		
		ArrayList<Faculty> a1=new ArrayList<Faculty>();
		a1.add(new Faculty(45,"raj","java",15465464));
		a1.add(new Faculty(54,"jai","sql",6546546));
		a1.add(new Faculty(87,"raj","web",4656464));
		a1.add(new Faculty(57,"ravi","java",465645));
		a1.add(new Faculty(54,"kali","oracle",446546));
		
		
		System.out.println("========================");
		
		
		System.out.println("Before sorting");
		System.out.println("------------------------------------");
		//before sorting
		for(Faculty f:a1)
		{
			System.out.println(f);
		}
		
		System.out.println();
		
		System.out.println("sort by name");
		System.out.println("------------------------------------");
		//sort by Name
		Collections.sort(a1,sortByName);
		
		for(Faculty f:a1)
		{
			System.out.println(f);
		}
		
		
		System.out.println();
		//sort by salary
		
		System.out.println("sort by salary");
		System.out.println("------------------------------------");
Collections.sort(a1,sortBySalary);
		
		for(Faculty f:a1)
		{
			System.out.println(f);
		}
		
		System.out.println();
		
		
		//sort by subject
		
		System.out.println("sort by subject");
		System.out.println("------------------------------------");
Collections.sort(a1,sortBySub);
		
		for(Faculty f:a1)
		{
			System.out.println(f);
		}
		
		System.out.println();
		
		
		
		//sort by empid
		
		System.out.println("sort by empid");
		System.out.println("------------------------------------");
Collections.sort(a1,sortByEmpId);
		
		for(Faculty f:a1)
		{
			System.out.println(f);
		}
		
		
		
		
		
		
	}

}



// output:
// ========================
// Before sorting
// ------------------------------------
// Faculty [emp_id=45, name=raj, salary=1.5465464E7, sub=java]
// Faculty [emp_id=54, name=jai, salary=6546546.0, sub=sql]
// Faculty [emp_id=87, name=raj, salary=4656464.0, sub=web]
// Faculty [emp_id=57, name=ravi, salary=465645.0, sub=java]
// Faculty [emp_id=54, name=kali, salary=446546.0, sub=oracle]

// sort by name
// ------------------------------------
// Faculty [emp_id=54, name=jai, salary=6546546.0, sub=sql]
// Faculty [emp_id=54, name=kali, salary=446546.0, sub=oracle]
// Faculty [emp_id=45, name=raj, salary=1.5465464E7, sub=java]
// Faculty [emp_id=87, name=raj, salary=4656464.0, sub=web]
// Faculty [emp_id=57, name=ravi, salary=465645.0, sub=java]

// sort by salary
// ------------------------------------
// Faculty [emp_id=54, name=kali, salary=446546.0, sub=oracle]
// Faculty [emp_id=57, name=ravi, salary=465645.0, sub=java]
// Faculty [emp_id=87, name=raj, salary=4656464.0, sub=web]
// Faculty [emp_id=54, name=jai, salary=6546546.0, sub=sql]
// Faculty [emp_id=45, name=raj, salary=1.5465464E7, sub=java]

// sort by subject
// ------------------------------------
// Faculty [emp_id=57, name=ravi, salary=465645.0, sub=java]
// Faculty [emp_id=45, name=raj, salary=1.5465464E7, sub=java]
// Faculty [emp_id=54, name=kali, salary=446546.0, sub=oracle]
// Faculty [emp_id=54, name=jai, salary=6546546.0, sub=sql]
// Faculty [emp_id=87, name=raj, salary=4656464.0, sub=web]

// sort by empid
// ------------------------------------
// Faculty [emp_id=45, name=raj, salary=1.5465464E7, sub=java]
// Faculty [emp_id=54, name=kali, salary=446546.0, sub=oracle]
// Faculty [emp_id=54, name=jai, salary=6546546.0, sub=sql]
// Faculty [emp_id=57, name=ravi, salary=465645.0, sub=java]
// Faculty [emp_id=87, name=raj, salary=4656464.0, sub=web]

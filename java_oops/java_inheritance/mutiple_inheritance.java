package strings;

interface InterfaceOne
{
	void m1();
	void m2();
}

interface InterfaceTwo
{
	void m3();
	void m4();
}


public class MutipleInheritance implements InterfaceTwo,InterfaceOne{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MutipleInheritance ob=new MutipleInheritance();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("this is m1 method ");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("this is m2 method ");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("this is m3 method ");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("this is m4 method ");
	}



}

//output:
//	this is m1 method 
//	this is m2 method 
//	this is m3 method 
//	this is m4 method 

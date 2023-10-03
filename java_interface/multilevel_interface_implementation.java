package strings;

interface test
{
	void m1();
	void m2();
}
interface test1 extends test
{
	void m3();
	void m4();
}
class Test3 implements test{
	public static void main(String [] args)
	{
		Test3 ob2=new Test3();
		ob2.m1();
		ob2.m2();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("this is m1 test providing implemented in Test3");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("this is m2 test providing implemented in Test3");
	}
}


public class multilevel_interface_implementation implements test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multilevel_interface_implementation ob=new multilevel_interface_implementation();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("this is m1 method");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("this is m2 method");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("this is m3 method");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("this is m4 method");
	}

}


// output:
// this is m1 method
// this is m2 method
// this is m3 method
// this is m4 method

// This is nothing but upcasting when parent and child have the same method name .here after upcasting(storing Child class object in Parent class reference variable) we will get the implementation of the child class
//   even thought we are trying to access the method with Parent class reference 

//   we do upcasting as we know that we will be knowing what are the methods presenet in Parent class and this methods will we Overrided and preseent in all the child classes so we don't have to read all the child classes
//   code to find what methods to call from the Parent  class and if we don't use upcasting we have to create object for every child class seperately 

//   This is very useful when we are dealing with heirarchical inheritance as in this one Parent class methods will be present in all the child class an overrided so for every class we can have different implementation
//   of methods and we can do this with same reference variable(i.e Parent class reference variable) 


public class Parent {

	public void method()
	{
		System.out.println("this is parent class implementation");
	}
	
	public static void main(String args[])
	{
    Parent p;
		p=new Child();
		p.method();
   // p.mehtod2(); it will throw compile time error as parent does not contain this method
    p=new Child2();
    p.method();
		
	}

}

class Child extends Parent
{
	public void method()
	{
		System.out.println("this is the child class");
	}
  public void method2()
	{
		System.out.println("this is the child class mehtod()2");
	}
}

class Child2 extends Parent
{
	public void method()
	{
		System.out.println("this is the child2 class");
	}
}

// output:
// this is the child class
//this is the child class2

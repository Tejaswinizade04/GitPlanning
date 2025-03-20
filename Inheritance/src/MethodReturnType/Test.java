package MethodReturnType;

public class Test 
{
	public A m1()
	{
		A a=new A();
		B b=new B();
		C c=new C();
		
		return a;
		//return b;
		//return c;
	}
	public B m2()
	{
		A a=new A();
		B b=new B();
		C c=new C();
		
		//return a;
		return b;
		//return c;
		
	}
	public C m3()
	{
		A a=new A();
		B b=new B();
		C c=new C();
		
		
	    //return a;
		//return b;
		return c;
		
	}
}



package TypeCasting;

public class Test 
{
	public B m1()
	{
		B b1=new B();
		b1.x=100;
		return b1;
	}
	public A m2()
    {
		B b2=new B();
		b2.x=300;
		return b2;
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		 B b1=t.m1();
		 System.out.println(b1.x);
		 
		 B b2=(B)t.m2();
		 System.out.println(b2.x);
		 
		 
		 
		 
	
		
	}
}


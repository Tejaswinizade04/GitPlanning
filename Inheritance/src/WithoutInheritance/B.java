package WithoutInheritance;

public class B 
{
	public void m2()
	{
		A a=new A();
		a.m1();
		System.out.println(a.x);
	}
}



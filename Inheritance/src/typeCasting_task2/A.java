package typeCasting_task2;

public class A {


	public Object m1()
	{
		return  "aa";
	}
	public Object m2()
	{
		return 20.0f;
	}
	public Object m3()
	{
		return  12;
	}
	public Object m4()
	{
		return  3.333;
	}
	public Object m5()
	{
		return  54l;
	}
	public Object m6()
	{
		return  's';
	}
	public static void main(String[] args) 
	{
		A a=new A();
		
		String s=(String)a.m1();
		System.out.println(s);
		
		float f=(float)a.m2();
		System.out.println(f);
		
		int n=(int)a.m3();
		System.out.println(n);
		
		double d=(double)a.m4();
		System.out.println(d);
		
		long l=(long)a.m5();
		System.out.println(l);
		
		char c=(char)a.m4();
		System.out.println(c);
			
	}
	
}

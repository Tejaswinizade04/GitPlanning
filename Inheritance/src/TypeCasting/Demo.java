package TypeCasting;

public class Demo 
{
	public Object m1()
	{
		return 10;
	}
	public Object m2()
	{
		return "abc";
	}
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		
		int x=(int)d.m1();
		System.out.println(x);
		
		String s=(String)d.m2();
		System.out.println(s);
		
	}
}


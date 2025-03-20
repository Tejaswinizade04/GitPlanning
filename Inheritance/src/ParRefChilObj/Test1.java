package ParRefChilObj;

public class Test1
{
	public static void main(String[] args) 
	{
		A1 a=new B1();
		
		a.m1();
		a.m2();
	   //a.m3();
		
		System.out.println(a.a);
		System.out.println(a.b);
		//System.out.println(a.c);
		
		
	}

}

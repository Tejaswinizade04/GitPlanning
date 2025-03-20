package ParRefChilObj;

public class TestGFC 
{
	public static void main(String[] args) 
	{
		Child child=new Child();
		child.m6();
		
		int bb=child.bankbalance;
		System.out.println(bb);
		
		child.m3();
		child.m4();
		child.m1();
		child.m5();
		
		Father f1=new Child();
		f1.m1();
		f1.m3();
		f1.m4();
		System.out.println(f1.bankbalance);
		
		GrandFather gf=new Child();
		gf.m1();
		gf.m3();
		System.out.println(gf.bankbalance);
	
		
	}

}

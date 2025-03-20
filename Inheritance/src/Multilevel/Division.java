package Multilevel;

public class Division extends Multiplication
{
	int a=6;
	int b=2;
	
	public void Div()
    {
		
		Mul();
		System.out.println("Division Method");
		
		int c=a/b;
		System.out.println(c);
	}

}

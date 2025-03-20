package ParRefChilObj;

public class TestUni
{
	public static void main(String[] args) 
	{
		
		
        University u=new Collage();
		u.Uni1();
		u.Uni2();
		System.out.println(u.id);
		
		
		Collage c=new Student();
		c.clg2();
		c.clg1();
		c.Uni1();
		c.Uni2();
		System.out.println(c.id);
		
		Student s=new Student();
		s.Stu1();
		s.Stu2();
		s.clg1();
		s.clg2();
		s.Uni1();
		s.Uni2();
		System.out.println(s.id);
	}

}


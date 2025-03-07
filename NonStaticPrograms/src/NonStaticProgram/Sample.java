package NonStaticProgram;

public class Sample {
	int a;
	String s;
	
	public static void main(String[] args)
	{
		Sample s1 = new Sample();
		s1.a=10; s1.s="java";
		
		Sample s2 = new Sample();
		s2.a=50; s2.s="python";
		
		System.out.println(s1.a);
		System.out.println(s2.a);
		System.out.println(s1.s);
		System.out.println(s2.s);
		
	}

}

package NonStaticProgram;

public class Sample2 {

	int a = 40;
	String s = "Programming";
	
	public static void main(String[] args)
	{
		Sample2 s1 = new Sample2();
		System.out.println(s1.a+" "+s1.s);
		
		Sample2 s2 = new Sample2();
		System.out.println(s2.a+" "+s2.s);
	}
	
}

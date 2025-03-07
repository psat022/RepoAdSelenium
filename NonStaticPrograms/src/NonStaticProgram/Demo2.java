package NonStaticProgram;

public class Demo2 
{
	int a;
	String s;
	
	public static void main(String[] args)
	{
	Demo2 d = new Demo2();
	
	System.out.println(d.a); // 0
	System.out.println(d.s); //null
	
	}

}

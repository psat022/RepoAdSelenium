package NonStaticProgram;

public class Sample3 {
	
	int a;
	int b;
	
	public void display(int a, int b)
	{
	 this.a = a;
	 this.b = b;
	}

	public static void main(String[] args)
	{
		Sample3 s = new Sample3();
		s.display(10 , 20);
		
		System.out.println(s.a+" "+s.b);
		
	}
}

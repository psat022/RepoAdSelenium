package NonStaticProgram;

public class Demo3 {
	
	public void test()
	{
		System.out.println("test non static method is executing");
		
	}

	public void display()
	{
		System.out.println("display non static method is executing");
		test();
	}
	
	public static void main(String[] args)
	{
		Demo3 d = new Demo3();
		d.display();
	}
	

}


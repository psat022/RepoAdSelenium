package NonStaticProgram;

public class Program2 {
	
	int a = 50; //non static variable

	public void test()
	{
		int a =10; //local variable
		System.out.println(a); //10
		
		System.out.println(this.a); //50
	}
	
	public static void main(String[] args)
	{
		Program2 p = new Program2();
		p.test();
	}
}

package NonStaticProgram;

public class Wish {
	
	public void display()
	{
		System.out.println("non static display method is executing");
	}
	
	public static void main(String[] args)
	{
		Wish w1 = new Wish();
		w1.display();
	}

}

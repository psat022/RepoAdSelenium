package Number_program;

public class Numberstartingfromevendigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=12345678;
		
		while(n>0)
		{
			n=n%10;
			if(n%2 ==0)
			{
				System.out.println("even number");
				break;
			}
			
			else
			{
				System.out.println("odd number");
			}
		}
	}

}

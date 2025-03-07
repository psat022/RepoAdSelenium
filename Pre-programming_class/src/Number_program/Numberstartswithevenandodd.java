package Number_program;

public class Numberstartswithevenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rem=0;
		
		for(int n=1234;n>0;n=n/10)
		{
			rem=n%10;
		}
		if (rem%2==0)
		System.out.println("Given number starts with even");
		else
		{
			System.out.println("starts with odd");
		}
		
}
}
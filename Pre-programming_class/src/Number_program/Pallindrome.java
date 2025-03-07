package Number_program;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=123,temp=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		if(temp==rev)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not a Pallindrome");
		}
	}

}

package Number_program;

public class Odddigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=45678; //i
	
	while(n>0)
	{
		int rem=n%10;
		//check rem is odd
		if(rem%2!=0)
		{
			System.out.println(rem);
		}
		n=n/10;
	}
	
		
	}

}

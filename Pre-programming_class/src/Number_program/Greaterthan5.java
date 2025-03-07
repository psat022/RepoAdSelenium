package Number_program;

public class Greaterthan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int n=456445; //i
	
	while(n>0)
	{
		int rem=n%10; //c
		
		//check if number greater than 5
	
		if(rem>5)
		{
			System.out.println(rem);
		}
		n=n/10;
	}

	}

}

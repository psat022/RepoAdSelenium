package Number_program;

public class Firstndlastdigitingivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=1234,temp=n;
	int last=n%10;
	int rem=0;
	
	while(n>0)
	{
		rem=n%10;
		
		n=n/10;
		
	}
	System.out.println("Given number : "+temp);
	
	System.out.println("Firstdigit :"+rem);
	
	System.out.println("Lastdigit : "+last);
	
	}

}

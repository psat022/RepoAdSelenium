package Number_program;

public class Sumofevendigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=45689798;
	
	int sum=0;
	
	while(n>0)
	{
		int rem=n%10;
		if(rem%2==0) 
		sum=sum+rem;	
		
		}
		n=n/10;
	}
	System.out.println("Sum is "+sum);
	}
}
}

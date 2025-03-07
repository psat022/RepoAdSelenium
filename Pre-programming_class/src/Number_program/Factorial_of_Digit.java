package Number_program;

public class Factorial_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=465; //initialization
	int sum=0;
	
	while(n>0) //condition
	{
		int rem=n%10;
		//find factorial of rem
		
		int fact=1;
		for(int i=1;i<=rem;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(rem+"->"+fact);
		sum=sum+fact;
		n=n/10; //Updation
		
		//sum of all fact numbers
		
		System.out.println("sum of all fact is "+sum);	
		
	}
	
	}

}

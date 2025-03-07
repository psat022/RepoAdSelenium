package Number_program;

public class Strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=145,temp=n;
	int sum=0;
	while(n>0) {
		int rem=n%10;
		//find factorial of each digit
		int fact=1;
		for(int i=1;i<=rem;i++)
		{
			fact=fact*i;
		}
		
		System.out.println(rem+"->"+fact);
		sum=sum+fact;
		n=n/10;
		
	}
		System.out.println("sum"+sum);
		if (sum==temp)
			System.out.println("Strong number");
		else
		{
			System.out.println("Not a Strong nunmber");
		}
	}

}

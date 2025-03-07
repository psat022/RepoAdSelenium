package Number_program;

public class Count_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=132456,c=0;
	
	while(n>0)
	{
		n=n/10;
		c++;
	}
	System.out.println("No of digits: "+c);
	}

}

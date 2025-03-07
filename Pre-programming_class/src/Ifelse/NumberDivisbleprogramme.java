package Ifelse;



public class NumberDivisbleprogramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=22;
	if(n%2==0) {
		if(n%6==0) {
			System.out.println(n+ " is even number and it is divisble by 6");
		}
		else
		{
			System.out.println(n+" is even number and it is not divisble by 6");
		}
	}
		else
		{
			if(n%3==0)
			{
				System.out.println(n+ " is divisble by 3");
			}
			else
			{
				System.out.println(n+ " is not divisble by 3");
			}
		}
	}
		
}

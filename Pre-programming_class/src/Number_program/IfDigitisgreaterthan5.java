package Number_program;

public class IfDigitisgreaterthan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=45665431;
		
		//System.out.println("Digits greater than 5");
		
		while(n>0)
		{
			int Digit=n%10;
			if (Digit>5)
			{
				
			
			System.out.println(Digit);
		}
			n /= 10; 
		}
		
	}

}

package Number_program;

public class Fibonacci_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=10,firstNum=0,secondNum=1;
	int nextNum;
	
	for(int i=1;i<n;i++)
	{
		System.out.print(firstNum+",");
		nextNum=firstNum+secondNum;
		firstNum=secondNum;
		secondNum=nextNum;
	}	
	}
}

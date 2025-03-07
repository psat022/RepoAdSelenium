package Number_program;

import java.util.Scanner;



public class Neon_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number :");
	
	int number = sc.nextInt();
	
	int square = number*number;
	
	
	int sumofDigits=0;
	while(square>0){
		sumofDigits +=square%10;
		square /=10;
		
	}
	
	if(sumofDigits==number)
	{
		System.out.println(number + "is a neon number.");
	}
	else
	{
		System.out.println(number +"is not a neon number.");
	}	
		
	}
	

	
	}



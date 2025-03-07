package Ifelse;

import java.util.Scanner;

public class BloodGroup {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s = new Scanner(System.in);
	System.out.println("Enter weight");
	int weight = s.nextInt();
	
	System.out.println("enter blood group");
	
	char bg = s.next().charAt(0);
	
	if(weight>50)
	{
		if(bg=='o' || bg=='O')
		{
			System.out.println("eligible to donate");
		}
		else
		{
			System.err.println("bood group is not matching");
		}
	}
	else
	{
		System.err.println("Weight must be more than 50 kg");
	}
	}

}

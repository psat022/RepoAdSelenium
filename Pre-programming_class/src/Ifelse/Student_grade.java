package Ifelse;

import java.util.Scanner;
public class Student_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s = new Scanner(System.in);
	
	System.out.println("enter student grade");
	
	char grade = s.next().charAt(0);
	
	if(grade=='A')
	{
		System.out.println("First grade");
	}
	else if(grade=='B')
	{
		System.out.println("Sec grade");
	}
	else if(grade=='C')
	{
		System.out.println("Third grade");
	}
	else if(grade=='D')
	{
		System.out.println("Fail");
	}
	else
	{
		System.out.println("invalid grade");
	}
	
	}

}

package Ifelse;

import java.util.Scanner;
public class CharacterBelongs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the character");
	
	char ch = s.next().charAt(0);
	
	if(ch>='A' && ch<='Z')
	{
		System.out.println("Uppercase");
	}
	else if(ch>='a' && ch<='z')
	{
		System.out.println("Lowercase");
	}
	else if(ch>='0' && ch<='9')
	{
		System.out.println("Digit");
	}
	else
	{
		System.out.println("sp_Char");
	}
	
	
	
	}

	
}


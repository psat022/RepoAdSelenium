package Ifelse;

import java.util.Scanner;
public class Simple_calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);

System.out.println("-----------Simple calci-------------");

System.out.println("1)Addition\n2).Substraction\n3).Division\n4).Multiplication");

System.out.println("-------------------------------");

System.out.println("enter choice");

int choice = s.nextInt();

int a,b;

switch(choice)
{
case 1:{
System.out.println("enter 2 value");
a=s.nextInt();
b=s.nextInt();
System.out.println("Addition: "+(a+b));
}
break;

case 2:{
System.out.println("enter 2 value");
a=s.nextInt();
b=s.nextInt();
System.out.println("Substraction: "+(a-b));
}
break;

case 3:{
System.out.println("enter 2 value");
a=s.nextInt();
b=s.nextInt();
System.out.println("Division: "+(a/b));
}
break;

case 4:{
System.out.println("enter 2 value");
a=s.nextInt();
b=s.nextInt();
System.out.println("Multiplication: "+(a*b));
}
break;

default :System.out.println("Invalid choice");

	}

}
}

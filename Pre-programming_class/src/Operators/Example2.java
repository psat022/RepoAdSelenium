package Operators;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x=1;
	int y=x++ + ++x +x++ +--x;
	//1+ 3 +3 +3 =10
	
	System.out.println(y);
	
	int z = x++ + --x * x--  - ++x + --x;
	System.out.println(z);
	// 1+1*1-1+0=1
	}

}

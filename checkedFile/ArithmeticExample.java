package checkedFile;

import java.util.Scanner;

public class ArithmeticExample {

	public static void main(String[] args) {
	
	try {	
	//sc=new Scanner(System.in);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of a");
	int a=sc.nextInt();
	System.out.println("Enter value of b");
	int b=sc.nextInt();
	try {
	if(b==0) {
	 throw new AritmeticException("Bvalue can not be 0"); 
	}
	System.out.println("Division=  "+(a/b));

	}catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	finally
	{
		sc.close();
	}
}
}
}

import java.util.*;
public class JavaProb3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);

		int n,I,pos=0,neg=0,ev=0,od=0,zo=0;

		for(I=1;I<=20;I++);

		{

		System.out.println("Enter a number");

		n=sc.nextInt();

		if (n>0)

		pos++; 

		if (n<0)

		neg++; 

		if (n%2==0)

		ev++; 

		if (n%2!=0)

		od++; 

		if (n==0)

		zo++; 

		}

		System.out.println("number of positive numbers"+pos);

		System.out.println("number of negative numbers"+neg);

		System.out.println("number of odd numbers"+od);

		System.out.println("number of even numbers"+ev);

		System.out.println("number of zeroes"+zo);

		}

		

	}



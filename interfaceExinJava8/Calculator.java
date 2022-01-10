package interfaceExinJava8;

public class Calculator {
	static int a,b;
	public static void main(String[] args) {
		Arithmetic a=new Arithmetic();
		System.out.println("Enter a");
		a=Arithmetic.readData();
		System.out.println("Enter b");
		b=Arithmetic.readData();
		System.out.println(a.add(a, b));
	}

}

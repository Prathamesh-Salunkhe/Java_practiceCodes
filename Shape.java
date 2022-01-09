package polymorphism_methodOverriding;

import java.util.Scanner;

public class Shape {
	int length,breadth;
	public void confirmshape(){
		if(length==breadth) {
			System.out.println("square");
		}
	}
	Scanner sc = new Scanner(System.in);
	public void readDimensions()
	{
		String shape=this.confirmshape();
		if(shape.equals (shape("square")){
		System.out.println("enter the length=breadtg");
		System.out.println("enter the Dimension");
		this.length=sc.nextInt();
		}
	}
		public void area() {
	}
		System.out.println("Area will be calculated");
	}
   public void perimeter() {
}
	System.out.println("Perimeter will be calculated");
}

}

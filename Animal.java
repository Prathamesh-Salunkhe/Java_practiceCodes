package objec;

public class Animal {
	
	String Name;
	int age;
	
	public void eat() {
		System.out.println("I am Eating");
	}
	
	public void run() {
		System.out.println("I am Running");
	}

	public static void main(String[] args) {
		Animal buzo=new Animal();
		buzo.eat();
		buzo.run();
		

	}

}

/*
 * public class Birds() { String Name1; int age1;
 * 
 * 
 * public void fly() { System.out.println("i am flying");
 * 
 * } public static void main(String[] args) { Birds crow = new Birds();
 * crow.fly(); } }
 */
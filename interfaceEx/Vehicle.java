package interfaceEx;

abstract public class Vehicle {
     int noofTyres;
     abstract void start() {
    	 
     }

}

class Car extends Vehicle()
{
	public void start() {
		System.out.println("Starts with key");
	}
}

class Scooter extends Vehicle() {
	public void start() {
		System.out.println("Starts with kick");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		Scooter s = new Scooter();
		s.start();
		}
	}


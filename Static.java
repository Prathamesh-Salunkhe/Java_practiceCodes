package polymorphism;

public class Static {
	 int i=1;
	public void Static() {
		i++;
	}
	public void display() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		Static sv=new Static();
		sv.display();
		Static sv1=new Static();
		sv1.display();
	}

}

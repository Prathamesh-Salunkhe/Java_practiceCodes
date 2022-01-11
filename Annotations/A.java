package Annotations;
import java.lang.annotation.Documented;
public class A {
   public void display()
{
	   System.out.println("Hello...");
	   }
   @Deprecated
	public void message() {
		System.out.println("deprecated annotatio example");
	} 
}

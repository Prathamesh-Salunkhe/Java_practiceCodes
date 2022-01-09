

package inheripoly.single;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		int empId;
		String empName;
		float empSalary;
		enum gender  {male,female}
	    String empGender;
	}
 Scanner sc = new Scanner(System.in);	
  void readEmployeeInfo() {
	  System.out.println("Enter Employee Details...");
	  System.out.println("Enter Employee Id " + empId);
	  empId =sc.nextInt();
	  System.out.println("Enter Employee Name " +empName);
	  empName =sc.nextString();
	  System.out.println("Enter Employee Salary " + empSalary);
	  empSalary =sc.nextFloat();
	  System.out.println("Enter Employee Gender "+ empGender);
	  gender empGender =sc.next();
  }
 
	}



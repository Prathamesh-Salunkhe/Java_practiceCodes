package inheripoly.single;

public class Programmer extends Employee{
	
	String[] technologies= {"MySQL","Java","Spring","Spring Boot","Python"};
    String projectName;
    
   void readProgrammerInfo() {
	   System.out.println("Enter the project Name");
	   projectName= sc.nextLine();
   }
   void viewPogrammerInformation() {
	   System.out.println("Enter Employee Details...");
	   System.out.println("Enter Employee Id " + empId);
		  empId =sc.nextInt();
		  System.out.println("Enter Employee Name " +empName);
		  empName =sc.nextString();
		  System.out.println("Enter Employee Salary " + empSalary);
		  empSalary =sc.nextFloat();
		  System.out.println("Enter Employee Gender "+ empGender);
		  empGender =sc.next();
   }
}

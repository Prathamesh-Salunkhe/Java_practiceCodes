package inheripoly.single;

import java.util.Scanner;

public class Employ {

	public static void main(String[] args) {
		int empId;
		String empName;
		int empage;
		String empDept;
		float empSalary;

	}
	Scanner sc=new Scanner(System.in);
	void calculatesalary() {
		System.out.println("Enter Employee Details...");
		System.out.println("Enter Employee Id " + empId);
		empId =sc.nextInt();
		System.out.println("Enter Employee Name "+empName);
		empName =sc.nextString();
		System.out.println("Enter Employee Age "+empage);
		empage = sc.nextInt();
		System.out.println("Enter Employee Department "+empDept);
		empDept = sc.nextString();
		
	}

}

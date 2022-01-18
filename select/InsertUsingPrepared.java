package select;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertUsingPrepared {
	public static void main(String[] args) {
		//step1: to register driver
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
      //step2:
		Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/task", "root", "Salunkhe-123");
	    String insertStmt="insert into supervisors"+"(supervisor_nae,supervisor_city,supervisor_salary)"
		+"values(?,?,?);";
		
		//step3:
		PreparedStatement pstmt=con.prepareStatement(insertStmt);
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the supervisor details");
	    System.out.println("Enter supervisor name");
	    sc.nextLine();
	    String name=sc.nextLine();
		pstmt.setString(1, sname);
		System.out.println("Enter supervisor city");
	    String city=sc.nextLine();
		pstmt.setString(2, scity);
		//step4:
		ResultSet rs= stmt.executeQuery("select * from saple");
	 //step5:
		if(i!=0){
			System.out.println("Table Created");
		}else {
			System.out.println("Table not created");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}

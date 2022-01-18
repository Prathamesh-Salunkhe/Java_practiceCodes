package select;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class CreateTable {
	static connection con;
	static statment stmt;
	
	public static void main(String[] args) {
		//step1: to register driver
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
      //step2:
		Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/biodb", "root", "Salunkhe-123");
	 //step3:
		Statement stmt=con.createStatement();
		String createTable="create Table saple(id int,name varchar(30));";
	 //step4:
		
	 //step5:
		if(i!=0){
			System.out.println("Table Created");
		}else {
			System.out.println("Table not created");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
    finally {
    	try {
    		con.close();
    	}
    	catch (SQL exception){
    		e.printstackTrace();
    	}
    }
}
}

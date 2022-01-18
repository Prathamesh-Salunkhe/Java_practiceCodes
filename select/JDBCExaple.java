package select;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExaple {
	static Connection con;
	static Statement stmt;
	
	public static void main(String[] args) {
		//step1: to register driver
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
      //step2:
	   con=DriverManager.getConnection("jdbc:mysql//localhost:3306", "root", "Salunkhe-123");
	 //step3:
	    stmt=con.createStatement();
		String createTable="create Table MovieDetails (movieid autoincrement pk int,moviename varchar(30),movielanguage varchar(30),movietype varchar(20),movierating int);";
	 //step4:
		int i =stmt.executeUpdate("insert into MovieDetails(moviename,movielanguage,movietype,movierating)values('Pushpa','Hindi','All',5),;");
	 //step5:
		if(i!=0){
			System.out.println("Table Created");
		}else {
			System.out.println("Table not created");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
    /*finally {
    	try {
    		con.close();
    		stmt.close();
    	}
    	catch (SQLException e){
    		e.printStackTrace();
    	}*/
    }
}



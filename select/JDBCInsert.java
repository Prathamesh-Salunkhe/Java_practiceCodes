package select;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class JDBCInsert {
	public static void main(String[] args) {
		//step1: to register driver
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
      //step2:
		Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/biodb", "root", "Salunkhe-123");
	 //step3:
		Statment stmt=con.createStatment();
	 //step4:
		int i=stmt.executeUpdate("insert into biodb\r\n"+"(")
	 //step5:
		if(i!=0) {
			
		}
		else {
			
		}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}

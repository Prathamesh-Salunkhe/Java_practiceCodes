package selectStatementJDBC;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class JDBCsetDemo {

	public static void main(String[] args) {
		//step1: to register driver
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
      //step2:
		Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/task", "root", "Salunkhe-123");
	 //step3:
		Statment stmt=con.createStatment();
	 //step4:
		ResultSet rs= stmt.executeQuery("select * from customers");
	 //step5:
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}

package select;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*import selectStatementJDBC.Connection;
import selectStatementJDBC.Exception;
import selectStatementJDBC.Statment;
import selectStatementJDBC.String;
*/

public class JDBC {
	public static void main(String[] args) {
		//step1: to register driver
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
      //step2:
		Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/task", "root", "Salunkhe-123");
	 //step3:
		Statement stmt=con.createStatement();
	 //step4:
		ResultSet rs= stmt.executeQuery("select * from saple");
	 //step5:
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		}
	}catch(Exception e) {
		e.printStackTrace();
	}

}

}

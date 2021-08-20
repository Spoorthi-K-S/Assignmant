import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String username="SYSTEM";
		String password="Spoorthi001";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("connection created");
		Statement stmt=con.createStatement();
		
		String updateQuery="UPDATE EMP SET dob='3/09/1789' WHERE id=3";
		stmt.executeUpdate(updateQuery);
		
		ResultSet rs=stmt.executeQuery("SELECT * FROM EMP");
		System.out.println("Query Execution"+rs);
		
		while(rs.next()) {
			System.out.println(rs.getString("id")+":"+rs.getString("name")+":"+rs.getString("dob"));
		}
		con.close();

	}

}

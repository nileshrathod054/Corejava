import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class ConnectionEx {

	private static final char[] address = null;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println(3);
		String sql = "insert into student values(7,'Shridhar','Amt')";
		Statement stmt = (Statement) con.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("data inserted successfully");
		sql = "Select * from employee";
		ResultSet rs = (ResultSet) stmt.executeQuery(sql);
		System.out.println(rs);
		while (rs.next()) {
			int id = rs.getInt("eid");
			String name = rs.getString("ename");

			System.out.println(id);
			System.out.println(name);

			System.out.println("---------------------");
		}
	}
}

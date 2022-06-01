package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentPreaparedStatementInsert {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root",
					"root");
			pt = conn.prepareStatement("insert into student1 values(?,?,?)");
			pt.setInt(1, 2);
			pt.setString(2, "Priti");
			pt.setInt(3,30);
			boolean i = pt.execute();
			System.out.println("No of rows affected : " + i);
			System.out.println("Rows inserted successfully");

		} catch (Exception e) {
			System.out.println(e);

		} finally {
			try {
				if (pt != null) {
					pt.close();
					pt = null;

				}
			} catch (Exception e) {
				System.out.println(e);

			}
			try {
				if (con != null) {
					con.close();
					con = null;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
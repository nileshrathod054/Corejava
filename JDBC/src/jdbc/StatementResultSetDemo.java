package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class StatementResultSetDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root",
					"root");

			Statement st = con.createStatement();
			String query = "select employeeID, employeeName from employee";
			ResultSet rs = st.executeQuery(query);
			ResultSetMetaData rsmt = rs.getMetaData();
			System.out.println(rsmt);
			
			int cols = rsmt.getColumnCount();
			while (rs.next()) {
			
				for (int i = 1; i <= cols; i++) {
					System.out.println(rs.getString(i) + "\t");

				}
				System.out.println("");
			}
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

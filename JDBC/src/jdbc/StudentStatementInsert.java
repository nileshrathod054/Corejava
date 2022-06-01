package jdbc;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
public class StudentStatementInsert {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		java.sql.Statement st = con.createStatement();
		String query2 = "insert into student1 values(1,'Nilesh',20)";
		int i = st.executeUpdate(query2);
		boolean t = st.execute("insert into student1 values(2,'Suraj',30)");
		System.out.println("No of rows affeted:" + i); // 1
		System.out.println("Query executed " + t);
		System.out.println("Row inserted successfully");
		st.close();
		con.close();

	}

}

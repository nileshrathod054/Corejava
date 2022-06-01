package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class StatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		java.sql.Statement st = con.createStatement();
		String query1 = "create table student1(studentId int primary key, studentName varchar(20), studentMarks int)";
		int i = st.executeUpdate(query1);
		int j = st.executeUpdate(
				"create table student1(studentId int primary key, studentName varchar(20), studentMarks int");

		System.out.println("No of rows affected:" + i); // 0
		System.out.println("No of rows affected:" + i); // 0
		System.out.println("Table created Successfully");

		st.close();     // communication
		con.close();    // connection

	}

}
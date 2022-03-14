package HW0307;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManager01 {
	
	static {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void printEmployee(String name, int salary) throws SQLException{
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = DriverManager.getConnection(dburl, "hr", "hr");
		
//		 String selectSql = "SELECT\r\n"
//				 +"employee_id, first_name, salary\r\n"
//				 +"FROM employees\r\n"
//				 +"WHERE UPPER(first_name) LIKE UPPER('%"+name+"%') AND salary > "+salary+"";
		 String selectSql = "SELECT\r\n"
				 +"employee_id, first_name, salary\r\n"
				 +"FROM employees\r\n"
				 +"WHERE UPPER(first_name) LIKE UPPER('%'||?||'%') AND salary > ?";

//		 Statement stmt = conn.createStatement();
//		 ResultSet rs = stmt.executeQuery(selectSql);
		 
		 PreparedStatement pstmt = conn.prepareStatement(selectSql);
		 pstmt.setString(1, name);
		 pstmt.setInt(2, salary);
		 ResultSet rs = pstmt.executeQuery();
		 
		 while(rs.next()) {
			 
			 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
	        	
	        }
//		stmt.close();
		pstmt.close();
		conn.close();
		rs.close();
	}

	public static void main(String[] args) throws SQLException{
		
		new EmpManager01().printEmployee("al", 4000);
		
	}//end of main

}//end of class

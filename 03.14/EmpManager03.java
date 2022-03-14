package HW0307;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManager03 {

	static {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void printEmployee(String city, int lo, int hi) throws SQLException{
		
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = DriverManager.getConnection(dburl, "hr", "hr");
		
//		String sqlString = "SELECT "
//				+"e.last_name, d.department_name "
//				+"FROM employees e, departments d, locations l "
//				+"WHERE e.department_id=d.department_id AND d.location_id=l.location_id "
//				+"AND l.city='South San Francisco' AND e.salary BETWEEN 7000 AND 10000";
		
		
		String sqlString = "SELECT "
				+"e.last_name, d.department_name "
				+"FROM employees e, departments d, locations l "
				+"WHERE e.department_id=d.department_id AND d.location_id=l.location_id "
				+"AND l.city=? AND e.salary BETWEEN ? AND ?";
		
//		Statement stmt = conn.createStatement();
//		ResultSet rs = stmt.executeQuery(sqlString);
		
		PreparedStatement pstmt = conn.prepareStatement(sqlString);
		pstmt.setString(1, city);
		pstmt.setInt(2, lo);
		pstmt.setInt(3, hi);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			 
			 System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
	        	
	        }
//		stmt.close();
		pstmt.close();
		conn.close();
		rs.close();
		
		
	}
	
	public static void main(String[] args) throws SQLException{
		
		new EmpManager03().printEmployee("South San Francisco", 7000, 10000);
		
	}

}

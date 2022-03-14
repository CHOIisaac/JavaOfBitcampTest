package HW0307;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManager02 {
	
	static {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void printEmployee(String jobs[]) throws SQLException{
		
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = DriverManager.getConnection(dburl, "hr", "hr");
		
//		String selectSql = "SELECT "
//				+"employee_id, first_name, salary "
//				+"FROM employees e, jobs j "
//				+"WHERE e.job_id = j.job_id AND j.job_title IN ('"+jobs[0]+"','"+jobs[1]+"')";
//				
//		Statement stmt = conn.createStatement();
//		ResultSet rs = stmt.executeQuery(selectSql);
		
		
		String selectSql = "SELECT "
				+"employee_id, first_name, salary "
				+"FROM employees e, jobs j "
				+"WHERE e.job_id = j.job_id AND j.job_title IN (?,?)";
		
		
		PreparedStatement pstmt = conn.prepareStatement(selectSql);
		pstmt.setString(1, jobs[0]);
		pstmt.setString(2, jobs[1]);
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
		
		String[] jobs = {"Accountant", "Stock Clerk"};
		new EmpManager02().printEmployee(jobs);
	}

}

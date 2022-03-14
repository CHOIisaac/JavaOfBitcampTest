package HW0307;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpStatistics {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		int maxSalary = 10000;
		new EmpStatistics().printStatistics(maxSalary);
		
		maxSalary = 15000;
		new EmpStatistics().printStatistics(maxSalary);
	}//end of main
	
	public void printStatistics(int maxSalary) throws SQLException {
		
		System.out.println("=====================================");
		System.out.println("Max Salary : " + maxSalary);
		System.out.println("=====================================");
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
//		String sql = "SELECT\r\n"
//				+ "J.JOB_TITLE, AVG(E.SALARY)\r\n"
//				+ "FROM JOBS J, EMPLOYEES E\r\n"
//				+ "WHERE E.JOB_ID = J.JOB_ID\r\n"
//				+ "GROUP BY J.JOB_TITLE\r\n"
//				+ "HAVING AVG(E.SALARY) > "+maxSalary+"\r\n"
//				+ "ORDER BY AVG(E.SALARY) DESC";
		
		String sql = "SELECT\r\n"
				+ "J.JOB_TITLE, AVG(E.SALARY)\r\n"
				+ "FROM JOBS J, EMPLOYEES E\r\n"
				+ "WHERE E.JOB_ID = J.JOB_ID\r\n"
				+ "GROUP BY J.JOB_TITLE\r\n"
				+ "HAVING AVG(E.SALARY) > ? \r\n"
				+ "ORDER BY AVG(E.SALARY) DESC";
		
		Connection con = DriverManager.getConnection(url,"hr","hr");
		
//		Statement stmt = con.createStatement();
//		ResultSet rs = stmt.executeQuery(sql);
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, maxSalary);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println("["+rs.getString(1)+"] "+rs.getInt(2));
		}
		rs.close();
		con.close();
//		stmt.close();
		pstmt.close();
		
	}

}//end of class

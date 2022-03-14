package HW0307;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prob06 {
	
	public static void printEmployeeList(String cityName, String deptName) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = DriverManager.getConnection(url, "hr", "hr");
		
//		 String selectSql = "SELECT "
//				+"l.city, d.department_name, e.first_name, e.salary "
//				+"FROM locations l, employees e, departments d "
//				+"WHERE e.department_id = d.department_id AND d.location_id = l.location_id AND "
//				+"UPPER(l.city) LIKE UPPER('%"+cityName+"%') AND UPPER(d.department_name) LIKE UPPER('%"+deptName+"%')";
		 
		 String selectSql = "SELECT "
				 +"l.city, d.department_name, e.first_name, e.salary "
				 +"FROM locations l, employees e, departments d "
				 +"WHERE e.department_id = d.department_id AND d.location_id = l.location_id AND "
				 +"UPPER(l.city) LIKE UPPER('%'||?||'%') AND UPPER(d.department_name) LIKE UPPER('%'||?||'%')";

//		Statement stmt = conn.createStatement();
//		ResultSet rs = stmt.executeQuery(selectSql);
		
		PreparedStatement pstmt = conn.prepareStatement(selectSql);
		pstmt.setString(1, cityName);
		pstmt.setString(2, deptName);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			 
			 System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
	        	
	        }
//		stmt.close();
		pstmt.close();
		conn.close();
		rs.close();
		
	}

	public static void main(String[] args) throws Exception{
		printEmployeeList("lon", "resource");
	}

}

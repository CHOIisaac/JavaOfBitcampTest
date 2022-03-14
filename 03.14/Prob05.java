package HW0307;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Prob05 {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("부서의 아이디를 입력하세요.");
			System.exit(1);
		}
		String dept_id = args[0];
		
		Connection conn = null;
		Statement stmt = null;;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url, user, password);
//			
//			String selectSql = "SELECT "
//					+"e.employee_id, d.department_id, e.salary, (SELECT "
//					+"AVG(salary) "
//                    +"FROM employees "
//                    +"WHERE department_id="+dept_id+") avg_salary "
//					+"FROM employees e, departments d "
//					+"WHERE e.department_id=d.department_id AND e.department_id="+dept_id+"";
			
			
			String selectSql = "SELECT "
					+"e.employee_id, d.department_id, e.salary, (SELECT "
					+"AVG(salary) "
					+"FROM employees "
					+"WHERE department_id=?) avg_salary "
					+"FROM employees e, departments d "
					+"WHERE e.department_id=d.department_id AND e.department_id=?";
			
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(selectSql);
			
			PreparedStatement pstmt = conn.prepareStatement(selectSql);
			pstmt.setString(1, dept_id);
			pstmt.setString(2, dept_id);
			rs = pstmt.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnName(1)+"\t"+rsmd.getColumnName(2)+"\t"+rsmd.getColumnName(3)+"\t\t"+rsmd.getColumnName(4));
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getInt(4));
				
			}
//			stmt.close();
			pstmt.close();
			conn.close();
			rs.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}//end of main

}//end of class

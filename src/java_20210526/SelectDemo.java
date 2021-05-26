package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");
			// 부서번호가 30 이하인 직업, 인원수, 급여 평균을 직업별로 출력, 직업명 오름차순 정렬
			sql.append("select Job, count(job) Persons, avg(sal) avgSal ");
			sql.append("from emp ");
			sql.append("where deptno <= 30 ");
			sql.append("group by job ");
			sql.append("order by avgSal ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			ResultSet result = pstmt.executeQuery();
			while(result.next()) {
				String Job = result.getString(1);
				int Persons = result.getInt(2);
				int avgSal = result.getInt(3);
				System.out.printf("%s \t %d \t %d%n", Job, Persons, avgSal);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(con != null)
					con.close();
					if(pstmt != null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}

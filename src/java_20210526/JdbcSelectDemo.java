package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {
	public static void main(String[] args) {
		try {
			// 1. 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				// 2. DB 연결
				con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");
				
				// 3. SQL문 작성
				StringBuilder sql = new StringBuilder();
				sql.append("select job, sum(sal) ");
				sql.append("from emp ");
				sql.append("where sal <= 2000 ");
				sql.append("group by job ");
				sql.append("order by sal asc ");
				
				// 4. SQL문 전송
				pstmt = con.prepareStatement(sql.toString());
				
				ResultSet result = pstmt.executeQuery();
				while(result.next()) {
					String job = result.getString(1);
					int sal = result.getInt(2);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		} finally {
			try {
				if(con != null)	con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

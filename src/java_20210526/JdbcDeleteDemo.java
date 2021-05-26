package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
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
				con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212");

				// 3. SQL문 작성
				StringBuilder sql = new StringBuilder();
				sql.append("DELETE from member ");
				sql.append("WHERE num = ? ");
				
				// 4. 바인딩 변수 설정
				pstmt = con.prepareStatement(sql.toString());
				
				int index = 1;
				pstmt.setInt(index, 3);
				
				// 5. SQL문 전송
				int resultCount = pstmt.executeUpdate();
				System.out.println("갱신된 행의 수 : " + resultCount);
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

package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		try {
			// 1. 드라이브 로드
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con =null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		
		try {
			// 2. DB 연결 Connection 생성
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212");
			sql.append("delete from member ");
			sql.append("where num = ? ");
			
			// 3. SQL 전송 PreparedStratemoent 생성
			pstmt = con.prepareStatement(sql.toString());
			
			// 4. 바인딩 변수 설정
			int index = 1;
			pstmt.setString(index, String.valueOf(11)); // primitive type을 String type으로 변경
			
			// 5. SQL 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신한 행의 수  : " + resultCount);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					// 6. 모든 자원 회수
					if(con != null) con.close();
					if(pstmt != null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}

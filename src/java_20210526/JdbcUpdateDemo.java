package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
	public static void main(String[] args) {
		// 1. 드라이버 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 연결 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 연결 실패 : " + e.getMessage());
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 2. DB 연결
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212");
			System.out.println("DB 연결 성공");
			
			// 3. PreparedStatement 생성
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE member ");
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ? ");
			
			pstmt = con.prepareStatement(sql.toString());

			// 4. 바인딩 변수 설정
			// 순서는 위에서 아래로, 왼쪽에서 오른쪽으로
			int index = 1;
			pstmt.setString(index++, "두테르테3");
			pstmt.setString(index++, "필리핀3");
			pstmt.setInt(index, 11);
			
			
			// 5. SQL문 전송 
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : " + resultCount);
		} catch (SQLException e) {
			System.err.println("DB 연결 실패 : " + e.getMessage());
		} finally {
					try {
						if(con != null) con.close();
						if(pstmt != null) pstmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}
		
	}
}

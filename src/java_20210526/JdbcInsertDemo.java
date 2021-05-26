package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {
	public static void main(String[] args) {
		// 1. 드라이버 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이브 로드 실패 : " + e.getMessage());
		}

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 2. DB연결 Connection 객체 생성
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212"); // url, user, password
			System.out.println("DB 연결 성공");
			
			// 3. SQL문 전송 PreparedStatement 객체 생성
			StringBuilder sql = new StringBuilder();
			
			sql.append("INSERT INTO member(num, NAME, addr)");
			sql.append("VALUES (?, ?, ?)");
			
			// .toString() : StringBuilder => String으로 변환
			pstmt = con.prepareStatement(sql.toString());
			
			// 4. 바인딩 변수 설정하기
			int index = 1;
			pstmt.setInt(index++, 11);
			pstmt.setString(index++, "두테르테");
			pstmt.setString(index, "필리핀");
			
			// 5. SQl문 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : " + resultCount);
			
		} catch (SQLException e) {
			System.err.println("연결 실패 : " + e.getMessage());
		} finally {
			try {
				if (con != null) con.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}

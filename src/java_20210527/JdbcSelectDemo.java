package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {
	public static void main(String[] args) {
		try {
			// 1. 드라이브 로드
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 2. DB 연결 Connection 생성
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");

			// 3. SQL 전송 PreparedStatement 생성
			StringBuilder sql = new StringBuilder();
			sql.append("select num, NAME, addr ");
			sql.append("from member ");
			sql.append("order by num DESC ");
			sql.append("limit ?, ? ");

			pstmt = con.prepareStatement(sql.toString());

			// 4. 바인딩 변수 절정
			int index = 1;
			pstmt.setInt(index++, 0);
			pstmt.setInt(index, 2);

			// 5. SQL 전송 결과(executeQuery()) ResultSet 생성
			rs = pstmt.executeQuery();

			// 6. ResultSet에서 데이터 추출 -> getXXX(index)
			while (rs.next()) {
				index = 1;
				int num = rs.getInt(index++); // rs.getInt(1); or rs.getInt("num");
				String name = rs.getString(index++); // rs.getInt(2); or rs.getInt("name");
				String addr = rs.getString(index); // rs.getInt(3); or rs.getInt("addr");
				System.out.printf("%d \t %s \t %s%n", num, name, addr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 7. 모든 자원 반납
				if (con != null) con.close();
				if (pstmt != null) pstmt.close();
				if (rs != null) rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

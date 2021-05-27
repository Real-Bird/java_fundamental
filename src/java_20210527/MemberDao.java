package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao {
	// 1. MemberDao 변수인 single을 static 변수로 설정
	private static MemberDao single;

	// 2. 생성자의 접근한정자를 private으로 설정 -> 외부에서 객체 생성 제한
	private MemberDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 3. MemberDao의 객체는 getInstance() 메서드로만 생성
	// getInstance() 메서드의 구현은 MemberDao 객체를 한 개만 생성 가능하게 해야 함
	// static 메서드로 구현한 이유는 MemberDao 객체를 외부에서 생성할 수 없기 때문
	public static MemberDao getInstance() {
		if (single == null) {
			single = new MemberDao();
		}
		return single;
	}

	// Insert into ~ Values ~
	public boolean insert(MemberDto dto) {
		boolean success = false;

		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");

			sql.append("insert into member(num,NAME,addr) ");
			sql.append("values (?,?,?) ");

			pstmt = con.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setInt(index++, dto.getNum());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index, dto.getAddr());

			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return success;
	}

	// Update ~ Set ~ where ~
	public boolean update(MemberDto dto) {
		boolean success = false;

		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");

			sql.append("update member ");
			sql.append("set NAME = ?, addr = ? ");
			sql.append("where num = ? ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getAddr());
			pstmt.setInt(index, dto.getNum());

			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return success;
	}

	// Delete From ~ Where ~
	public boolean delete(int num) {
		boolean success = false;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");

			StringBuilder sql = new StringBuilder();
			sql.append("delete from member ");
			sql.append("where num = ? ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index, num);

			pstmt.executeUpdate();
			success = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return success;

	}

	public ArrayList<MemberDto> select(int start, int len) {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");

			StringBuilder sql = new StringBuilder();
			sql.append("select num, NAME, addr ");
			sql.append("from member ");
			sql.append("order by num DESC ");
			sql.append("limit ?, ? ");

			pstmt = con.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setInt(index++, start);
			pstmt.setInt(index, len);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				index = 1;
				int num = rs.getInt(index++);
				String name = rs.getString(index++);
				String addr = rs.getString(index);
				list.add(new MemberDto(num, name, addr));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}

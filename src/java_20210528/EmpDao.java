package java_20210528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDao {
	EmpDto dto = new EmpDto();
	private static EmpDao single;

	private EmpDao() {
	}

	public static EmpDao getInstance() {
		if (single == null) {
			single = new EmpDao();
		}
		return single;
	}
	public boolean insert(EmpDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kpc","kpc12","kpc1212");
			sql.append("insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) ");
			sql.append("values (?, ?, ?, ?, ?, ?, ?, ?) ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setInt(index++, dto.getNo());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getJob());
			pstmt.setInt(index++, dto.getMgr());
			pstmt.setString(index++, dto.getHiredate());
			pstmt.setDouble(index++, dto.getSal());
			pstmt.setDouble(index++, dto.getComm());
			pstmt.setInt(index++, dto.getDeptno());
			
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		return success;
	}
	public boolean update(EmpDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kpc","kpc12","kpc1212");
			sql.append("update emp ");
			sql.append("set ename = ?, job = ? ");
			sql.append("where empno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getJob());
			pstmt.setInt(index++, dto.getNo());
			
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		return success;
	}
	public boolean delete(int no) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kpc","kpc12","kpc1212");
			sql.append("delete from emp ");
			sql.append("where empno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setInt(index++, no);
			
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return success;
	}
	public ArrayList<EmpDto> select(int start, int len) {
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = new StringBuilder();
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kpc","kpc12","kpc1212");
			sql.append("select ename, job, hiredate, sal, deptno ");
			sql.append("from emp ");
			sql.append("where ename like '%I%' ");
			sql.append("order by sal DESC ");
			sql.append("limit ?, ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setInt(index++, start);
			pstmt.setInt(index++, len);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				index = 1;
				String name = rs.getString(index++);
				String job = rs.getString(index++);
				String hiredate = rs.getString(index++);
				double sal = rs.getDouble(index++);
				int deptno = rs.getInt(index++);
				list.add(new EmpDto(name, job, hiredate, sal, deptno));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return list;
	}
	
}

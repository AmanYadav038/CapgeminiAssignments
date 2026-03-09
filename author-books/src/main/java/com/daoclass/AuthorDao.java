package com.daoclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dataclass.Author;

public class AuthorDao implements IAuthorDao{
	private static Connection con;
	static {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Aman@16122003");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public String createAuthor(Author a) {
		try {
			PreparedStatement ps = con.prepareStatement("insert into authors values(?,?,?,?,?)");
			ps.setInt(1, a.getAuthorId());
			ps.setString(2, a.getfName());
			ps.setString(3, a.getmName());
			ps.setString(4, a.getlName());
			ps.setString(5, a.getPhoneNum());
			
			int rows = ps.executeUpdate();
			if(rows>0) return "Author Added";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Error Adding Author";
	}

	@Override
	public Author getAuthor(int authorId) {
		try {
			PreparedStatement ps = con.prepareStatement("Select * from authors where authorId=?");
			ps.setInt(1, authorId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int aId = rs.getInt("authorId");
				String fname = rs.getString("firstName");
				String mname = rs.getString("middleName");
				String lname = rs.getString("lastName");
				String phone = rs.getString("phone_num");
				return new Author(aId, fname, mname, lname, phone);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Author> getAllAuthor() {
		List<Author> res = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement("Select * from authors;");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int aId = rs.getInt("authorId");
				String fname = rs.getString("firstName");
				String mname = rs.getString("middleName");
				String lname = rs.getString("lastName");
				String phone = rs.getString("phone_num");
				res.add(new Author(aId, fname, mname, lname, phone));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public String updateAuthor(int authorId, String newPhone) {
		try {
			PreparedStatement ps = con.prepareStatement("update authors set phone_num = ? where authorId = ?");
			ps.setInt(2, authorId);
			ps.setString(1, newPhone);
			int rows = ps.executeUpdate();
			if(rows>0)return "phone number updated";
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return "Something went wrong while updating.";
	}

	@Override
	public String deleteAuthor(int authorId) {
		try {
			PreparedStatement ps = con.prepareStatement("delete from authors where authorId = ?;");
			ps.setInt(1, authorId);
			int rows = ps.executeUpdate();
			if(rows>0)return "Author deleted";
			return "not deleted";
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return "something went wrong while deleting";
	}

}

package com.daoclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.dataclass.Book;

public class BookDao implements IBookDao{
	private static Connection con ;
	static {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Aman@16122003");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public String createBook(Book a) {
		try {
			PreparedStatement ps = con.prepareStatement("Insert into books values (?,?,?,?)");
			ps.setString(1, a.getISBN());
			ps.setString(2, a.getTitle());
			ps.setDouble(3, a.getPrice());
			ps.setInt(4, a.getAuthorId());
			
			int rows = ps.executeUpdate();
			if(rows>0)return "successful";
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return "Something went wrong";
	}

	@Override
	public Book getBook(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBook(String ISBN, String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBook(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBookPrice(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

}

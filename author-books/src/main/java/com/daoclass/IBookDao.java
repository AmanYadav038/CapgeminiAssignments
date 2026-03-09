package com.daoclass;

import java.util.List;

import com.dataclass.Book;

public interface IBookDao {
	public String createBook(Book a);
	public Book getBook(String ISBN);
	public List<Book> getAllBook();
	public String updateBook(String ISBN, String authorName);
	public String deleteBook(String ISBN);
	public String updateBookPrice(String authorName);
}

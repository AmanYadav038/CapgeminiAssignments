package com.daoclass;

import java.util.List;

import com.dataclass.Author;

public interface IAuthorDao {
	public String createAuthor(Author a);
	public Author getAuthor(int authorId);
	public List<Author> getAllAuthor();
	public String updateAuthor(int authorId, String newPhone);
	public String deleteAuthor(int authorId);
}

package com.serviceclass;

import java.util.List;

import com.dataclass.Author;

public interface IAuthorService {
	public String createAuthor(Author auth);
	public Author getEmpById(int authorId);
	public List<Author> getAllAuthors();
	public String updateAuthPhone(int authorId, String newPhone);
	public String deleteAuthById(int authorId);
}

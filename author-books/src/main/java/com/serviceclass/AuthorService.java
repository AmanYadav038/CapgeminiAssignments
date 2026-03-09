package com.serviceclass;

import java.util.List;

import com.daoclass.AuthorDao;
import com.daoclass.IAuthorDao;
import com.dataclass.Author;

public class AuthorService implements IAuthorService{
	private IAuthorDao dao = new AuthorDao();
	@Override
	public String createAuthor(Author auth) {
		if(auth.getAuthorId()<=0 || auth.getfName()==null) {
			return "Author can't have these initial values of Id or First Name";
		}
		return dao.createAuthor(auth);
	}

	@Override
	public Author getEmpById(int authorId) {
		if(authorId<=0) {
			System.out.println("Author can't have these initial values of Id");
		}
		return dao.getAuthor(authorId);
	}

	@Override
	public List<Author> getAllAuthors() {
		return dao.getAllAuthor();
	}

	@Override
	public String updateAuthPhone(int authorId, String new_num) {
		if(authorId<=0) {
			System.out.println("Author can't have these initial values of Id");
		}
		return dao.updateAuthor(authorId, new_num);
	}

	@Override
	public String deleteAuthById(int authorId) {
		if(authorId<=0) {
			System.out.println("Author can't have these initial values of Id");
		}
		return dao.deleteAuthor(authorId);
	}

}

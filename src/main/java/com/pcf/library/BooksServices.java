package com.pcf.library;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;

public interface BooksServices {
	
	public boolean createBook(Books books);
	public boolean updateBook(Books books);
	public boolean deleteBook(Books books);
	
	

}

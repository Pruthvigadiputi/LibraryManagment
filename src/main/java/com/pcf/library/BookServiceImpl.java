package com.pcf.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;

public class BookServiceImpl implements BooksServices{

	@Autowired
	ReadFile rf;
	
	@Override
	public boolean createBook(Books books) {
		// TODO Auto-generated method stub
		
		rf.readFile("");
		return false;
	}

	@Override
	public boolean updateBook(Books books) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBook(Books books) {
		// TODO Auto-generated method stub
		return false;
	}

}

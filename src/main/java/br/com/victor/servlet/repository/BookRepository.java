package br.com.victor.servlet.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.victor.servlet.model.Book;

public class BookRepository {
	
	List<Book> books = new ArrayList<>();
	
	public Book save(Book book) {
		book.setId(UUID.randomUUID());
		books.add(book);
		return book;
	}

}

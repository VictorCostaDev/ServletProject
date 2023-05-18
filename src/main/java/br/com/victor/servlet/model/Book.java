package br.com.victor.servlet.model;

import java.util.UUID;

public class Book {
	
	// name, escritor, editora, ano, categoria
	
	private UUID id;
	
	private String name;
	private String writer;
	private String category;
	private String publisher;
	private Integer year;
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", writer=" + writer + ", category=" + category + ", publisher="
				+ publisher + ", year=" + year + "]";
	}
	
	
}

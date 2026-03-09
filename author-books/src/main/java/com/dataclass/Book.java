package com.dataclass;

public class Book {
	private String ISBN;
	private String title;
	private float price;
	private int authorId;
	public Book(String iSBN, String title, float price, int authorId) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.authorId = authorId;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getAuthorId() {
		return this.authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
	
}

package com.chainsys.classandmethods;

public class Book {
	private final String bookname="agni";
	private int noofpages ;
	private String bookauthor;
	private int publisheddate;
	public String getBookname() {
		return bookname;
	}
	public int getNoofpages() {
		return noofpages;
	}
	public void setNoofpages(int noofpages) {
		this.noofpages = noofpages;
	}
	public int getPublisheddate() {
		return publisheddate;
	}
	public void setPublisheddate(int publisheddate) {
		this.publisheddate = publisheddate;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
}

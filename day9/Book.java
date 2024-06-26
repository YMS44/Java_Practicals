package day9;

import day4.NewMath;

public class Book {
	final int isbn;
	String title;
	public Book() {
		isbn = 67859;
		title = "Java 8";
	}
	public Book(int isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
	}
	private static void simplePrivateMethod() {
		System.out.println("This is a private method.");
	}
	private static void simpleStaticMethod() {
		System.out.println("This is a static method.");
	}
	
	@MyAnno(priority = 1)
	public void simpleMethod() {
		System.out.println("This is a public method.");
	}
	
	public void sstValue(int isbn, String name) {
		System.out.println(new Book(isbn, name).toString());
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + "]";
	}
}

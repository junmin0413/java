package exam1013;

public class Book {
	private String title;
	private String auther;
	private int price;
	private String isbn;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	public Book(String title, String auther, String isbn) {
		this.title = title;
		this.auther = auther;
		this.isbn = isbn;
		//this(title, author, isbn, 0)
	}
	public Book(String title, String auther, String isbn, int price) {
		this.title = title;
		this.auther = auther;
		this.isbn = isbn;
		this.price = 0;
	}
	
}

package exam1013;

public class BookExample {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book("자바","김자바","123-456-789");
		books[1] = new Book("파이썬","이파이","123-456-789", 30000);
		books[2] = new Book("디비","빅데이터","123-456-789");
		
		
		for(int i=0; i<3; i++ ) {
			System.out.println(books[i].getTitle());
		}
	}
}

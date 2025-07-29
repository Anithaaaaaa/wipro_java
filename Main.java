package assignment2;

public class Main {
	public static void main(String[] args) {
		Author a = new Author("abc","abc123@gmail.com",'M');
		Book b = new Book("java", a, 299.99, 5);
		b.display();
	}
}

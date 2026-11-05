// 5. Initialize a Book's ISBN, title, and price using a parameterized constructor.
public class Book {
    private String isbn;
    private String title;
    private double price;

    public Book(String isbn, String title, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("ISBN  : " + isbn);
        System.out.println("Title : " + title);
        System.out.printf("Price : %.2f%n", price);
    }

    public static void main(String[] args) {
        Book book = new Book("978-0135166307", "A Beginner's Guide to Java", 599.00);
        book.displayDetails();
    }
}

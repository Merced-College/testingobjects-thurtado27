/*
 * Book.java
 * Student-defined class with 3 fields
 */

public class Book {

    private String title;
    private String author;
    private double price;

    // No-arg constructor
    public Book() {
        title = "Untitled";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    // toString override
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', price=$" + price + "}";
    }
}

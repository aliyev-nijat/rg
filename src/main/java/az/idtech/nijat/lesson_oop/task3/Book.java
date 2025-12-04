package az.idtech.nijat.lesson_oop.task3;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String author, String title) {
        this(title, author, 0.0);
    }

    public Book() {
    }
}

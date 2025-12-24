package az.idtech.nijat.general_tasks_for_oop.library_management_system;

public class Library {

    private Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    public Book addBook(final Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) continue;
            return (books[i] = book);

        }

        return null;
    }

    public void showAvailableBooks() {
        for (Book book : books) {
            if (book == null) continue;
            System.out.printf("""
                            Title: %s
                            Author: %s
                            Year: %d
                            Available:%s""",
                    book.getTitle(),
                    book.getAuthor(),
                    book.getYear(),
                    book.isAvailable() ? "Yes" : "No"
            );
        }
    }
}

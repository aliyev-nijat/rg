package az.idtech.nijat.general_tasks_for_oop.library_management_system;

public class Book {

    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;

            return true;
        }

        return false;
    }

    public void returnBook() {
        isAvailable = true;
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

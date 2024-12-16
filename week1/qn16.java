package workshop1;

class Book {
    String title;
    String author;
    int year;

    // Constructor to initialize the Book object
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Override toString method to return a formatted string
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}

public class qn16 {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        // Print the book details using the toString method
        System.out.println(book);
    }
}

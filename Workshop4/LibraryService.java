package Workshop4;

import java.util.ArrayList;

public class LibraryService {
    private ArrayList<String> books = new ArrayList<>();

    // Method to add a book to the library
    public void addBook(String title) {
        books.add(title);
    }

    // Method to search for a book by its title
    public boolean searchBook(String title) {
        return books.contains(title);
    }
}

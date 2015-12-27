package com.library.inventory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sslap on 27-12-2015.
 */
public class LibraryInventory {

    private List<Book> books;

    public LibraryInventory() {
        books = new ArrayList<Book>();
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> searchedBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }

    public void addBooks(List<Book> newBooks) {
        books.addAll(newBooks);
    }

    public List<Book> getBooks() {
        return books;
    }
}

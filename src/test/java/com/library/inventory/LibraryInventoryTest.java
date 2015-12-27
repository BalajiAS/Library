package com.library.inventory;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by sslap on 27-12-2015.
 */
public class LibraryInventoryTest {

    private List<Book> books;

    @Before
    public void setup() {
        Book bookOne = new Book("Angel & Demon", "Dan Brown");
        Book bookTwo = new Book("The Lost Symbol", "Dan Brown");
        Book bookThree = new Book("Harry Potter and the Secret Chamber", "J.K. Rowling");
        books = new ArrayList<Book>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
    }

    @Test
    public void checkIfBooksCanBeAddedToInventory() {
        LibraryInventory libraryInventory = new LibraryInventory();
        libraryInventory.addBooks(books);
        assertEquals(books.size(), libraryInventory.getBooks().size());
    }

    @Test
    public void isSearchByTitleYieldsRightResult() {
        String authorToBeSearched = "Dan Brown";
        LibraryInventory libraryInventory = new LibraryInventory();
        libraryInventory.addBooks(books);
        List<Book> books = libraryInventory.searchByAuthor(authorToBeSearched);
        int searchResultBookCount = 0;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(authorToBeSearched)) {
                searchResultBookCount++;
            }
        }
        assertEquals(searchResultBookCount, 2);
    }
}


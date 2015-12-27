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

    @Ignore
    public void isSearchByTitleYieldsRightResult() {
        LibraryInventory libraryInventory = new LibraryInventory();
        List<Book> books = libraryInventory.searchByAuthor("Dan Brown");
    }
}


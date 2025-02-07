package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ManageBooksTest {

    @Test
    public void bookListNotNullTest() {

        ManageBooks manageBooks = new ManageBooks(new ArrayList<>());
        Book book = new Book("Introduccion a JAVA");
        manageBooks.addBook(book);
        assertNotNull(manageBooks.getBooks(), "La Lista deberia tener almenos un elemento");

    }

    @Test
    public void listSizeTest() {
        ManageBooks manageBooks = new ManageBooks(new ArrayList<>());
        manageBooks.addBook(new Book("Bases de Datos"));
        manageBooks.addBook(new Book("Testing con Junit"));
        manageBooks.addBook(new Book("Unix"));
        manageBooks.addBook(new Book("Lenguaje C"));

        assertEquals(4, manageBooks.getBooks().size());

    }

    @Test
    public void getBookByTitleTest() {
        ManageBooks manageBooks = new ManageBooks(new ArrayList<>());

        manageBooks.addBook(new Book("Testing con Junit"));
        manageBooks.addBook(new Book("Lenguaje C"));

        assertEquals(manageBooks.getBookByTitle("Lenguaje C"), manageBooks.getBooksByIndex(0));
    }

    @Test
    public void noDuplicateTitlesTest() {
        ManageBooks manageBooks = new ManageBooks(new ArrayList<>());

        manageBooks.addBook(new Book("Bases de Datos"));
        manageBooks.addBook(new Book("Testing con Junit"));
        manageBooks.addBook(new Book("Unix"));
        manageBooks.addBook(new Book("bases de datos"));

        assertEquals(3, manageBooks.getBooks().size());
    }

    @Test
    public void getBooksByIndexTest() {
        ManageBooks manageBooks = new ManageBooks(new ArrayList<>());
        manageBooks.addBook(new Book("Bases de Datos"));
        manageBooks.addBook(new Book("Testing con Junit"));
        manageBooks.addBook(new Book("Unix"));
        manageBooks.addBook(new Book("Lenguaje C"));

        assertEquals(manageBooks.getBooksByIndex(3), manageBooks.getBookByTitle("Unix"));
    }

    @Test
    public void correctListUpdate() {
        ManageBooks manageBooks = new ManageBooks(new ArrayList<>());
        manageBooks.addBook(new Book("Bases de Datos"));

        assertEquals(1, manageBooks.getBooks().size());

        manageBooks.addBook(new Book("Testing con Junit"));
        manageBooks.addBook(new Book("Unix"));

        assertEquals(3, manageBooks.getBooks().size());
        assertEquals(manageBooks.getBooksByIndex(2), manageBooks.getBookByTitle("Unix"));

    }

    @Test
    public void removeBookSizeTest() {
        ManageBooks manageBooks = new ManageBooks(new ArrayList<>());
        manageBooks.addBook(new Book("Bases de Datos"));
        manageBooks.addBook(new Book("Testing con Junit"));
        manageBooks.addBook(new Book("Unix"));
        manageBooks.addBook(new Book("Lenguaje C"));

        assertEquals(4, manageBooks.getBooks().size());

        manageBooks.removeBooks("Unix");

        assertEquals(3, manageBooks.getBooks().size());

    }

    @Test
    public void checkListOrderTest() {

        ManageBooks manageBooks = new ManageBooks(new ArrayList<>());
        manageBooks.addBook(new Book("Bases de Datos"));
        manageBooks.addBook(new Book("Testing con JUnit"));
        manageBooks.addBook(new Book("Unix"));
        manageBooks.addBook(new Book("Lenguaje C"));

        assertEquals("Bases de Datos", manageBooks.getBooksByIndex(0).getTitle());
        assertEquals("Lenguaje C", manageBooks.getBooksByIndex(1).getTitle());
        assertEquals("Testing con JUnit", manageBooks.getBooksByIndex(2).getTitle());
        assertEquals("Unix", manageBooks.getBooksByIndex(3).getTitle());

        manageBooks.removeBooks("Bases de Datos");

        assertEquals("Lenguaje C", manageBooks.getBooksByIndex(0).getTitle());
        assertEquals("Testing con JUnit", manageBooks.getBooksByIndex(1).getTitle());
        assertEquals("Unix", manageBooks.getBooksByIndex(2).getTitle());

    }

}



package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ManageBooksTest {

    private Book book;
    private ManageBooks manageBooks;

    @BeforeEach
    public void init(){
        manageBooks = new ManageBooks(new ArrayList<>());

        manageBooks.addBook(new Book("Bases de Datos"));
        manageBooks.addBook(new Book("Testing con JUnit"));
        manageBooks.addBook(new Book("Unix"));
        manageBooks.addBook(new Book("Lenguaje C"));
    }

    @Test
    public void bookListNotNullTest() {

        assertNotNull(manageBooks.getBooks(), "La Lista deberia tener almenos un elemento");
    }

    @Test
    public void listSizeTest() {

        assertEquals(4, manageBooks.getBooks().size());

    }

    @Test
    public void getBookByTitleTest() {

        assertEquals(manageBooks.getBookByTitle("Bases de Datos"), manageBooks.getBooksByIndex(0));
    }

    @Test
    public void noDuplicateTitlesTest() {

        manageBooks.addBook(new Book("bases de datos"));
        assertEquals(4, manageBooks.getBooks().size());
    }

    @Test
    public void getBooksByIndexTest() {

        assertEquals(manageBooks.getBooksByIndex(3), manageBooks.getBookByTitle("Unix"));
    }

    @Test
    public void correctListUpdate() {

        assertEquals(4, manageBooks.getBooks().size());

        manageBooks.addBook(new Book("Javascript"));
        manageBooks.addBook(new Book("Sql Server"));

        assertEquals(6, manageBooks.getBooks().size());
        assertEquals(manageBooks.getBooksByIndex(5), manageBooks.getBookByTitle("Unix"));
    }

    @Test
    public void removeBookSizeTest() {

        assertEquals(4, manageBooks.getBooks().size());
        manageBooks.removeBooks("Unix");
        assertEquals(3, manageBooks.getBooks().size());
    }

    @Test
    public void checkListOrderTest() {

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



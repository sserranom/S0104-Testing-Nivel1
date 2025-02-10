package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

    @DisplayName("Comprueba si la lista no es nula despues de agregar Objetos")
    @Test
    public void bookListNotNullTest() {

        assertNotNull(manageBooks.getBooks(), "La Lista deberia tener almenos un elemento");
    }

    @DisplayName("Comprueba que la Lista tenga el tamaño esperado despues de agregar varios objetos")
    @Test
    public void listSizeTest() {

        assertEquals(4, manageBooks.getBooks().size());

    }

    @DisplayName("Valida que la lista contenga un libro especifico en su correcta posición")
    @Test
    public void getBookByTitleTest() {

        assertEquals(manageBooks.getBookByTitle("Bases de Datos"), manageBooks.getBookByIndex(0));
    }

    @DisplayName("Valida que no exiten libros duplicados en la lista")
    @Test
    public void noDuplicateTitlesTest() {

        manageBooks.addBook(new Book("bases de datos"));
        assertEquals(4, manageBooks.getBooks().size());
    }

    @DisplayName("Valida que se puede recuperar el titulo de un libro dada una posicion especifica")
    @Test
    public void getBooksByIndexTest() {

        assertEquals(manageBooks.getBookByIndex(3), manageBooks.getBookByTitle("Unix"));
    }

    @DisplayName("Valida que añadir un libro modifica correctamente la lista")
    @Test
    public void correctListUpdate() {

        assertEquals(4, manageBooks.getBooks().size());
        manageBooks.addBook(new Book("Javascript"));

        assertEquals(5, manageBooks.getBooks().size());
        assertEquals(manageBooks.getBookByIndex(4), manageBooks.getBookByTitle("Unix"));
    }

    @DisplayName("Valida que eliminar un libro disminuye correctamente la lista")
    @Test
    public void removeBookSizeTest() {

        manageBooks.removeBook("Unix");
        assertEquals(3, manageBooks.getBooks().size());
    }

    @DisplayName("Valida que la lista permanece ordenada alfabeticamente despues de añdir o eliminar un libro")
    @Test
    public void checkListOrderTest() {

        manageBooks.removeBook("Bases de Datos");

        assertEquals("Lenguaje C", manageBooks.getBookByIndex(0).getTitle());
        assertEquals("Testing con JUnit", manageBooks.getBookByIndex(1).getTitle());
        assertEquals("Unix", manageBooks.getBookByIndex(2).getTitle());
    }
}



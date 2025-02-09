package Ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ManageBooks {

    public ArrayList<Book> books;

    public ManageBooks() {
        this.books = new ArrayList<>();
    }

    public ManageBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {

        if (book == null || book.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("Tienes que escribir el nombre del libro.");
        }
        for (Book currentBook : books) {
            if (currentBook.getTitle().equalsIgnoreCase(book.getTitle())) {
                System.out.println("El libro ya existe");
                return;
            }
        }
        books.add(book);
        books.sort(Comparator.comparing(b -> b.getTitle().toLowerCase()));
    }

    public void getAllBook() {
        int index = 0;
        for (Book currentBook : books) {
            System.out.println(index + ": " + currentBook.getTitle());
            index++;
        }
    }


    public ArrayList<Book> getBooks() {
        if (books.isEmpty()) {
            System.out.println("No hay Libros en la colección");
        }
        return books;

    }

    public Book getBooksByIndex(int index) {
        if (index < 0 || index >= books.size()) {
            throw new IndexOutOfBoundsException("El Índice " + index + " esta fuera de rango");
        }
        return books.get(index);
    }

    public void addBooksByIndex(int index, Book book) {
        if (index < 0 || index > books.size()) {
            throw new IndexOutOfBoundsException("El Índice " + index + " esta fuera de rango");
        }
        books.add(index, book);
    }

    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public boolean removeBooks(String title) {

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}

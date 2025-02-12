package Ejercicio1;

import java.util.*;

public class ManageBooks {

    public List<Book> books;

    public ManageBooks() {
        this.books = new ArrayList<>();
    }

    public ManageBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {

        if (book == null || book.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("Tienes que escribir el nombre del libro.");
        }
        for (Book currentBook : books) {
            if (currentBook.getTitle().equalsIgnoreCase(book.getTitle())) {
                throw new IllegalArgumentException("El libro " + book.getTitle() + " ya existe");
            }
        }
        books.add(book);
        books.sort(Comparator.comparing(b -> b.getTitle().toLowerCase()));
    }

    public List<String> getAllBooks() {
        List<String> bookTitles = new ArrayList<>();
        int index = 0;
        for (Book currentBook : books) {
            bookTitles.add(index + ": " + currentBook.getTitle());
            index++;
        }
        return bookTitles;
    }

    public List<Book> getBooks() {

        if (books.isEmpty()) {
            return new ArrayList<>();
        }
        return books;
    }

    public Book getBookByIndex(int index) {

        if (index < 0 || index >= books.size()) {
            throw new IndexOutOfBoundsException("El Índice " + index + " esta fuera de rango");
        }
        return books.get(index);
    }

    public void addBookByIndex(int index, Book book) {
        if (index < 0 || index > books.size()) {
            throw new IndexOutOfBoundsException("El Índice " + index + " esta fuera de rango");
        }
        for (Book currentBook : books) {
            if (currentBook.getTitle().equalsIgnoreCase(book.getTitle())) {
                throw new IllegalArgumentException("El libro " + book.getTitle() + " ya está existe");
            }
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

    public boolean removeBook(String title) {

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

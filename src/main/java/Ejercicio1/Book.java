package Ejercicio1;

public class Book {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.getTitle());
    }

    @Override
    public int hashCode() {
        return title.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "Libro: " + title + "\n";
    }
}

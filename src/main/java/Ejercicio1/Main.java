package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        ManageBooks manageBooks = new ManageBooks(new ArrayList<>());

        manageBooks.addBook(new Book("Bases de Datos"));
        manageBooks.addBook(new Book("Testing con JUnit"));
        manageBooks.addBook(new Book("Unix"));
        manageBooks.addBook(new Book("Lenguaje C"));
        manageBooks.addBook(new Book("C++ Fundamentos"));

        Scanner input = new Scanner(System.in);

        System.out.println("\nElija la operacion que desea Realizar: \n");
        System.out.println("1. Añadir Libros a la Colección. \n2. Ver la Lista Completa de los Libros. \n" +
                "3. Obtener el titulo del libro dada una posición. \n4. Agregar un Libro en una Posicion Especifica. \n" +
                "5. Eliminar un libro por el titulo ");

        switch (input.nextInt()) {

            case 1:
                input.nextLine();
                while (true) {
                    System.out.println("Ingrese el nuevo libro: ");
                    manageBooks.addBook(new Book(input.nextLine()));
                    System.out.println("Desea Agregar otro libro: S/N");

                    String addMore = input.nextLine().trim();
                    if (!addMore.equalsIgnoreCase("S")) {
                        break;
                    }
                }
                manageBooks.getAllBook();
                break;

            case 2:
                manageBooks.getAllBook();
                break;

            case 3:
                System.out.println("****Lista Completa de libros****");
                manageBooks.getAllBook();
                System.out.print("\nIngrese el índice del libro: \n");
                int index = input.nextInt();
                try {
                    System.out.println("Libro seleccionado: " + manageBooks.getBooksByIndex(index).getTitle());
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;

            case 4:
                manageBooks.getAllBook();
                System.out.println("Ingrese la posicion en la que quiere agregar el nuevo libro: ");
                int position = input.nextInt();
                System.out.println("Ingrese el nombre del nuevo libro: ");
                input.nextLine();
                try {
                    manageBooks.addBooksByIndex(position, new Book(input.nextLine()));
                    System.out.println("Libro agregado correctamente");
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                //System.out.println();
                manageBooks.getAllBook();
                break;

            case 5:
                System.out.println("Digite el nombre del libro que desea eliminar: \n");
                manageBooks.getAllBook();
                input.nextLine();
                if (manageBooks.removeBooks(input.nextLine())) {
                    System.out.println("Libro eliminado correctamente.");
                } else {
                    System.out.println("El libro que desea eliminar no esta en la lista");
                }
                manageBooks.getAllBook();
        }
    }
}

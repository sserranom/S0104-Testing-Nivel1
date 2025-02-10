package Ejercicio1;

import java.util.Scanner;

public class Menu {

    private final ManageBooks manageBooks;
    private final Scanner input;

    public Menu(ManageBooks manageBooks, Scanner input) {
        this.manageBooks = manageBooks;
        this.input = input;
    }

    public void showMenu() {

        System.out.println("\nElija la operación que desea realizar: \n");
        System.out.println("1. Añadir Libros a la Colección. \n2. Ver la Lista Completa de los Libros. \n" +
                "3. Obtener el título del libro dada una posición. \n4. Agregar un Libro en una Posición Específica. \n" +
                "5. Eliminar un libro por el título ");

        int option = input.nextInt();
        input.nextLine();
        switch (option) {
            case 1:
                while (true) {
                    System.out.println("Ingrese el nuevo libro: ");
                    String title = input.nextLine();
                    manageBooks.addBook(new Book(title));
                    System.out.println("Desea Agregar otro libro: S/N");
                    String addMore = input.nextLine().trim();
                    if (!addMore.equalsIgnoreCase("S")) {
                        break;
                    }
                }
                manageBooks.getAllBooks();
                break;

            case 2:
                manageBooks.getAllBooks();
                break;

            case 3:
                System.out.println("****Lista Completa de libros****");
                manageBooks.getAllBooks();
                System.out.print("\nIngrese el índice del libro: \n");
                int index = input.nextInt();
                try {
                    System.out.println("Libro seleccionado: " + manageBooks.getBookByIndex(index).getTitle());
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case 4:
                manageBooks.getAllBooks();
                System.out.println("Ingrese la posicion en la que quiere agregar el nuevo libro: ");
                int position = input.nextInt();
                System.out.println("Ingrese el nombre del nuevo libro: ");
                input.nextLine();
                try {
                    manageBooks.addBookByIndex(position, new Book(input.nextLine()));
                    System.out.println("Libro agregado correctamente");
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                manageBooks.getAllBooks();
                break;

            case 5:
                System.out.println("Digite el nombre del libro que desea eliminar: \n");
                manageBooks.getAllBooks();
                String title = input.nextLine();
                if (manageBooks.removeBook(title)) {
                    System.out.println("Libro eliminado correctamente.");
                } else {
                    System.out.println("El libro que desea eliminar no está en la lista");
                }
                manageBooks.getAllBooks();
                break;

            default:
                System.out.println("Opción no válida");
        }
    }
}

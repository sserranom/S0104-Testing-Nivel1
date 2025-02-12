package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManageBooks manageBooks = new ManageBooks(new ArrayList<>());
        manageBooks.addBook(new Book("Bases de Datos"));
        manageBooks.addBook(new Book("Testing con JUnit"));
        manageBooks.addBook(new Book("Unix"));
        manageBooks.addBook(new Book("Lenguaje C"));
        manageBooks.addBook(new Book("C++ Fundamentos"));

        try (Scanner input = new Scanner(System.in)) {
            Menu menu = new Menu(manageBooks, input);

            menu.showMenu();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

    }
}

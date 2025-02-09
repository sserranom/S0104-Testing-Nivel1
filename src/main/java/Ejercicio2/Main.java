package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DniValidator dniNumber = new DniValidator();
        Scanner input = new Scanner(System.in);
        System.out.println("\n*****Calcula el Letra del DNI Recibiendo el Numero como parametro******\n");
        System.out.println("Ingrese el Numero del DNI sin la Letra: \n");

        try {
            System.out.println("El DNI completo es: " + dniNumber.dniLetterCalculator(input.nextLine()));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

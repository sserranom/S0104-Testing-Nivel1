package Ejercicio2;

public class DniValidator {

       private static final String[] TABLE = {
                "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N",
                "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"
        };

    public static String dniLetterCalculator(String dniNumber) {
        if (dniNumber == null || !dniNumber.matches("\\d{8}")) {
            throw new IllegalArgumentException("Número de DNI inválido. Debe contener exactamente 8 dígitos numéricos.");
        }

        long number = Long.parseLong(dniNumber);
        int mod = (int) (number % 23);
        return TABLE[mod];
    }
}

package Ejercicio2;

public class DniValidator {

    private String dniNumber;

    public DniValidator() {

    }

    public void setDniNumber(String dniNumber) {
        this.dniNumber = dniNumber;
    }

    public String dniLetterCalculator(String dniNumber) {
        String[] table = new String[23];
        table[0] = "T";
        table[1] = "R";
        table[2] = "W";
        table[3] = "A";
        table[4] = "G";
        table[5] = "M";
        table[6] = "Y";
        table[7] = "F";
        table[8] = "P";
        table[9] = "D";
        table[10] = "X";
        table[11] = "B";
        table[12] = "N";
        table[13] = "J";
        table[14] = "Z";
        table[15] = "S";
        table[16] = "Q";
        table[17] = "V";
        table[18] = "H";
        table[19] = "L";
        table[20] = "C";
        table[21] = "K";
        table[22] = "E";

        if (dniNumber != null && dniNumber.matches("\\d{8}")) {
            int mod = Integer.parseInt(dniNumber) % 23;
            String dniLetter = table[mod];
            return dniNumber + dniLetter;
        } else {
            throw new IllegalArgumentException("Número de DNI inválido. Debe contener 8 dígitos.");
        }
    }
}

package Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.function.Executable;

public class DniValidatorTest {

  @DisplayName("Prueba unitaria para validar el numero de DNI")
  @ParameterizedTest(name = " test {index} con el valor {0} con letra {1} deberia ser correcto")
  @CsvSource({"12345678, Z", "87654321, X", "34567890, V", "98765432, M", "56789012, B", "67890123, B",
          "78901234, X", "89012345, E", "90123456, A", "11223344, B"})
  public void dniLetterCalculator(String dniNumber, String dniLetter) {

    String letterExpected = DniValidator.dniLetterCalculator((dniNumber));
    assertEquals(letterExpected, dniLetter);

  }

  @DisplayName("Prueba unitaria para validar que no acepte numeros incorrectos")
  @ParameterizedTest(name = " test {index} el valor {0} deberia ser incorrecto")
  @CsvSource({"656133", "45621456S", "A5453", "S"})
  public void invalidNumberEntered(String dniNumber) {

    Executable executable = () -> DniValidator.dniLetterCalculator(dniNumber);
    assertThrows(IllegalArgumentException.class, executable);

  }

  @DisplayName("Prueba para el DNI más bajo posible (00000000)")
  @Test
  public void testDniLowerLimit() {

    String dniNumber = "00000000";
    String expectedLetter = "T";
    String dniLetter = DniValidator.dniLetterCalculator(dniNumber);
    assertEquals(expectedLetter, dniLetter, "La letra para el DNI 00000000 debe ser 'T'");
  }

  @DisplayName("Prueba para el DNI más alto posible (99999999)")
  @Test
  public void testDniUpperLimit() {

    String dniNumber = "99999999";
    String expectedLetter = "R";
    String dniLetter = DniValidator.dniLetterCalculator(dniNumber);
    assertEquals(expectedLetter, dniLetter, "La letra para el DNI 99999999 debe ser 'R'");

  }

}

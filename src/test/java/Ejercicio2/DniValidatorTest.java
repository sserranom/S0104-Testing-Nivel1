package Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.function.Executable;

public class DniValidatorTest {

  private static DniValidator dniValidator;

  @BeforeAll
  public static void init() {
    dniValidator = new DniValidator();
  }

  @DisplayName("Prueba unitaria para validar el numero de DNI")
  @ParameterizedTest(name = " test {index} con el valor {0} con letra {1} deberia ser correcto")
  @CsvSource({"12345678, Z", "87654321, X", "34567890, V", "98765432, M", "56789012, B", "67890123, B",
          "78901234, X", "89012345, E", "90123456, A", "11223344, B"})
  public void dniLetterCalculator(String dniNumber, String dniLetter) {

    String dniExpected = dniValidator.dniLetterCalculator((dniNumber));
    assertEquals(dniNumber + dniLetter, dniExpected);

  }

  @DisplayName("Prueba unitaria para validar que no acepte numeros incorrectos")
  @ParameterizedTest(name = " test {index} el valor {0} deberia ser incorrecto")
  @CsvSource({"656133", "45621456S", "A5453", "S"})
  public void invalidNumberEntered(String dniNumber) {

    Executable executable = () -> dniValidator.dniLetterCalculator(dniNumber);
    assertThrows(IllegalArgumentException.class, executable);
  }

}

package Ejercicio3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

public class ManageCoursesTest {

    @DisplayName("Prueba unitaria validar que la Excepcion se lance correctamente")
    @ParameterizedTest(name = "test {index} con el valor {0} deberia lanzar la excepciom")
    @ValueSource(ints = {4,5, -1, 6} )
    public void getCoursesTest(int index){
        ManageCourses manageCourses = new ManageCourses(new ArrayList<>());

        manageCourses.addCourse(new Course("Java", "500"));
        manageCourses.addCourse(new Course("Desarrollo de aplicaciones con Flutter", "350"));
        manageCourses.addCourse(new Course("HTML Y CSS", "200"));
        manageCourses.addCourse(new Course("Full Stack Developer", "590"));

        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            manageCourses.getCourses(index);
        });

        assertEquals(exception.getMessage(), "Index" + index + "no existe o fuera de rango");
    }
}

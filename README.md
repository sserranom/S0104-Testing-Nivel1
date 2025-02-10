***S0104-Testing N1***

- Ejercicio 1
Crea una clase Java que gestione una colección de libros en una biblioteca. La clase debe permitir añadir libros, recuperar la lista de libros, obtener un libro específico por su posición, añadir un libro en una posición específica y eliminar un libro por título.

Implementa las siguientes funcionalidades:

La clase debe permitir añadir libros a la colección.
Se debe poder recuperar la lista completa de libros
Se debe poder obtener el título de un libro dada una posición.
Se debe poder añadir un libro en una posición específica.
Se debe poder eliminar un libro por título.
Verifica su correcto funcionamiento con JUnit:

Verifican que la lista de libros no es nula después de crear un objeto nuevo.
Confirman que la lista tiene un tamaño esperado después de insertar varios libros.
Aseguran que la lista contiene un libro específico en su correcta posición.
Verifican que no existen títulos de libros duplicados en la lista.
Comprueban que se puede recuperar el título de un libro dada una posición específica.
Aseguran que añadir un libro modifica correctamente la lista.
Confirman que eliminar un libro disminuye el tamaño de la lista.
Verifican que la lista permanece ordenada alfabéticamente después de añadir o eliminar un libro.

- Ejercicio 2
Crea una clase llamada CalculoDni que calcule la letra del DNI al recibir el número como parámetro.
Crea una clase jUnit que verifique su correcto funcionamiento, parametrizándola para que el test reciba un espectro de datos amplio y valide si el cálculo es correcto para 10 números de DNI predefinidos.

- Ejercicio 3
Crea una clase con un método que arroje una ArrayIndexOutOfBoundsException.
Verifica su correcto funcionamiento con un test jUnit.

***Tecnologías Utilizadas***

-Lenguaje: Java version "23.0.1" 2024-10-15
-IDE: IntelliJ IDEA
-Maven : gestión de dependencias y construcción del proyecto
-JUnit: Framework para realizar pruebas unitarias en Java

***Requisitos***

1.Java ( JDK 17 o superior)
2.IntelliJ IDEA: Puedes descargarlo desde [el sitio oficial de JetBrains](https://www.jetbrains.com/idea/).
3. Maven: Si no tienes Maven instalado, sigue las instrucciones en la [documentación oficial](https://maven.apache.org/install.html).
4. JUnit: JUnit ya está configurado como dependencia en el proyecto a través de Maven.

***Instalacion***

1. Clona este repositorio: https://github.com/sserranom/S0104-Testing-Nivel1.git
2. En IntelliJ IDEA. Ve a "File" -> "Open" y selecciona la carpeta donde clonaste el repositorio. IntelliJ detectará automáticamente el archivo `pom.xml` y descargará las dependencias de Maven.
3. Compila el proyecto con Maven: En IntelliJ IDEA, abre el terminal integrado y ejecuta: "mvn clean install". Esto descargará las dependencias necesarias y compilará el proyecto.

***Desplieque***

Este proyecto está destinado principalmente a pruebas unitarias y no tiene un componente web o servidor asociado para despliegue. Si deseas ejecutar las pruebas, sigue los siguientes pasos:

1. Ejecuta las pruebas unitarias:
Para ejecutar las pruebas, puedes hacerlo directamente desde IntelliJ IDEA:
- Haz clic derecho en la clase de pruebas o en el archivo de prueba (por ejemplo, `ManageCoursesTest`) y selecciona "Run".


2. **Ver los resultados de las pruebas**:
- Los resultados de las pruebas se mostrarán en la ventana de "Run" en IntelliJ IDEA o en la terminal si ejecutas Maven.



import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) {

        //! Importante.
        //* Comentarios.
        // Mensajes sin importancia.
        //? Codigo a resolver en el futuro, notas.

        //* Nombres de clases y objetos empezando con mayúscula: Producto.
        //* Modificadores de acceso presentados como getVariable y setVariable en vez de _variable: getEdad.
        //* camelCase como nombre de variables: codigoObrero.
        //* camelCase como nombre de métodos o funciones: cargarDatos().

        //! Código prolijo | Funciones lo más simples posibles.
        //! Lógica para ingresar datos implementada como un método en el Main.
        //! Evitar el uso de prints dentro de los métodos (a no ser que sea estrictamente necesario), reduce el rendimiento.

        //* throw new MisExcepciones("No elegiste un valor del menu");


        /* Cordero corderito = new Cordero("Santiaguito", "Ovino Argentino", 50, 15, 1.8);
        corderito.saludar(true);
        System.out.println(corderito.hashCode()); */

        try{
            // Define the base path
            Path basePath = Paths.get("Main/src/files");

            // Create directories if they do not exist
            Path directory = Files.createDirectories(basePath);
            System.out.println("newDirectory = " + directory);

            // Define the file path
            Path filePath = basePath.resolve("testJava.txt");

            // Check if the file already exists
            if (Files.exists(filePath)) {
                throw new MisExcepciones("The file " + filePath + " already exists.");
            } else {
                // Create the file
                Path newFile = Files.createFile(filePath);
                System.out.println("newFile = " + newFile);
            }

        }
        catch (MisExcepciones e) {
            System.err.println(e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }


    //! < ---------------------------- METODOS DEL MAIN ---------------------------- />



}

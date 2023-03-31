import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploMetodoDos {
    /* Poco eficiente con grandes volúmenes de datos. */
    public static void main(String[] args) {
        int lineNumber = 1;
        try {
            File archivo = new File("src/datos.txt");
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()){
                String linea = scanner.nextLine();
                String[] partes = linea.split(" ");
                String nombre = partes[0];
                int edad = Integer.parseInt(partes[1]);
                System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
                lineNumber++;
            }
        }catch(FileNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }catch(NumberFormatException e) {
            System.out.println("Exception: Error on line -> " + lineNumber + "; "+ e.getMessage());
            e.printStackTrace();
        }


    }
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploMetodoUno {
    public static void main(String[] args) {


        try {
            FileReader fr = new FileReader("src/datos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine()) != null){
                String[] partes = linea.split(" ");
                String nombre = partes[0];
                int edad = Integer.parseInt(partes[1]);
                System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
            }
        } catch (FileNotFoundException e){
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


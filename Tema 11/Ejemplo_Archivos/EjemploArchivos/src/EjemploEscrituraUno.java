import java.io.FileWriter;
import java.io.IOException;

public class EjemploEscrituraUno {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/archivoEscribir.txt", true);  //Si se añade un segundo parámetro (append)
            writer.write("Primera línea\n");                                    // y se vuelve a ejecutar, añade a lo que haya
            writer.write("Segunda línea\n");                                    // en el archivo, si no, sobreescribe.
            writer.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

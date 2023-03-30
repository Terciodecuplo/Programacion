import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Iterar {
    public static void main(String[] args) {
        // Crear un ArrayList de tipo String
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos al ArrayList
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("María");

        // Recorrer el ArrayList y mostrar cada elemento por pantalla
        System.out.println("Elementos del ArrayList:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        // El siguiente ejemplo muestra cómo recorrer un ArrayList 
        // utilizando un bucle while y el método hasNext de Iterator:
        System.out.println("Elementos del ArrayList:");
        Iterator<String> iterador = nombres.iterator();
        while (iterador.hasNext()) {
            String nombre = iterador.next();
            System.out.println(nombre);
        }

        // Ordenar el ArrayList
        Collections.sort(nombres);
        // Elementos del ArrayList ordenados:
        System.out.println("Elementos del ArrayList ordenados:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
    }
}

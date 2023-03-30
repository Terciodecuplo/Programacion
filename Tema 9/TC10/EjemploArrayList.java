import java.util.ArrayList;

public class EjemploArrayList {

    public static void main(String[] args) {
        // Crear un ArrayList vacío
        ArrayList<String> nombres = new ArrayList<String>();

        // Agregar elementos al ArrayList
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("María");

        // Verificar si el ArrayList está vacío
        System.out.println("¿El ArrayList está vacío? " + nombres.isEmpty());

        // Obtener el tamaño del ArrayList
        System.out.println("Tamaño del ArrayList: " + nombres.size());

        // Verificar si el ArrayList contiene un elemento específico
        System.out.println("¿El ArrayList contiene a 'Juan'? " + nombres.contains("Juan"));

        // Eliminar un elemento del ArrayList
        nombres.remove("Pedro");

        // Limpiar todos los elementos del ArrayList
        nombres.clear();

        // Verificar si el ArrayList está vacío después de limpiarlo
        System.out.println("¿El ArrayList está vacío? " + nombres.isEmpty());
    }
}

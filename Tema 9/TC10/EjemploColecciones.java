import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EjemploColecciones {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<String>();
        frutas.add("manzana");
        frutas.add("banana");
        frutas.add("pera");
        frutas.add("naranja");
        frutas.add("manzana");

        System.out.println("Tamaño del Set: " + frutas.size());
        System.out.println("El Set está vacío? " + frutas.isEmpty());
        System.out.println("El Set contiene 'manzana'? " + frutas.contains("manzana"));

        System.out.println("Set antes de eliminar una fruta: " + frutas);
        frutas.remove("naranja");
        System.out.println("Set después de eliminar una fruta: " + frutas);

        frutas.clear();
        System.out.println("Set después de limpiarlo: " + frutas);

        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 25);
        edades.put("Ana", 30);
        edades.put("María", 28);
        edades.put("Pedro", 27);

        System.out.println("Tamaño del Map: " + edades.size());
        System.out.println("El Map está vacío? " + edades.isEmpty());
        System.out.println("El Map contiene la llave 'Ana'? " + edades.containsKey("Ana"));
        System.out.println("El Map contiene el valor '28'? " + edades.containsValue(28));

        System.out.println("Map antes de eliminar una llave-valor: " + edades);
        edades.remove("María");
        System.out.println("Map después de eliminar una llave-valor: " + edades);

        edades.clear();
        System.out.println("Map después de limpiarlo: " + edades);
    }
}

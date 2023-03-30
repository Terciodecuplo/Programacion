import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    /*
     * Una cola en Java es una estructura de datos que se utiliza para almacenar elementos en una orden determinada. 
     * La cola implementa la interfaz Queue en Java y se puede usar para almacenar una colección de elementos en el orden en que se agregan.
     *   Parte trasera (insertar, poner en la cola) +------+------+------+------+ Parte delantera (eliminar, sacar de la cola)
     *                                              |      |      |      |      |
     *                                              +------+------+------+------+ 
     */
    public static void main(String[] args) {
        // Crear una cola utilizando la clase LinkedList
        Queue<String> cola = new LinkedList<>();

        // Añadir elementos a la cola
        cola.add("Elemento 1");
        cola.offer("Elemento 2");
        cola.add("Elemento 3");

        // Imprimir la cola
        System.out.println("Cola: " + cola);

        // Obtener y eliminar el primer elemento de la cola
        String primerElemento = cola.remove();
        System.out.println("Primer elemento de la cola: " + primerElemento);

        // Obtener y eliminar el primer elemento de la cola utilizando el método poll
        String primerElementoPoll = cola.poll();
        System.out.println("Primer elemento de la cola (utilizando poll): " + primerElementoPoll);

        // Obtener el primer elemento de la cola utilizando el método element (en este caso no se elimina)
        String primerElementoElement = cola.element();
        System.out.println("Primer elemento de la cola (utilizando element): " + primerElementoElement);

        // Obtener el primer elemento de la cola utilizando el método peek (en este caso tampoco se elimina)
        String primerElementoPeek = cola.peek();
        System.out.println("Primer elemento de la cola (utilizando peek): " + primerElementoPeek);

        // Imprimir la cola después de las operaciones
        System.out.println("Cola después de las operaciones: " + cola);
    }
}

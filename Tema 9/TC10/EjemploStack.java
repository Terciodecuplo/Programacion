import java.util.Stack;

public class EjemploStack {
    /*
     * la clase Stack representa una pila de elementos, donde el último elemento agregado es el primero en ser eliminado (pila de libros)
     * (LIFO, Last In First Out). Esta clase está disponible en el paquete java.util. 
     *    +------+ <---- top (cima de la pila)
     *    |      |
     *    +------+
     *    |      |
     *    +------+
     *    |      |
     *    +------+ 
     */
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacía? " + pila.empty());

        // Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        // Obtener el elemento en la cima de la pila sin eliminarlo
        System.out.println("El elemento en la cima de la pila es: " + pila.peek());

        // Eliminar y obtener el elemento en la cima de la pila
        int elementoEliminado = pila.pop();
        System.out.println("Se ha eliminado el elemento " + elementoEliminado);

        // Agregar un elemento a la pila
        pila.push(50);

        // Obtener la posición de un elemento en la pila
        int posicion = pila.search(20);
        if (posicion == -1) {
            System.out.println("El elemento 20 no está en la pila");
        } else {
            System.out.println("El elemento 20 está en la posición " + posicion + " de la pila");
        }

        // Obtener el elemento en la cima de la pila sin eliminarlo
        System.out.println("El elemento en la cima de la pila es: " + pila.peek());

        // Eliminar todos los elementos de la pila
        pila.clear();
        System.out.println("La pila ha sido vaciada");

        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacía? " + pila.empty());
    }
}

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5U3Lists {
    public static void main(String[] args) {
        Ejercicio5U3Lists ejercicio5U3List = new Ejercicio5U3Lists();
        ejercicio5U3List.executeProgram(); // Llamo a la función donde corren el resto de funciones (para no usar static)
    }
    // Función principal del programa.
    private void executeProgram() {

        showInstructions();
        List<Integer> listOfNumbers = getUserInput();
        List<Integer> sortedList = sortList(listOfNumbers);
        showListOfNumbers(sortedList);
    }

    private void showInstructions() {
        System.out.println("A continuación se le van a solicitar la entrada de varios números. Si desea finalizar la entrada" +
                " de números pulse 0 y se procederá a ordenar los números introducidos.");
    }
    // Creo la lista con los números que el usuario va introduciendo hasta que pulsa 0.
    private List<Integer> getUserInput() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> userInputList = new LinkedList<>(); // La utilización de LinkedList es porque importa el orden de introducción de los datos
        do {
            System.out.print("Introduzca un número (0 para salir): ");
            userInputList.add(scanner.nextInt());
        } while (getLastNumber(userInputList) != 0);
        return userInputList;
    }
    // Función para controlar el último número que el usuario introduce. Se utiliza en la línea 31 para finalizar el bucle.
    private int getLastNumber(List<Integer> userInputList) {
        return userInputList.get(userInputList.size() - 1);

    }
    // Ordeno la lista.
    private List<Integer> sortList(List<Integer> listOfNumbers) {
        Collections.sort(listOfNumbers);
        return listOfNumbers;
    }
    // Muestra la lista por pantalla una vez ha sido ordenada.
    private void showListOfNumbers(List<Integer> sortedList) {
        for (int currentItem : sortedList) {
            if (sortedList.indexOf(currentItem) == sortedList.size() - 1) {
                System.out.print(currentItem);
            } else {
                System.out.print(currentItem + ", ");
            }
        }
    }


}
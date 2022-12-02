import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5U3Lists {
    public static void main(String[] args) {
        Ejercicio5U3Lists ejercicio5U3List = new Ejercicio5U3Lists();
        ejercicio5U3List.executeProgram();
    }

    private void executeProgram() {
        // Order a list of numbers introduced by the user from 0 to n. The user has to insert numbers until a 0 is detected.
        // Show instructions msg *
        // Receive input from user *
        // Detect if the user insert a 0 *
        // Save the inputs in a list *
        // Sort the list from lower to higher *
        // Show ordered list
        showInstructions();
        List<Integer> listOfNumbers = getUserInput();
        List<Integer> sortedList = sortList(listOfNumbers);
        showListOfNumbers(sortedList);
    }

    private void showInstructions() {
        System.out.println("A continuación se le van a solicitar la entrada de varios números. Si desea finalizar la entrada" +
                " de números pulse 0 y se procederá a ordenar los números introducidos.");
    }

    private List<Integer> getUserInput() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> userInputList = new LinkedList<>();
        do {
            System.out.print("Introduzca un número (0 para salir): ");
            userInputList.add(scanner.nextInt());
        } while (getLastNumber(userInputList) != 0);
        return userInputList;
    }

    private int getLastNumber(List<Integer> userInputList) {
        return userInputList.get(userInputList.size() - 1);

    }

    private List<Integer> sortList(List<Integer> listOfNumbers) {
        Collections.sort(listOfNumbers);
        return listOfNumbers;
    }

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
import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Digitos digitos = new Digitos();
        digitos.runProgram();

    }
    private void runProgram(){
        Scanner scanner = new Scanner(System.in);
        showWelcomeMsg();
        int userInputNumber = getUserInput(scanner);
        System.out.println("Has introducido el número "+ userInputNumber + " el cual contiene " + recursiveDigitCounter(userInputNumber) + " dígitos.");
        scanner.close();        // Cierro el teclado... sí Irene, por fin lo cierro XD
    }

    private void showWelcomeMsg(){
        System.out.print("\n\nBienvenido al contador de números recursivo. \nPor favor, introduzca un número entero: ");
    }

    private int getUserInput(Scanner scanner){
        return scanner.nextInt();
    }

    private int recursiveDigitCounter(int userInputNumber) { // Función recursiva. Vamos eliminando dígitos de nuestra entrada dividiendo entre 10
        if(userInputNumber < 10 ){                           // hasta que el número es < 10 y a partir de ahí vamos sumando 1 en cada llamada recursiva.
            return 1;
        } else {
            return recursiveDigitCounter(userInputNumber/10) + 1;
        }
    }
}

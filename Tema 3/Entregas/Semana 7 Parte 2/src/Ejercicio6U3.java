import java.util.Scanner;

public class Ejercicio6U3 {
    public static void main(String[] args) {
        System.out.println("A continuación deberá introducir un número cualquiera y el sistema");
        System.out.println("comprobará si el número es válido o no.");
        System.out.println("Para que un número sea considerado válido tendrá que cumplir:");
        System.out.println("     a) El número introducido estará comprendido entre 1000 y 10000.");
        System.out.println("     b) El número introducido no puede ser divisible por 5 o acabar en 0.");
        System.out.print("Su número: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        boolean validNumber;
        if(userInput >= 1000 && userInput <= 10000 && (userInput % 5 != 0) && (userInput % 10) != 0) {
            validNumber = true;
            showMessage(validNumber);
        } else {
            validNumber = false;
            showMessage(validNumber);
        }
    }
    public static void showMessage(boolean validNumber){
        if (validNumber) {
            System.out.println("El número es válido.");
        } else {
            System.out.println("El número NO es válido.");
        }
    }
}

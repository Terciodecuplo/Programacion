import java.util.Scanner;

public class Ejercicio8U3 {
    public static void main(String[] args) {
        showHeader();
        int userInput = getUserInput();
        boolean imPrimeNumber = calcPrimeNumber(userInput);
        showResult(imPrimeNumber);
    }

    public static void showHeader() {
        System.out.println(" |  _ \\ _ __(_)_ __ ___   ___    / ___|__ _| | ___ \n" +
                " | |_) | '__| | '_ ` _ \\ / _ \\  | |   / _` | |/ __|\n" +
                " |  __/| |  | | | | | | | (_) | | |__| (_| | | (__ \n" +
                " |_|   |_|  |_|_| |_| |_|\\___/   \\____\\__,_|_|\\___|");
        System.out.println();
        System.out.println("Bienvenido al sistema de cálculo de números primos.");
        System.out.println("Por favor, introduce un número, a continuación te diré si el número que" +
                "has elegido es primo o no.");
    }

    public static int getUserInput() {
        System.out.print("Tu número: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }
    /*
        Según la última convención alcanzada alrededor de los números primos, el 1 ya no es considerado
        por los matemáticos como tal, así que por eso en la función "calcPrimeNumber" no se tiene en cuenta
        el número 1 de cara a saber si el número es primo.

        Así pues, lo que hacemos en este punto es comprobar que los números que hay, desde el 2 (porque así
        no tendríamos en cuenta el 1) hasta el número introducido por el usuario, al dividir a dicho número
        tienen resto 0. Si el resto es 0 y aún no hemos alcanzado en la variable 'i' el valor del número introducido,
        significa que el número no solo es divisible por 1 y por sí mismo y, por tanto, no será primo.
        Si llegamos a esa situación, lo que hacemos es indicar que el número no es primo y automáticamente
        finalizamos el bucle.
     */
    public static boolean calcPrimeNumber(int userInput) {
        boolean imPrime = false;
        for (int i = 2; i <= userInput; i++){
            if((userInput%i) == 0 && i == userInput) {
                imPrime = true;
            } else if ((userInput % i) == 0 && i != userInput) {
                imPrime = false;
                break;
            }
        }
        return imPrime;
    }

    public static void showResult(boolean imPrime) {
        if(imPrime) {
            System.out.println("El número que has introducido es primo.");
        } else {
            System.out.println("El número que has introducido NO es primo.");
        }
    }
}

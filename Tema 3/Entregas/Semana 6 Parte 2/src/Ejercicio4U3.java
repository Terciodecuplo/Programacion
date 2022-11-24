import java.util.Scanner;

public class Ejercicio4U3 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduce un número Racional y trataré de identificar de qué tipo es: ");
        Scanner scanner = new Scanner(System.in);
        double userInput = scanner.nextDouble();
        System.out.print("El número que has elegido es ");
        if((userInput%2)==0){
            System.out.print("par, ");
        } else {
            System.out.print("impar, ");
        }
        if(userInput < 0){
            System.out.print("negativo y ");
        } else if(userInput == 0) {
            System.out.print("neutro y ");
        } else {
            System.out.print("positivo y ");
        }
        if(userInput == (int)userInput){
            System.out.print("entero.");
        } else {
            System.out.print("decimal.");
        }
    }
}

import java.util.Scanner;

public class Ejercicio7U3 {
    public static void main(String[] args) {
        System.out.println("Introduzca un número. A continuación le devolveré una letra correspondiendo al resto de");
        System.out.println("su división entre 5.");
        System.out.print("Su número: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int remainder;
        remainder = userInput % 5;
        switch (remainder){
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("D");
                break;
            case 4:
                System.out.println("E");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}

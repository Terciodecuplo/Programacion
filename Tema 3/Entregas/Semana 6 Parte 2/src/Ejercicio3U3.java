import java.util.Scanner;

public class Ejercicio3U3 {
    public static void main(String[] args) {
        System.out.print("Introduzca un dividendo: ");
        Scanner scanner = new Scanner(System.in);
        int dividend = scanner.nextInt();
        System.out.print("Ahora introduzca un divisor: ");
        int divisor = scanner.nextInt();
        int result;
        result = dividend % divisor;
        if ((dividend % divisor) == 0) {
            System.out.println("La división es exacta. El resto = " + result);
        } else {
            System.out.println("La división NO es exacta. El resto = " + result);

        }
    }
}

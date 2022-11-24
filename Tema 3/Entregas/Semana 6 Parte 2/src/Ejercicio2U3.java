import java.util.Scanner;

public class Ejercicio2U3 {
    public static void main(String[] args) {
        System.out.println("Dame un número y yo sumaré todos aquellos números desde el 1 hasta el que me hayas introducido.");
        System.out.print("Tu número: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int summation = 0;
        for(int i = 1; summation <= userInput; i++){
            summation+=i;
            if(summation <= userInput ) {
                System.out.print(i + " + ");
            } else if (summation > userInput) {
                System.out.print( i + " = " + summation);
            }
        }
    }
}

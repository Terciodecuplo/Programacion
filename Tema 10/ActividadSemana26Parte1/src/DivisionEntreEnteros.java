import java.util.Scanner;

public class DivisionEntreEnteros {
    public static void main(String[] args) {
        DivisionEntreEnteros divisionEntreEnteros = new DivisionEntreEnteros();
        divisionEntreEnteros.runProgram();
    }

    private void runProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un dividendo: ");
        int dividend = Integer.parseInt(userInput(scanner));
        int divisor;
        boolean correctDivisor = false;
        do {
            try {
                System.out.print("Introduce un divisor (distinto de cero): ");
                divisor = Integer.parseInt(userInput(scanner));
                if (divisor == 0)
                    throw new DivisionPorCeroException("División por cero NO permitida. Introduzca otro divisor.");
                correctDivisor = true;
                division(dividend, divisor);
            } catch (DivisionPorCeroException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        } while (!correctDivisor);


    }

    private void division(int dividend, int divisor) {
        System.out.println(dividend + "/" + divisor + " = " + (double) dividend / divisor);
    }

    private String userInput(Scanner scanner) {
        return scanner.nextLine();
    }
}

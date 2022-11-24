import java.util.Scanner;

public class Ejercicio5U3 {
    public static void main(String[] args) {
        int[] listOfNumbers = new int[100];
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int arrayPosition = 0;
        int inferiorNumber;
        System.out.println("A continuación se le van a solicitar la entrada de varios números. Si desea finalizar la entrada" +
                "de números pulse 0 y se procederá a ordenar los números introducidos.");

        /*
            Se pide al usuario una entrada de números que se almacenan en un array hasta que introduce un 0.
            Se puede hacer con un bucle for también, pero por utilizar varios bucles a nivel didáctico he optado por
            utilizar un do-while aquí.
         */
        do{
            System.out.print("Por favor, elija un número o pulse 0 para finalizar:");
            userInput = scanner.nextInt();
            listOfNumbers[arrayPosition] = userInput;
            arrayPosition++;
        }while(userInput != 0);
        for (int i = 0; i < listOfNumbers.length; i++) {
            for (int j = i; j < listOfNumbers.length; j++) {
                if(listOfNumbers[i] > listOfNumbers[j]){
                    inferiorNumber = listOfNumbers[j];
                    listOfNumbers[j] = listOfNumbers[i];
                    listOfNumbers[i] = inferiorNumber;
                }
            }
        }
        System.out.println("Los números que has introducido, ordenados de menor a mayor, son:");
        boolean zeroFounded = false;
        for (int i = 0; i < listOfNumbers.length; i++) {
            if(!zeroFounded && listOfNumbers[i] == 0){
                zeroFounded = true;
                System.out.print(listOfNumbers[i] + ", ");
            }
            if(listOfNumbers[i] != 0){
                if (i == (listOfNumbers.length - 1)) {
                    System.out.print(listOfNumbers[i]);
                } else {
                    System.out.print(listOfNumbers[i] + ", ");
                }
            }
        }
    }
}
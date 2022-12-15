import java.util.Scanner;

public class CambioBase {
    public static void main(String[] args) {
        CambioBase cambioBase = new CambioBase();
        cambioBase.executeProgram();
    }

    private void executeProgram(){
        showWelcome();
        showInstructions();
        int decimalNumber = getUserInput();
        boolean isNegative = checkNegativeInput(decimalNumber);
        if (isNegative) {
            decimalNumber *= -1;
        }
        String binaryNumber = baseExchanger(decimalNumber);
        String binaryNumberThirtyTwoBits = representationTransform(binaryNumber);
        if (isNegative) {
            binaryNumberThirtyTwoBits = twosComplementNegative(binaryNumberThirtyTwoBits);
            decimalNumber *= -1;
        }
        showResult(binaryNumberThirtyTwoBits, decimalNumber);
    }

    private void showWelcome(){
        System.out.println(" ____                   _____          _                                 \n" +
                " | __ )  __ _ ___  ___  | ____|_  _____| |__   __ _ _ __   __ _  ___ _ __ \n" +
                " |  _ \\ / _` / __|/ _ \\ |  _| \\ \\/ / __| '_ \\ / _` | '_ \\ / _` |/ _ \\ '__|\n" +
                " | |_) | (_| \\__ \\  __/ | |___ >  < (__| | | | (_| | | | | (_| |  __/ |   \n" +
                " |____/ \\__,_|___/\\___| |_____/_/\\_\\___|_| |_|\\__,_|_| |_|\\__, |\\___|_|   \n" +
                "                                                          |___/           ");
        System.out.println();
        System.out.println("Le damos la bienvenida a nuestro sistema de cambio de base. A continuación " +
                "le indicamos las instrucciones de uso del sistema.");
    }

    private void showInstructions () {
        System.out.print("Por favor, introduce un número entero para ser convertido a binario: ");
    }

    private int getUserInput(){
        Scanner scanner = new Scanner(System.in);
        int userInputNumber = scanner.nextInt();
        return userInputNumber;
    }

    private boolean checkNegativeInput(int decimalNumber) {
        if (decimalNumber < 0) {
            return true;
        } else {
            return false;
        }
    }
    private String baseExchanger(int decimalNumber) {
        String conversionRemainders = "";
        String decimalToBinary = "";
        do {
            if (decimalNumber > 1) {
                conversionRemainders += Integer.toString(decimalNumber % 2);
                decimalNumber /= 2;
            }
            if (decimalNumber <= 1) {
                conversionRemainders += Integer.toString(decimalNumber);
            }
        } while (decimalNumber > 1);
        for (int i = conversionRemainders.length() - 1; i >= 0; i--) {
            decimalToBinary += conversionRemainders.charAt(i);
        }
        return  decimalToBinary;
    }

    private String representationTransform(String binaryNumber){
        String binaryNumberZerosAdded = "";
        int spacesBetweenZeros = 0;
        for (int i = 0; i < (32 - binaryNumber.length()); i++) {
            binaryNumberZerosAdded += "0";
        }
        binaryNumberZerosAdded += binaryNumber;
        StringBuilder stringBuilder = new StringBuilder(binaryNumberZerosAdded);
        //  39 es la longitud de la cadena teniendo en cuenta los 32bits representados en 8 grupos de 4 más los espacios
        // 0000 0000 0000 0000 0000 0000 0000 0000 --> 39 caracteres.
        for (int i = 0; i < 39; i++) {
            if(i > 0 && i < (39 - 4) && i % 4 == 0) {
                stringBuilder.insert(i + spacesBetweenZeros, " ");
                spacesBetweenZeros++; // necesitamos controlar la cantidad de espacios que vamos añadiendo para crear grupos de 4bits correctamente.
            }
        }
        return stringBuilder.toString();


    }

    private String twosComplementNegative(String binaryNumberThirtyTwoBits) {
        StringBuilder stringBuilder = new StringBuilder(binaryNumberThirtyTwoBits);
        boolean carryOne = false;
        for (int i = 0; i < binaryNumberThirtyTwoBits.length(); i++) {
            if (stringBuilder.charAt(i) == '0') {
                stringBuilder.setCharAt(i, '1');
            } else if (stringBuilder.charAt(i) == '1') {
                stringBuilder.setCharAt(i, '0');
            }
        }

        for (int i = stringBuilder.length() - 2; i >= 0; i--) {
            if (stringBuilder.charAt(stringBuilder.length()-2) == '1' && i == stringBuilder.length()-2) {
                stringBuilder.setCharAt(i,'0');
                carryOne = true;
            } else if(stringBuilder.charAt(stringBuilder.length()-2) == '0' && i == stringBuilder.length()-2){
                stringBuilder.setCharAt(i,'1');

            }
            if (i < stringBuilder.length() - 2 && stringBuilder.charAt(i) == '0' && carryOne) {
                stringBuilder.setCharAt(i, '1');
                carryOne = false;
            } else if (i < stringBuilder.length() - 2 && stringBuilder.charAt(i) == '1' && carryOne) {
                stringBuilder.setCharAt(i, '0');
            }

        }
        return stringBuilder.toString();
    }
    private void showResult(String binaryNumber, int decimalNumber) {
        System.out.println("\nEl número en decimal --> " + decimalNumber + ", en binario equivale a (formato 32bits): \n");
        System.out.println("--> " + binaryNumber);
    }
}
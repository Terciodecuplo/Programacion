import com.sun.source.doctree.SystemPropertyTree;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Morse {
    /*
        *****************************************************************************
        *    IMPORTANTE:                                                            *
        *    Para un correcto visionado del programa, recomiendo ejecutarlo         *
        *    directamente desde la terminal del sistema y no desde la terminal      *
        *    integrada en el IDE, dado que normalmente estas terminales no tienen   *
        *    las funciones de refresco que utilizo aquí.                            *
        *****************************************************************************
        *
     */
    private final String[] MORSE_CODIFICATION =
            {"_____",   //Equivalente a 0
            ".____",    //Equivalente a 1
            "..___",    //Equivalente a 2
            "...__",    //Equivalente a 3
            "...._",    //Equivalente a 4
            ".....",    //Equivalente a 5
            "_....",    //Equivalente a 6
            "__...",    //Equivalente a 7
            "___..",    //Equivalente a 8
            "____."};   //Equivalente a 9

    private final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Morse morse = new Morse();
        morse.executeProgram();
    }

    private void executeProgram() {
        char userWantsToContinue;
        do {
            showHeader();
            int numberToConvert = Integer.parseInt(askForANumberToConvert());
            String morseNumber = convierteEnMorse(numberToConvert);
            showResult(numberToConvert, morseNumber);
            userWantsToContinue = askUserToContinue();
        }while(userWantsToContinue == 'y');
        System.out.println("\n\n¡¡Hasta luego!!");
        scanner.close();
    }

    private void showHeader(){
        String osName = getOperatingSystemName();
        clearConsole(osName);
        System.out.println(".___  ___.   ______   .______          _______. _______      ______   ______    _______   __   _______  __    ______     ___   .___________.  ______   .______      \n" +
                "|   \\/   |  /  __  \\  |   _  \\        /       ||   ____|    /      | /  __  \\  |       \\ |  | |   ____||  |  /      |   /   \\  |           | /  __  \\  |   _  \\     \n" +
                "|  \\  /  | |  |  |  | |  |_)  |      |   (----`|  |__      |  ,----'|  |  |  | |  .--.  ||  | |  |__   |  | |  ,----'  /  ^  \\ `---|  |----`|  |  |  | |  |_)  |    \n" +
                "|  |\\/|  | |  |  |  | |      /        \\   \\    |   __|     |  |     |  |  |  | |  |  |  ||  | |   __|  |  | |  |      /  /_\\  \\    |  |     |  |  |  | |      /     \n" +
                "|  |  |  | |  `--'  | |  |\\  \\----.----)   |   |  |____    |  `----.|  `--'  | |  '--'  ||  | |  |     |  | |  `----./  _____  \\   |  |     |  `--'  | |  |\\  \\----.\n" +
                "|__|  |__|  \\______/  | _| `._____|_______/    |_______|    \\______| \\______/  |_______/ |__| |__|     |__|  \\______/__/     \\__\\  |__|      \\______/  | _| `._____|");
    }

    private String getOperatingSystemName(){
        return System.getProperty("os.name");
    }

    private void clearConsole(String osName){
        try {
            if (osName.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getUserInput() { // ¿cómo pongo el scanner.close()???? me salta excepción.
        String userInput = scanner.next();
        return userInput;
    }

    private String askForANumberToConvert(){
        System.out.print("\n\nIntroduce un número entero para convertir a Morse: ");
        return getUserInput();

    }

    private String convierteEnMorse (int numberToConvert){
        int partOfTheNumber;
        if (numberToConvert < 10) {
            return MORSE_CODIFICATION[numberToConvert];
        } else {
            partOfTheNumber = numberToConvert % 10;
            numberToConvert /= 10;
            return convierteEnMorse(numberToConvert)+MORSE_CODIFICATION[partOfTheNumber];
        }
    }
    private void showResult(int numberToConvert, String morseNumber){
        System.out.println("El número introducido ha sido el " + numberToConvert + " , el cual, tranformado a morse es :" +
                "\n" + morseNumber);
    }

    private char askUserToContinue() {
        System.out.print("\n\n¿Quieres convertir otro número? (pulsa 'y' para repetir o cualquier tecla para salir.): ");
        return getUserInput().toLowerCase().charAt(0);
    }

}

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        showHeader();
        swapingSystem();
    }

    public static void showHeader(){
        System.out.println("  ____                     _               _   _                 _                   \n" +
                " / ___|_      ____ _ _ __ (_)_ __   __ _  | \\ | |_   _ _ __ ___ | |__   ___ _ __ ___ \n" +
                " \\___ \\ \\ /\\ / / _` | '_ \\| | '_ \\ / _` | |  \\| | | | | '_ ` _ \\| '_ \\ / _ \\ '__/ __|\n" +
                "  ___) \\ V  V / (_| | |_) | | | | | (_| | | |\\  | |_| | | | | | | |_) |  __/ |  \\__ \\\n" +
                " |____/ \\_/\\_/ \\__,_| .__/|_|_| |_|\\__, | |_| \\_|\\__,_|_| |_| |_|_.__/ \\___|_|  |___/\n" +
                "                    |_|            |___/                                             ");
    }

    public static void swapingSystem(){
        int numberOne, numberTwo, auxVariable;
        System.out.println("Gave me two numbers and let me show you how I change their variables: ");
        System.out.println("Number one: ");
        Scanner userInput = new Scanner(System.in);
        numberOne = userInput.nextInt();
        System.out.println("Number two: ");
        numberTwo = userInput.nextInt();
        System.out.println("Ok, so your first number IS "+numberOne+ " and your second number IS "+numberTwo);
        auxVariable = numberOne;
        numberOne = numberTwo;
        numberTwo = auxVariable;
        System.out.println("Or... maybe should I say WAS? Because NOW your first number is " +numberOne+" and your second number is " +numberTwo);
        System.out.println("VOILÁ!!!");
    }
}

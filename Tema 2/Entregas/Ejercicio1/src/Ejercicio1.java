import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        showHeader();
        doCalculations();
    }

    public static void showHeader(){
        System.out.println("  _   _                 _                  ___                       _   _                 \n" +
                " | \\ | |_   _ _ __ ___ | |__   ___ _ __   / _ \\ _ __   ___ _ __ __ _| |_(_) ___  _ __  ___ \n" +
                " |  \\| | | | | '_ ` _ \\| '_ \\ / _ \\ '__| | | | | '_ \\ / _ \\ '__/ _` | __| |/ _ \\| '_ \\/ __|\n" +
                " | |\\  | |_| | | | | | | |_) |  __/ |    | |_| | |_) |  __/ | | (_| | |_| | (_) | | | \\__ \\\n" +
                " |_| \\_|\\__,_|_| |_| |_|_.__/ \\___|_|     \\___/| .__/ \\___|_|  \\__,_|\\__|_|\\___/|_| |_|___/\n" +
                "                                               |_|                                         ");
        System.out.println("Welcome to the ultimate calculation system.");
    }
    public static void doCalculations(){
        float firstNumber, secondNumber;
        System.out.print("First of all, I need you to give me the first number to work with (you can use decimals): ");
        Scanner userInput = new Scanner(System.in);
        firstNumber = userInput.nextFloat();
        System.out.print("Ok, ok, I got it. Now I need you to give me a second number! (you can keep using decimals): ");
        secondNumber = userInput.nextFloat();
        System.out.println("That's it!!... Let's the magic begin!!");
        System.out.println("The sum of these numbers is: " + (firstNumber + secondNumber));
        System.out.println("The subtraction of these numbers is: " + (firstNumber - secondNumber));
        System.out.println("The product of these numbers is: " + (firstNumber * secondNumber));
        System.out.println("The division of these numbers is: " + (firstNumber / secondNumber));
        System.out.println("The remainder of these numbers is: " + (firstNumber % secondNumber));
    }
}
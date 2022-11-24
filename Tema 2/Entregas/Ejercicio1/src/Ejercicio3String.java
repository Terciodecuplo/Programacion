import java.util.Scanner;
public class Ejercicio3String {
    public static void main(String [] args){
        showHeader();
        upsideDownNumber();

    }

    public static void showHeader(){
        System.out.println(" __   __  _______  _______  ___   ______   _______    ______   _______  _     _  __    _ \n" +
                "|  | |  ||       ||       ||   | |      | |       |  |      | |       || | _ | ||  |  | |\n" +
                "|  | |  ||    _  ||  _____||   | |  _    ||    ___|  |  _    ||   _   || || || ||   |_| |\n" +
                "|  |_|  ||   |_| || |_____ |   | | | |   ||   |___   | | |   ||  | |  ||       ||       |\n" +
                "|       ||    ___||_____  ||   | | |_|   ||    ___|  | |_|   ||  |_|  ||       ||  _    |\n" +
                "|       ||   |     _____| ||   | |       ||   |___   |       ||       ||   _   || | |   |\n" +
                "|_______||___|    |_______||___| |______| |_______|  |______| |_______||__| |__||_|  |__|");
        System.out.println("Welcome to the amazingly efficient UPSIDE DOWN number format.");
    }

    public static void upsideDownNumber() {
        System.out.println("Please, choose a 5-digit number. Then I'll going to write it backwards.");
        System.out.println("Why!!?? 'Cause it's fun =)");
        String originalNumber, numberBackwards = "";
        char optionInput = ' ';
        boolean correctInput = false;
        Scanner userOptionInput = new Scanner(System.in);
        Scanner userNumberInput = new Scanner(System.in);
        do{
            System.out.print("Which number will you choose?: ");
            do {
                originalNumber = userNumberInput.next();
                if (originalNumber.length() != 5) {
                    System.out.println("You have to enter a 5-digit number ONLY!");
                    System.out.print("Please, choose a number again: ");
                } else {
                    try {
                        int isNumber = Integer.parseInt(originalNumber);
                        correctInput = true;
                    } catch (NumberFormatException nfe) {
                        System.out.println("You have to enter only NUMBERS, no other characters are allowed.");
                        System.out.print("Please, choose a number again: ");
                        correctInput = false;
                    }
                }
            } while (!correctInput);
            correctInput = false;
            for (int i = originalNumber.length() - 1; i > -1; i--) {
                numberBackwards += originalNumber.charAt(i);
            }
            System.out.println("Your number backwards is: " + numberBackwards);
            numberBackwards = "";
            System.out.println("Do you want to introduce another number?");
            System.out.print("y or n: ");
            do {
                optionInput = userOptionInput.next().charAt(0);
                if((optionInput != 'y' && optionInput!='Y') && (optionInput != 'n' && optionInput != 'N')){
                    System.out.print("Your choice is not valid. Please choose 'y' or 'n': ");
                }
            } while ((optionInput != 'y' && optionInput!='Y') && (optionInput != 'n' && optionInput != 'N'));
        } while(optionInput == 'y' || optionInput == 'Y');
    }
}

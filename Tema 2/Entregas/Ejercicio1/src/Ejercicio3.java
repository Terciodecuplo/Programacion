import java.util.Scanner;

public class Ejercicio3 {
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



    public static void upsideDownNumber(){
        System.out.println("Please, choose a 5-digit number. It shouldn't start or end by zero. Then I'll going to write it backwards.");
        System.out.println("Why!!?? 'Cause it's fun =)");
        int originalNumber = 0;
        int backwardNumber = 0;
        int totalOfCyphers = 0;
        boolean numberCondition;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Which number do you choose?: ");
            int maxNumberAllowed = 99999;
            int minNumberAllowed = 10000;
            if (scanner.hasNextInt()) {
                originalNumber = scanner.nextInt();
                if(originalNumber < 0){
                    originalNumber = Math.abs(originalNumber);
                }
                if (originalNumber > maxNumberAllowed) {
                    System.out.println("Your number has more than 5 digits. Please try a new one.");
                    numberCondition = false;
                } else if (originalNumber < minNumberAllowed) {
                    System.out.println("Your number your number has 5 digits but starts by zero or has less than 5 digits. Please try a new one.");
                    numberCondition = false;
                } else if ((originalNumber%10)==0) {
                    System.out.println("Your number ends by zero. Please try a new one.");
                    numberCondition = false;
                } else{
                    numberCondition = true;
                }
            } else{
                System.out.println("Your input is not valid. Only numbers are allowed. Please, re-enter your number.");
                numberCondition = false;
            }
        }while(!numberCondition);
        for(int i = 10; (originalNumber/i) >= 1; i = i*10){
            totalOfCyphers++;
        }
        do{
            if(totalOfCyphers > 0) {
                backwardNumber += (int) Math.pow(10, totalOfCyphers) * (originalNumber % 10);
                originalNumber = originalNumber / 10;
            } else {
                backwardNumber += originalNumber;
            }
            totalOfCyphers--;

        }while(totalOfCyphers  != -1);
        System.out.println("Now the backward number is " + backwardNumber);
        System.out.println("FUN ISN'T IT!!! 😃");

    }
}

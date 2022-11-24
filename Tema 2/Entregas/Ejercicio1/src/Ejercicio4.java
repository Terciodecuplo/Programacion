import java.util.Scanner;

class TimeContainer {
    private final int hours;
    private final int minutes;
    private final int seconds;

    public TimeContainer(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
public class Ejercicio4 {
    public static void main(String[] args) {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        ejercicio4.showHeader();
        ejercicio4.showProgramInfo();

        int userInput;
        userInput = ejercicio4.getUserInput();
        TimeContainer timeContainer = ejercicio4.timeExchanger(userInput);
        ejercicio4.showResult(timeContainer, userInput);

    }

    public void showHeader(){
        System.out.println("  _____ _                  _____          _                                 \n" +
                " |_   _(_)_ __ ___   ___  | ____|_  _____| |__   __ _ _ __   __ _  ___ _ __ \n" +
                "   | | | | '_ ` _ \\ / _ \\ |  _| \\ \\/ / __| '_ \\ / _` | '_ \\ / _` |/ _ \\ '__|\n" +
                "   | | | | | | | | |  __/ | |___ >  < (__| | | | (_| | | | | (_| |  __/ |   \n" +
                "   |_| |_|_| |_| |_|\\___| |_____/_/\\_\\___|_| |_|\\__,_|_| |_|\\__, |\\___|_|   \n" +
                "                                                            |___/           ");
    }
    public void showProgramInfo(){
        System.out.println("Welcome to TIME EXCHANGER.");
        System.out.print("Please enter a number of seconds: ");
    }

    public int getUserInput(){
        int userInput = 0;
        boolean correctInput = false;
        do{
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()){
                userInput = scanner.nextInt();
                correctInput = true;
            } else{
                System.out.print("Only numbers are allowed. Please re-enter your seconds: ");
                correctInput = false;
            }
        }while(!correctInput);
        userInput = Math.abs(userInput);
        return userInput;
    }

    public TimeContainer timeExchanger(int userInput){
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int secondsExchanger = userInput;
        if((secondsExchanger < 60)){
            seconds = secondsExchanger;
        } else{
            seconds = secondsExchanger % 60;
            minutes = secondsExchanger / 60;
            secondsExchanger /= 60;
            if(secondsExchanger > 59){
                minutes = secondsExchanger % 60;
                hours = secondsExchanger / 60;
            }
        }
        return new TimeContainer(hours, minutes, seconds);
    }

    public void showResult(TimeContainer timeContainer, int userInput){
        System.out.printf("%ds are equivalent to %dhours, %dminutes, %dseconds.", userInput, timeContainer.getHours(),
                timeContainer.getMinutes(), timeContainer.getSeconds());
        System.out.println();
        String hours = Integer.toString(timeContainer.getHours());
        String minutes = Integer.toString(timeContainer.getMinutes());
        String seconds = Integer.toString(timeContainer.getSeconds());
        if(timeContainer.getHours() < 10){
            hours = "0" + timeContainer.getHours();
        }
        if(timeContainer.getMinutes() < 10){
            minutes = "0" + timeContainer.getMinutes();
        }
        if(timeContainer.getSeconds() < 10){
            seconds = "0" + timeContainer.getSeconds();
        }
        System.out.printf("Or if you prefer it, %ds = %s:%s:%s", userInput, hours,
                minutes, seconds);
    }
}

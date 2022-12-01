import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EstacionMeteorologica {
    //Declaración de constantes
    static final int ARRAY_SIZE = 24;
    static final int T_MIN = 0;
    static final int T_MAX = 40;

    public static void main(String[] args) {
        char userSelection;
        int[] temperatures = new int[ARRAY_SIZE];
        boolean arrayIsEmpty = true;    //Si el array está vacío no se podrán mostrar u operar con los datos.
        showHeader();
        do {
            showMenu();
            userSelection = getUserInput();
            if(arrayIsEmpty) {  //Una vez el usuario pulse la opción para introducir datos, estos podrán mostrarse siempre.
                if (userSelection == 'a' || userSelection == 'A' || userSelection == 'b' || userSelection == 'B') {
                    arrayIsEmpty = false;
                }
            }
            userSelectedOption(userSelection, temperatures, arrayIsEmpty);
        }while(userSelection != 'f' && userSelection != 'F');
    }

    public static void showHeader(){
        System.out.println("  __  __      _               ____            _     _              \n" +
                " |  \\/  | ___| |_ ___  ___   |  _ \\ ___  __ _(_)___| |_ _ __ _   _ \n" +
                " | |\\/| |/ _ \\ __/ _ \\/ _ \\  | |_) / _ \\/ _` | / __| __| '__| | | |\n" +
                " | |  | |  __/ ||  __/ (_) | |  _ <  __/ (_| | \\__ \\ |_| |  | |_| |\n" +
                " |_|  |_|\\___|\\__\\___|\\___/  |_| \\_\\___|\\__, |_|___/\\__|_|   \\__, |\n" +
                "                                        |___/                |___/ ");
        System.out.println("Bienvenido/a al registro de temperaturas más famoso de la UEM.");
    }

    public static void showMenu(){
        System.out.println("Por favor, introduzca una de las siguientes opciones disponibles para continuar (a - f):");
        System.out.println();
        System.out.println("a) Rellenar el vector de forma manual.");
        System.out.println("b) Rellenar el vector de forma aleatoria.");
        System.out.println("c) Mostrar datos.");
        System.out.println("d) Obtener máximos y mínimos.");
        System.out.println("e) Temperatura media.");
        System.out.println("f) Salir del programa.");
    }

    public static char getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Su elección: ");
        char userInput = scanner.next().charAt(0);
        System.out.println();
        return userInput;

    }
    //Accedemos a las diferentes opciones del menú en función de lo que el usuario haya pulsado.
    public static void userSelectedOption(char userSelection, int[] temperatures, boolean arrayIsEmpty){
        switch (userSelection){
            case 'a', 'A':
                manualArrayFilling(temperatures);
                break;
            case 'b', 'B':
                randomArrayFilling(temperatures);
                break;
            case 'c', 'C':
                if (arrayIsEmpty) {
                    System.out.println("Los datos están vacíos. Por favor introduzca los datos correspondientes primero.");
                } else {
                    showArrayData(temperatures);
                }
                break;
            case 'd', 'D':
                if (arrayIsEmpty) {
                    System.out.println("Los datos están vacíos. Por favor introduzca los datos correspondientes primero.");
                } else {
                    showMaxMinTemps(temperatures);
                }
                break;
            case 'e', 'E':
                if (arrayIsEmpty) {
                    System.out.println("Los datos están vacíos. Por favor introduzca los datos correspondientes primero.");
                } else {
                    showAverageTemp(temperatures);
                }
                break;
            case 'f', 'F':
                System.out.println("Gracias por usar Meteo Registry.");
                System.out.println("Fin de programa.");
                break;
            default:
                System.out.println("Opción incorrecta. Por favor introduzca una opción de la 'a' a la 'f'.");
                break;
        }
        System.out.println();
        System.out.println("******************************************");
        System.out.println();
    }

    public static void manualArrayFilling(int[] temperatures){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ha seleccionado la opción 'INTRODUCIR DATOS MANUALMENTE'.");
        System.out.println("Por favor introduzca los datos según se le vayan solicitando");
        System.out.println();
        for (int i = 0; i < temperatures.length; i++) {
            if (i < 10){
                System.out.print("Introduzca la temperatura de las 0" + i + " horas: ");
            } else {
                System.out.print("Introduzca la temperatura de las " + i + " horas: ");
            }
            temperatures[i] = scanner.nextInt();
        }
        System.out.println("DATOS COMPLETOS.");
    }

    public static void randomArrayFilling(int[] temperatures){
        System.out.println("Ha seleccionado la opción 'INTRODUCIR DATOS ALEATORIAMENTE'.");
        System.out.println();
        System.out.println();
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = (int) (Math.random() * (T_MAX - T_MIN + 1) + T_MIN);
        }
        try{
            showWaitingMsg() ;
        }catch (InterruptedException e) {
        }
    }
    //Este método simula el tiempo de procesamiento que llevaría la introducción de los datos.
    //Actualmente espera entorno a 5 segundos.
    public static void showWaitingMsg() throws InterruptedException {
        System.out.print(" --------> RELLENANDO DATOS ESPERE");
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("DATOS COMPLETOS");
    }

    public static void showArrayData(int[] temperatures){
        System.out.println("Ha seleccionado la opción 'MOSTRAR DATOS'.");
        System.out.println();
        System.out.println();
        for (int i = 0; i < temperatures.length; i++) {
            if (i < 10) {
                System.out.println("Hora 0" + i + ":00 - Temperatura --> " + temperatures[i] + "ºC");
            } else {
                System.out.println("Hora " + i + ":00 - Temperatura --> " + temperatures[i] + "ºC");
            }
        }
    }

    public static void showMaxMinTemps(int[] temperatures){
        int minDayTemp = T_MAX;
        int maxDayTemp = T_MIN;
        int minDayTempHour = 0;
        int maxDayTempHour = 0;
        System.out.println("Ha selecciónado la opción 'OBTENER TEMPERATURA MÍNIMA Y MÁXIMA'.");
        System.out.println();
        for (int i = 0; i < temperatures.length; i++) {
            if (i == 0) {
                minDayTemp = temperatures[i];
                maxDayTemp = temperatures[i];
                minDayTempHour = i;
                maxDayTempHour = i;
            } else {
                if (temperatures[i] < minDayTemp) {
                    minDayTemp = temperatures[i];
                    minDayTempHour = i;
                }
                if (temperatures[i] > maxDayTemp) {
                    maxDayTemp = temperatures[i];
                    maxDayTempHour = i;
                }
            }
        }
        if (minDayTempHour < 10) {
            System.out.println("La temperatura mínima del día ha sido " + minDayTemp + "ºC a las 0" + minDayTempHour + ":00 horas.");
        } else {
            System.out.println("La temperatura mínima del día ha sido " + minDayTemp + "ºC a las " + minDayTempHour + ":00 horas.");
        }
        if (maxDayTempHour < 10) {
            System.out.println("La temperatura máxima del día ha sido " + maxDayTemp + "ºC a las 0" + maxDayTempHour + ":00 horas.");
        } else {
            System.out.println("La temperatura máxima del día ha sido " + maxDayTemp + "ºC a las " + maxDayTempHour + ":00 horas.");
        }
    }

    public static void showAverageTemp(int[] temperatures){
        float averageTemp = 0.0f;
        System.out.println("Ha seleccionado la opción 'TEMPERATURA MEDIA'.");
        System.out.println();
        for (int i = 0; i < temperatures.length; i++) {
            averageTemp += temperatures[i];
        }
        averageTemp = Math.round(averageTemp/temperatures.length); //Mostramos un redondeo
        System.out.println("La temperatura media del día es de " + (int)averageTemp +"ºC.");
    }
}

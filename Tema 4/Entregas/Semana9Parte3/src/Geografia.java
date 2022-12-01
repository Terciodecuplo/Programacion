import java.util.Scanner;

public class Geografia {

    //Declaramos los valores de las constantes para definir el tamaño del array.
    static final int COUNTY_ARRAY_SIZE = 4;
    static final int CITIES_ARRAY_SIZE = 4;

    public static void main(String[] args) {
        String[][] territory = new String[COUNTY_ARRAY_SIZE][CITIES_ARRAY_SIZE];
        Scanner scanner = new Scanner(System.in);
        System.out.println("A continuación se le van a pedir unos territorios. Introdúzcalos según se le vayan requiriendo.");
        //Introducimos los datos en cada posición del array.
        for (int i = 0; i < territory.length; i++){
            System.out.print("Introduzca la " + (i + 1) + "ª provincia: ");
            territory[i][0] = scanner.nextLine();
            for (int j = 1; j < territory[i].length; j++) {
                System.out.print("Introduzca la " + j + "ª ciudad: ");
                territory[i][j] = scanner.nextLine();
            }
        }
        //Recorremos el array y vamos mostrando los datos almacenados.
        for (int i = 0; i < territory.length; i++) {
            System.out.print("Provincia: " + territory[i][0] + " ");
            System.out.print("Ciudades: ");
            for (int j = 1; j < territory[i].length; j++) {
                System.out.print(territory[i][j] + " ");
            }
            System.out.println();
        }
    }
}

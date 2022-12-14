import java.text.DecimalFormat;
import java.util.Scanner;

public class OperaMatriz {
    static final int ROWS = 4;
    static final int COLUMNS = 4;
    public static void main(String[] args) {
        int[][] matrix = new int[ROWS][COLUMNS];
        Scanner scanner = new Scanner(System.in);
        int userMenuSelection = 0;
        int userMatrixNumberInput = 0;
        int userRowOrColumnSelection = 0;
        int rowOrColumnAddition = 0;
        int diagonalMatrixAddition = 0;
        double average = 0;
        boolean matrixFilled = false;
        boolean endProgram = false;
        boolean operationIsDone;
        do{
            System.out.println("Por favor, elija una de las opciones siguientes: ");
            System.out.println("1- Rellenar matriz.");
            System.out.println("2- Sumar una fila de la matriz.");
            System.out.println("3- Sumar una columna de la matriz.");
            System.out.println("4- Sumar la diagonal principal de la matriz.");
            System.out.println("5- Sumar la diagonal inversa de la matriz.");
            System.out.println("6- Calcular la media de todos los valores de la matriz.");
            System.out.println("7- Salir del programa.");
            System.out.println();
            System.out.print("Su elección: ");
            userMenuSelection = scanner.nextInt();
            System.out.println();
            if (!matrixFilled && (userMenuSelection != 1 && userMenuSelection != 7)) {
                System.out.println("Por favor, rellene primero la matriz antes de operar con ella.");
                System.out.println();
            } else {
                operationIsDone = false;
                switch (userMenuSelection){
                    case 1:
                        System.out.println("RELLENAR MATRIZ.");
                        System.out.println();
                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[0].length; j++) {
                                System.out.print("Por favor, introduzca la posición [" + i + "][" + j + "] de la matriz: ");
                                userMatrixNumberInput = scanner.nextInt();
                                matrix[i][j] = userMatrixNumberInput;
                            }
                        }
                        System.out.println("La matriz introducida es:");
                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[0].length; j++) {
                                System.out.print(matrix[i][j]);
                                System.out.print(" ");
                            }
                            System.out.println();
                        }
                        matrixFilled = true;
                        break;
                    case 2:
                        System.out.println("SUMAR UNA FILA DE LA MATRIZ.");
                        System.out.println();
                        rowOrColumnAddition = 0;
                        do {
                            System.out.print("Por favor, elija una fila para ser sumada (1 - " + matrix.length + "): ");
                            userRowOrColumnSelection = scanner.nextInt();
                            if (userRowOrColumnSelection < 1 && userRowOrColumnSelection > matrix.length) {
                                System.out.println("La fila introducida no existe. Por favor, elija una entre 1 y " + matrix.length + ".");
                            } else {
                                userRowOrColumnSelection--;
                                operationIsDone = true;
                                for (int i = 0; i < matrix[0].length; i++) {
                                    rowOrColumnAddition += matrix[userRowOrColumnSelection][i];
                                }
                            }
                        } while (!operationIsDone);
                        System.out.println("El resultado de la suma de la fila seleccionada es: " + rowOrColumnAddition);
                        break;
                    case 3:
                        System.out.println("SUMAR UNA COLUMNA DE LA MATRIZ.");
                        System.out.println();
                        rowOrColumnAddition = 0;
                        do {
                            System.out.print("Por favor, elija una fila para ser sumada (1 - " + matrix[0].length + "): ");
                            userRowOrColumnSelection = scanner.nextInt();
                            if (userRowOrColumnSelection < 1 && userRowOrColumnSelection > matrix.length) {
                                System.out.println("La fila introducida no existe. Por favor, elija una entre 1 y " + matrix.length + ".");
                            } else {
                                userRowOrColumnSelection--;
                                operationIsDone = true;
                                for (int i = 0; i < matrix.length; i++) {
                                    rowOrColumnAddition += matrix[i][userRowOrColumnSelection];
                                }
                            }
                        } while (!operationIsDone);
                        System.out.println("El resultado de la suma de la columna seleccionada es: " + rowOrColumnAddition);
                        break;
                    case 4:
                        System.out.println("SUMAR LA DIAGONAL DE LA MATRIZ.");
                        System.out.println();
                        diagonalMatrixAddition = 0;
                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[0].length; j++) {
                                if (i == j) {
                                    diagonalMatrixAddition+=matrix[i][j];
                                }
                            }
                        }
                        System.out.println("El resultado de la suma de la diagonal es: " + diagonalMatrixAddition);
                        break;
                    case 5:
                        System.out.println("SUMAR LA DIAGONAL INVERSA DE LA MATRIZ.");
                        System.out.println();
                        diagonalMatrixAddition = 0;
                        // La diagonal inversa coincide cuando la suma de ambos contadores es igual
                        // a la longituda máxima del array UNIDIMENSIONAL. En este caso como para inicializar "i"
                        // tenemos que restarle 1 a length, en la condición del if se lo volvemos a sumar.
                        for (int i = matrix.length-1; i >= 0; i--) {
                            for (int j = 0; j < matrix[0].length; j++) {
                                if (i + j + 1 ==  matrix.length) {
                                    diagonalMatrixAddition += matrix[i][j];
                                }
                            }
                        }
                        System.out.println("El resultado de la suma de la diagonal inversa es: " + diagonalMatrixAddition);
                        break;
                    case 6:
                        System.out.println("SUMAR LA DIAGONAL INVERSA DE LA MATRIZ.");
                        System.out.println();
                        average = 0;
                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[0].length; j++) {
                                average += matrix[i][j];
                            }
                        }
                        average = average / (ROWS*COLUMNS);
                        DecimalFormat decimalFormat = new DecimalFormat("#.00");
                        System.out.println("El resultado de la media de la matriz es: " + decimalFormat.format(average));
                        break;
                    case 7:
                        endProgram = true;
                    default:
                        break;
                }
            }
        }while(!endProgram);
    }
}

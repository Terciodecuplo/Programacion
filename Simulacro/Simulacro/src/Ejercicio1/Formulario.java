package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Formulario {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        formulario.runProgram();
        scanner.close();
    }

    private void runProgram() {
        int userSelection;
        String[] formFields = new String[4];
        boolean formValidated = false;
        do {
            showMenu();
            userSelection = getUserSelection();
            fillForm(userSelection, formFields);
            if (userSelection == 5) {
                int filledFieldCounter = 0;
                for (int i = 0; i < formFields.length; i++) {
                    if (formFields[i] != null) {
                        filledFieldCounter++;
                    }
                }
                if (filledFieldCounter == 4) {
                    formValidated = true;
                }
            }
        } while (userSelection != 5 || !formValidated);
    }

    private void fillForm(int userSelection, String[] formFields) {

        switch (userSelection) {
            case 1:
                System.out.println("Introduce el nombre:");

                try {
                    formFields[0] = getText(userSelection);
                } catch (Exception e) {
                    System.out.println("Se capturado una excepción: " + e.getMessage());
                }
                break;
            case 2:
                System.out.println("Introduce los apellidos:");
                try {
                    formFields[1] = getText(userSelection);
                } catch (Exception e) {
                    System.out.println("Se capturado una excepción: " + e.getMessage());
                }
                break;
            case 3:
                System.out.println("Introduce el DNI.");
                try {
                    formFields[2] = getText(userSelection);
                } catch (Exception e) {
                    System.out.println("Se capturado una excepción: " + e.getMessage());
                }
                break;
            case 4:
                System.out.println("Introduce el e-mail.");
                try {
                    formFields[3] = getText(userSelection);
                } catch (Exception e) {
                    System.out.println("Se capturado una excepción: " + e.getMessage());
                }
                break;
            case 5:
                if (formFields[0] != null && formFields[1] != null &&
                        formFields[2] != null && formFields[3] != null) {

                    System.out.println("El formulario contiene:");
                    System.out.println("Nombre: " + formFields[0]);
                    System.out.println("Apellidos: " + formFields[1]);
                    System.out.println("DNI: " + formFields[2]);
                    System.out.println("E-Mail: " + formFields[3]);
                    System.out.println();
                    System.out.println("Programa finalizado. Hasta pronto.");
                } else {
                    System.out.println("Formulario incompleto. Por favor, rellene todos los campos para salir.");
                }
                break;
            default:
                System.out.println("Opción incorrecta. Elija un número del 1 al 5.");
                break;
        }
    }

    private String getText(int userSelection) throws Exception {
        String userTextInput = "";
        if (userSelection == 1 || userSelection == 2) {
            userTextInput = scanner.nextLine();
            for (int i = 0; i < userTextInput.length(); i++) {
                if (!Character.isLetter(userTextInput.charAt(i)))
                    throw new TipoDatoIncorrectoException("ERROR - El nombre no puede contener números.");
            }
            return userTextInput;
        } else if (userSelection == 3) {
            userTextInput = scanner.nextLine();
            if (userTextInput.length() != 9)
                throw new LongitudDNINOValidaException("ERROR - La longitud del DNI es incorrecta.");
            if (!Character.isLetter(userTextInput.charAt(8)))
                throw new UltimoDigitoNoLetraException("ERROR - El DNI no contiene letra.");
            for (int i = 0; i < userTextInput.length() - 1; i++) {
                if (!Character.isDigit(userTextInput.charAt(i)))
                    throw new NumeracionContieneLetrasException("ERROR - El formato del DNI es incorrecto (8 números + 1 letra).");
            }
            return userTextInput;
        } else if (userSelection == 4) {
            userTextInput = scanner.nextLine();
            if (!userTextInput.contains("@") && !userTextInput.contains("."))
                throw new EmailIncorrectoException("ERROR - El e-mail debe contener un símbolo @ y al menos un punto (.).");
            return userTextInput;
        } else {
            return userTextInput;
        }
    }

    private int getUserSelection() {
        int userSelection;
        try {
            userSelection = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("ERROR - Solo números enteros. Su elección: ");
            scanner.nextLine();
            userSelection = getUserSelection();

        }
        return userSelection;
    }

    private void showMenu() {
        System.out.println("Seleccione una opción de las siguientes:");
        System.out.println("1. Rellenar nombre.");
        System.out.println("2. Rellenar apellidos.");
        System.out.println("3. Rellenar DNI.");
        System.out.println("4. Rellenar e-mail.");
        System.out.println("5. Finalizar.");
        System.out.print("Su elección: ");
    }
}
